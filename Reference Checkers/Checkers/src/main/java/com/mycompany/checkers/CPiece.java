
package com.mycompany.checkers;

import java.util.LinkedList;

/**
 * @author Austin Winters, Dakota Carpenter
 * overall not sure how much of this class is needed now since most of the piece
 * logic is in the Game and Board classes
 */
public class CPiece {
    int xpos, ypos, x, y;
    
    boolean isRed;
    boolean isKing = false;
    private String color;

    LinkedList<CPiece> cp;
    
    public CPiece(int xpos, int ypos, boolean isRed, LinkedList<CPiece> cp){
        this.xpos = xpos;
        this.ypos = ypos;
        this.isRed = isRed;
        x = xpos * 64;
        y = ypos * 64;
        
        this.cp = cp;
        cp.add(this);
//        setImage(isRed);
    
    }
    public boolean isRed(){
    
        return isRed;
    
    }
    public void setX(int x) {
    	xpos = x;
    }
    
    public void setY(int y) {
    	ypos = y;
    }
    public int getX(){
    
    return this.x;
    }
    public int getY(){
    
        return this.y;
    }
    public void setKing(boolean x){
        
        this.isKing = x;
                
    }
    public boolean getKing(){
    
        return this.isKing;
    
    }
    public void move(int xp, int yp){
        if(Board.getPiece(xp*64, yp*64)!=null){
            if(Board.getPiece(xp*64, yp*64).isRed() != isRed){
                if(Board.getPiece(xp*64, yp*64).getX() != this.getX() && Board.getPiece(xp*64, yp*64).getY() != this.getY() )
                     Board.getPiece(xp*64, yp*64).destroy();
            }
            else{
              this.x = xp*64;
              this.y = yp*64;
              return;
            }
        }

    	this.xpos = xp;
    	this.ypos = yp;
        this.x = xp*64;
        this.y = yp*64;
  
        //TODO add move function
        // needs to check for jumpable piece. Maybe add an isJumpable method? 
    
    }

    public void destroy(){
        
        //need to add adjacent check to see if it is a legal jump.
        
        cp.remove(this);
    }
    
    public String getColor(){
        return this.color;
    }
}
