package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public abstract class Player {
		
	private String playerName;
	
	public Player(String name) {
		playerName = name;
	}
	
	public void createPlayer(int playerType) {
//		IF playerType == 0 THEN
//			HumanPlayer();
//		ELSE IF playerType == 1 THEN
//			ComputerPlayer();
//		ENDIF
	}
	
	public void setName(String n) {
		playerName = n;
	}
	
	public String getName() {
		return playerName;
	}
	
	public abstract boolean isHuman();
        
	public String toString() {
		return getClass().getSimpleName() + "[isHuman=" + isHuman() + "]";
            
	}
}
