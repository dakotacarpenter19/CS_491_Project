/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkers;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wincr
 */
public class Board extends JFrame{
    
    public Board(){
            LinkedList<CPiece> cp = new LinkedList<>();
           
           //BufferedImage all = ImageIO.read(new File("Pieces.png"));
          
           Image[] img = new Image[4];
           img[0] = Toolkit.getDefaultToolkit().getImage("images/piece_black.png");
           img[1] = Toolkit.getDefaultToolkit().getImage("images/piece_red.png");
           img[2] = Toolkit.getDefaultToolkit().getImage("images/piece_red_king.png");
           img[3] = Toolkit.getDefaultToolkit().getImage("images/piece_black_king.png");
        
          
              //System.out.println("images failed");
          
            JFrame frame = new JFrame();
            frame.setBounds(10, 10, 526, 551);
            
            // need to add an exit button and restart button to rebuild the board.
            //frame.add(exit());
           // CPiece p = new CPiece(5,2,true,cp);
            JPanel panel = new JPanel(){
                
                @Override
                public void paint(Graphics g){
                    
                   int ind = 0;
                    boolean isred = true;
                    for(int i = 0; i<8; i++){
                        for(int j = 0; j<8; j++){
                            if(isred){
                                if(i < 3){
                                   CPiece p = new CPiece(j, i, true, cp);
                                  // cp.add(p);
                                  // g.drawImage(img[1], i*64, j*64, this);
                                    
                                }
                                if(i>4){
                                    CPiece p = new CPiece(j, i,false,cp);
                                    //cp.add(p);
                                   // g.drawImage(img[0], i*64, j*64, this);
                                }
                               // g.drawImage(img[1], i, j, this);
                                g.setColor(Color.red);
                                
                            }
                            else{
                                //g.drawImage(img[0], i, j, this);
                                g.setColor(Color.black);
                                
                            }
                            
                            g.fillRect(i*64, j*64, 64, 64);
                            isred=!isred;
                            
                        }
                        isred=!isred;
                        
                    }
                    for(CPiece p : cp){
                        if(p.isRed()){
                            ind = 1;
                        
                        }
                        else{
                            ind = 0;
                        
                        }
                        g.drawImage(img[ind],p.getX()*64, p.getY()*64, this);
                    
                    }
    
            }
    
            
            };
            frame.add(panel);
          
            
            frame.setDefaultCloseOperation(3);
            
            frame.setVisible(true);
             
            //frame.getContentPane().setLayout(null);
            
           // frame.add(exit());
    
         
     }
    
    private JButton exit(){
            JButton endGame = new JButton();
    
            endGame.setPreferredSize(new Dimension(91, 25));
            //endGame.setMaximumSize(new Dimension(91, 25));
            endGame.setAlignmentX(10);
            endGame.setAlignmentY(-10);
            endGame.setVisible(true);
            return endGame;
    }
  
}
