package com.mycompany.checkersgame;

/**
 *
 * @author lalesaparova
 */
public abstract class Player {
 
    
        public abstract boolean isHuman();
        
        
        public abstract void updateGame(CheckersGame game);
        
        public String toString() {
            return getClass().getSimpleName() + "[isHuman=" + isHuman() + "]";
            
        }
}
