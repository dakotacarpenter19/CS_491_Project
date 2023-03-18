/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkersgame;

import java.util.LinkedList;

/**
 *
 * @author wincr
 */
public class Piece {
    private int xpos;
    private int ypos;
    
    private boolean isRed;
    
    LinkedList<Piece> pieces;
    
    public void Piece(int xpos, int ypos, boolean isRed, LinkedList<Piece> pieces){
    
        this.xpos = xpos;
        this.ypos = ypos;
        this.isRed = isRed;
        this.pieces = pieces;
        this.pieces.add(this);
    
    
    }
    
    public void move(int xpos,int ypos){
    
        
    
    }
    
    public void destroy(){
    
       pieces.remove(this);
    }
           
}
