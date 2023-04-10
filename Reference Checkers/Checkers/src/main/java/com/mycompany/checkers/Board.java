
package com.mycompany.checkers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import com.mycompany.checkers.Game;

import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Austin Winters, Dakota Carpenter
 */
public class Board extends JFrame{
           public static LinkedList<CPiece> cp = new LinkedList<>();
//           public static CPiece selectedPiece = null;
           String[][] arr = new String[8][8];
           
           private int selectedRow = -1;
           private int selectedCol = -1;
           private int[][] board = {
        		   {1, 0, 1, 0, 1, 0, 1, 0},
        		   {0, 1, 0, 1, 0, 1, 0, 1},
        		   {1, 0, 1, 0, 1, 0, 1, 0},
        		   {0, 0, 0, 0, 0, 0, 0, 0},
        		   {0, 0, 0, 0, 0, 0, 0, 0},
        		   {0, 2, 0, 2, 0, 2, 0, 2},
        		   {2, 0, 2, 0, 2, 0, 2, 0},
        		   {0, 2, 0, 2, 0, 2, 0, 2},
           };
           
    public Board(){
        Game game = new Game();
          for(int i = 0; i < 8; i++ ){
              for(int j = 0; j<8; j++){
                  arr[j][i] = "O";
              
              }
          
          }
          //image array and images by Dakota Carpenter
           Image[] img = new Image[4];
           img[0] = Toolkit.getDefaultToolkit().getImage("images/piece_black.png");
           img[1] = Toolkit.getDefaultToolkit().getImage("images/piece_red.png");
           img[2] = Toolkit.getDefaultToolkit().getImage("images/piece_red_king.png");
           img[3] = Toolkit.getDefaultToolkit().getImage("images/piece_black_king.png");
          
            JFrame frame = new JFrame();
            frame.setBounds(10, 10, 526, 551);
            frame.setTitle("Checkers");
            
            // need to add an exit button and restart button to rebuild the board.
            //may be able to use esc key to exit game and a popup window to declare winner and restart.
            //JPanel for the displayable board and pieces by Austin Winters
            JPanel panel = new JPanel(){
                
                @Override
                public void paint(Graphics g){
                    
                	
                	boolean isred = true;
                	
                	for (int a = 0; a < board.length; a++) {
                		for (int b = 0; b < board[0].length; b++) {
                			
                			if ((a + b) % 2 == 0) {
                				g.setColor(Color.WHITE);
                			} else {
                				g.setColor(Color.BLACK);
                			}
                			
                			g.fillRect(b * 64, a * 64, 64, 64);
                			
                			if (board[a][b] == 1) {
                				CPiece p = new CPiece(b, a, true, cp);
                				g.setColor(Color.red);
                				g.fillOval(b * 64 + 16, a * 64 + 16, 32, 32);
                			} else if (board[a][b] == 2) {
                				CPiece p = new CPiece(b, a, false, cp);
                				g.setColor(Color.black);
                				g.fillOval(b * 64 + 16, a * 64 + 16, 32, 32);
                			} else if (board[a][b] == 0) {
                				g.setColor(Color.red);
//                				g.fillRect(a * 64, b * 64, 64, 64);
//                				System.out.println("Testing");
                			}
                			
                			if (a == selectedRow && b == selectedCol) {
                				g.setColor(Color.GREEN);
                				g.drawRect(b * 64, a * 64, 63, 63);
                			}
                			
//                			if (isred) {
//                				g.setColor(Color.white);
//                			} else {
//                				g.setColor(Color.black);
//                			}
                			
                			
//                			isred = !isred;
                			
                		}
                		
//                		isred = !isred;
                	}
                	
                	int ind = 0;
                	for(CPiece p : cp){
                        if(p.isRed()){
                            ind = 1;
                        
                        }
                        else{
                            ind = 0;
                        
                        }
//                        g.drawImage(img[ind], p.xpos * 64, p.ypos * 64, this);
                    
                    }
             
                }
            
            };
            
            frame.add(panel);
            
           frame.addMouseMotionListener(new MouseMotionListener() {
            
            	@Override
            	public void mouseDragged(MouseEvent e) {
//            		if (selectedPiece != null) {
//                               
//            			selectedPiece.setX(e.getX()-32);
//            			selectedPiece.setY(e.getY()-32);
//                                 frame.repaint();
//            		}
            	}
            	
            	@Override
            	public void mouseMoved(MouseEvent e) {
            		
            	}
            });

            frame.addMouseListener(new MouseListener() {
                int x;
                int y;
            	@Override
            	public void mouseClicked(MouseEvent e) {
            		//selectedPiece = getPiece(e.getX(), e.getY());
            		
            		int squareSize = 64;
            		int row = e.getY() / squareSize;
            		int col = e.getX() / squareSize;
            		
            		if (row < 0 || row >= 8 || col < 0 || col >= 8 ) {
            			return;
            		}
            		
            		if (selectedRow == -1 && board[row][col] != 0) {
            			selectedRow = row;
            			selectedCol = col;
            			repaint();
            		} else if (selectedRow != -1) {
            			board[row][col] = board[selectedRow][selectedCol];
            			board[selectedRow][selectedCol] = 0;
            			repaint();
            		} 
            		
            		repaint();
            		
            		System.out.println(Arrays.deepToString(board));
//            		System.out.println(arr[e.getX()/64][e.getY()/64]);
            	}
            	
            	@Override
            	public void mousePressed(MouseEvent e) {
//            		System.out.println(getPiece(e.getX(), e.getY()));
//                        x = e.getX() / 64;
//                        y = e.getY() / 64;
//            		selectedPiece = getPiece(e.getX(), e.getY());
                        
                        frame.repaint();
            	}
            	
            	@Override
            	public void mouseReleased(MouseEvent e) {
                      
//                    if(game.validMove((e.getX()/64), (e.getY()/64)) == true){
//                           
//                        if(arr[e.getX()/64][e.getY()/64].contains("O")){                      
//                          selectedPiece.move(e.getX() / 64, e.getY() / 64);
//                          
//                          arr[selectedPiece.getX()/64][selectedPiece.getY()/64] = selectedPiece.getColor();
//                            
//                          arr[x][y] = "O";
//                          
//                          if(game.destroyPiece(x, y, selectedPiece.getX()/64, selectedPiece.getY()/64) == true && arr[2][4].contains("R")){
//                              for(CPiece p: cp){
//                                  if((p.getX()/64) == 2 && (p.getY()/64) == 4){
//                                     
//                                      p.destroy();
//                                  
//                                  }
//                              
//                              }
//                          
//                          }
//                          
//                        }
//                        else{
//                            System.out.println(arr[selectedPiece.getX()/64][selectedPiece.getY()/64]);
//                        }
//                    }
//                    else{
//                        System.out.println("invalid move.");
//                    }
//                        System.out.println((selectedPiece.getX() / 64 )+","+ (selectedPiece.getY()/64));
//            		frame.repaint();
            	}
            	
            	@Override
            	public void mouseEntered(MouseEvent e) {
            		
            	}
            	
            	@Override
            	public void mouseExited(MouseEvent e) {
            		
            	}
            });
            frame.add(panel);
            frame.setDefaultCloseOperation(3);
            
            frame.setVisible(true);

     }
    public static CPiece getPiece(int x, int y) {
    	int xp = x / 64;
    	int yp = y / 64;
    	
    	for (CPiece p: cp) {
    		if ((p.getX() / 64) == xp && (p.getY() / 64) == yp) {
                    return p;
    		}
    	}
    	return null;
    }
    
//    private static class CheckersMove {
//    	int fromRow, fromCol;
//    	int toRow, toCol;
//    	CheckersMove(int r1, int c1, int r2, int c2) {
//    		fromRow = r1;
//    		fromCol = c1;
//    		toRow = r2;
//    		toCol = c2;
//    	}
//    }
 
          
            
        //    frame.setDefaultCloseOperation(3);            
          // frame.setVisible(true);
             

    
         
     }
    
    /*private JButton exit(){
            JButton endGame = new JButton();
    
            endGame.setPreferredSize(new Dimension(91, 25));
            //endGame.setMaximumSize(new Dimension(91, 25));
            endGame.setAlignmentX(10);
            endGame.setAlignmentY(-10);
            endGame.setVisible(true);
            return endGame;
    }*/
  

