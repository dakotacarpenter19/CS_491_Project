
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
//    boolean isKing = false;
//    private String color;

    LinkedList<CPiece> cp;
    
    public CPiece(int xpos, int ypos, boolean isRed, LinkedList<CPiece> cp){
        this.xpos = xpos;
        this.ypos = ypos;
        this.isRed = isRed;
        x = xpos * 64;
        y = ypos * 64;
        
        this.cp = cp;
        cp.add(this);
    }
    public boolean isRed(){
    
        return isRed;
    
    }

    public int getX(){
    
    return this.x;
    }
    public int getY(){
    
        return this.y;
    }
}
