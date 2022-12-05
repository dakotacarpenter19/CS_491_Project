package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public class HumanPlayer extends Player {
    
	private String name = "";
	private String color;
	private int previousSpace;
	
	public HumanPlayer(String n, String c) {
		super(n);
		HumanPlayer player = new HumanPlayer(name, color);
		setName(n);
		setColor(c);
	}
	
	public void move(String[][] board) {
//		IF (player makes a move) THEN
//			previousSpace = getCurrentBoardLocation();
//			humanMove = reponseMovePiece(playerMove);
//		ELSE 
//			Print("Player make a move");
//		ENDIF
	}
	
	public void undoMove() {
//		WHILE (game did not end) {
//			IF (undo) 
//				Undo the move
//				update the board view
//			ENDIF
//			
//			Ask for the next move from the user
//			Opponent's move
//			Update the board view
//		}
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
    
    public int getPreviousSpace() {
    	return previousSpace;
    }

	@Override
	public boolean isHuman() {
		return true;
	}
}
