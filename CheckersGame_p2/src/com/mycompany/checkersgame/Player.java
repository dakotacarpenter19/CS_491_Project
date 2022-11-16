package com.mycompany.checkersgame;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lalesaparova
 */
public abstract class Player {
 
    
        public abstract boolean isHuman();
        
        
        public abstract void updateGame(Game game);
        
        public String toString() {
            return getClass().getSimpleName() + "[isHuman=" + isHuman() + "]";
            
        }
}
