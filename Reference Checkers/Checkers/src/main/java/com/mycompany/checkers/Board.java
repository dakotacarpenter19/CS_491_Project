
package com.mycompany.checkers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

//import java.util.Arrays;
//import com.mycompany.checkers.Game;

/**
 *
 * @author Austin Winters, Dakota Carpenter
 */
public class Board extends JFrame{
           public static LinkedList<CPiece> cp = new LinkedList<>();
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
            frame.setResizable(false);
            
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
                			}
                			
                			if (a == selectedRow && b == selectedCol) {
                				g.setColor(Color.GREEN);
                				g.drawRect(b * 64, a * 64, 63, 63);
                			}
                		}
                	}
                	
                	int ind = 0;
                	for(CPiece p : cp){
                        if(p.isRed()){
                            ind = 1;
                        }
                        else{
                            ind = 0;
                        }
                    }
                }
            };
            
            frame.add(panel);
            
           frame.addMouseMotionListener(new MouseMotionListener() {
            
            	@Override
            	public void mouseDragged(MouseEvent e) {}
            	
            	@Override
            	public void mouseMoved(MouseEvent e) {}
            });

            frame.addMouseListener(new MouseListener() {
                int x;
                int y;
            	@Override
            	public void mouseClicked(MouseEvent e) {
            		int squareSize = 64;
            		 int col, row;
                       
                             row = e.getY() / squareSize;
                             col = e.getX() / squareSize;
                        
                       if(game.validMove(col, row)){      
            		if (row < 0 || row >= 8 || col < 0 || col >= 8 ) {
            			return;
            		}
            		if (selectedRow == -1 && board[row][col] != 0) {
            			selectedRow = row;
            			selectedCol = col;
            		} else if (selectedRow != -1) {
            			board[row][col] = board[selectedRow][selectedCol];
            			board[selectedRow][selectedCol] = 0;
            			selectedRow = -1;
            			selectedCol = -1;
            		} 
                       }
            		frame.repaint();
//            		repaint();
            		
//            		System.out.println(Arrays.deepToString(board));
            	}
            	
            	@Override
            	public void mousePressed(MouseEvent e) {
                        frame.repaint();
            	}
            	
            	@Override
            	public void mouseReleased(MouseEvent e) {}
            	
            	@Override
            	public void mouseEntered(MouseEvent e) {}
            	
            	@Override
            	public void mouseExited(MouseEvent e) {}
            });
            
            frame.add(panel);
            frame.setDefaultCloseOperation(3);
            
            frame.setVisible(true);
     }
    
    // currently not used
    public static CPiece getPiece(int x, int y) {
		int xp = x / 64;
		int yp = y / 64;

		for (CPiece p : cp) {
			if ((p.getX() / 64) == xp && (p.getY() / 64) == yp) {
				return p;
			}
		}
		return null;
	}

//	private JButton exit() {
//		JButton endGame = new JButton();
//		endGame.setPreferredSize(new Dimension(91, 25));
//		endGame.setMaximumSize(new Dimension(91, 25));
//		endGame.setAlignmentX(10);
//		endGame.setAlignmentY(-10);
//		endGame.setVisible(true);
//		return endGame;
//	}

}