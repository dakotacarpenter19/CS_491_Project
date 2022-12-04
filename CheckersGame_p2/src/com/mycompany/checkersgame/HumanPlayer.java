package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public class HumanPlayer extends Player {
    
	private String name;
	private String color;
	
	public HumanPlayer(String n, String c) {
		HumanPlayer player = new HumanPlayer(name, color);
		setName(n);
		setColor(c);
	}
	
	public void move(String[][] board) {
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
	
	public void setColor(String c) {
		color = c;
	}
	
	public String getColor() {
		return color;
	}
	
    public void updateGame(CheckersGame game) {
    	// add pseudo-code
    }

	@Override
	public boolean isHuman() {
		return true;
	}
}
