/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkers;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author wincr
 */
public class Board {
    
    public Board(){
    
            JFrame frame = new JFrame();
            frame.setBounds(10, 10, 525, 625);
            
            JPanel panel = new JPanel(){
                
                @Override
                public void paint(Graphics g){
                    boolean isred = true;
                    for(int i = 0; i<8; i++){
                        for(int j = 0; j<8; j++){
                            if(isred){
                                g.setColor(Color.red);
                            
                            }
                            else{
                                g.setColor(Color.black);
                            
                            }
                            g.fillRect(i*64, j*64, 64, 64);
                            isred=!isred;
                            
                        }
                        isred=!isred;
                        
                    }
    
            }
    
            
            };
            frame.add(panel);
            frame.setDefaultCloseOperation(3);
            frame.setVisible(true);
    
    }
  
}
