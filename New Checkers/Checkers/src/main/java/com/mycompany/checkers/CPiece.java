/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkers;

import java.util.LinkedList;

/**
 *
 * @author Austin Winters, Dakota Carpenter
 */
public class CPiece {
    private int ypos;
    private int xpos;
    private boolean isRed;
    private boolean isKing = false;
    String image;
    LinkedList<CPiece> cp;
    
    public CPiece(int xpos, int ypos, boolean isRed, LinkedList<CPiece> cp){
        this.xpos = xpos;
        this.ypos = ypos;
        this.isRed = isRed;
        this.cp = cp;
        cp.add(this);
        setImage(isRed);
    
    }
    public boolean isRed(){
    
        return isRed;
    
    }
    public int getX(){
    
    return xpos;
    }
    public int getY(){
    
        return ypos;
    }
    public void setKing(boolean x){
        
        this.isKing = x;
                
    }
    public boolean getKing(){
    
        return this.isKing;
    
    }
    public void move(int xp, int yp){
    
        //TODO add move function
        // needs to check for jumpable piece. Maybe add an isJumpable method? 
    
    }
    private void setImage(boolean x){
    
        if(x){
            
           image = "/images/piece_red.png";
            
        }
        else{
            
            image = "/images/piece_black.png";
        
        }
    
    }
    public String getImage(){
    
        return image;
    }
    public void destroy(){
        
        //need to add adjacent check to see if it is a legal jump.
        
        cp.remove(this);
        
    }
   
    
}
