package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public class ComputerPlayer extends Player {

	private String difficulty;
	private String pieceColor;
	
	public ComputerPlayer(String color, String difficulty) {
		super("CPU");
		ComputerPlayer cpu = new ComputerPlayer(pieceColor, difficulty);
	}
	
	void move() {
//		IF (player made a move) THEN
//			cpuMove = responseMovePiece(playerMove);
//		ELSE
//			Print("Player make a move");
//		ENDIF
	}
	
	void chooseBestMove() {
//		future feature
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

	@Override
	public boolean isHuman() {
		return false;
	}
}
