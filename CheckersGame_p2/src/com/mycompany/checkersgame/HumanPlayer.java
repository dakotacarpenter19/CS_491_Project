package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public class HumanPlayer extends Player {
    
	private String name;
	
	public HumanPlayer() {
		HumanPlayer player = new HumanPlayer();
	}
	
	public void move() {
		// add pseudo-code
	}
	
	public void undoMove() {
		// add pseudo-code
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
    public void updateGame(CheckersGame game) {
    	// add pseudo-code
    }

	@Override
	public boolean isHuman() {
		return true;
	}
}
