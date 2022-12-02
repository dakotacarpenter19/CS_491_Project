package com.mycompany.checkersgame;

public class CheckersGame {

	public CheckersGame() {
		CheckersGame game = new CheckersGame();
	}
	
	public boolean checkValidMove(Player player1, Player player2) {
		
		boolean valid = false;
		
//		pseudo-code for phase 3:
		
//		IF spaceIsEmpty THEN
//			IF player1.piece.getDirection = forward THEN
//				valid = true;
//			ELSE IF player1.piece.getDirection = backwards THEN
//				IF player1.piece.isKing THEN
//					valid = true;
//				ELSE 
//					valid = false;
//		ELSE IF !spaceIsEmpty THEN
//			IF player2.piece.spaceAfter THEN
//				valid = true;
//			ELSE IF !player2.piece.spaceAfter THEN
//				valid = false;
		
		return valid;
	}
	
	public boolean King(Player player) {
		
		boolean KingStatus = false;
		
//		pseudo-code for phase 3:
//		
//		IF player.piece.getPosition = endOfBoard THEN
//			KingStatus = true;
		
		return KingStatus;
	}
	
}
