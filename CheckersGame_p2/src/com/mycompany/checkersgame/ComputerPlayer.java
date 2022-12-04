package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public class ComputerPlayer {

	private String difficulty;
	private String pieceColor;
	
	public ComputerPlayer(String color, String difficulty) {
		ComputerPlayer cpu = new ComputerPlayer(pieceColor, difficulty);
		
		// probably add pseudo-code
	}
	
	public void move() {
		// add pseudo-code
	}
	
	public void setDifficulty(String d) {
		difficulty = d;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public void setPieceColor(String c) {
		pieceColor = c;
	}
	
	public String getPieceColor() {
		return pieceColor;
	}
	
}
