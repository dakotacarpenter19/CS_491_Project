package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public abstract class Player {
		
	private String playerName;
	
	public Player() {
		// add pseudo-code
	}
	
	public void setName(String n) {
		playerName = n;
	}
	
	public String getName() {
		return playerName;
	}
	
	public abstract boolean isHuman();
	
	public abstract void updateGame(CheckersGame game);
        
	public String toString() {
		return getClass().getSimpleName() + "[isHuman=" + isHuman() + "]";
            
	}
}
