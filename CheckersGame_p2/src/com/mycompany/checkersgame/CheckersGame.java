package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public class CheckersGame {

	public CheckersGame() {
		CheckersGame game = new CheckersGame();
	}
	
	public boolean checkValidMove(Player player1, Player player2) {
		
		boolean valid = false;
		
//		IF spaceIsEmpty THEN
//			IF player1.piece.getDirection = forward THEN
//				valid = true;
//			ELSE IF player1.piece.getDirection = backwards THEN
//				IF player1.piece.isKing THEN
//					valid = true;
//				ELSE 
//					valid = false;
//				ENDIF
//			ENDIF
//		ELSE IF !spaceIsEmpty THEN
//			IF player2.piece.spaceAfter THEN
//				valid = true;
//			ELSE IF !player2.piece.spaceAfter THEN
//				valid = false;
//			ENDIF
//		ENDIF
			
		return valid;
	}
	
	public boolean King(Player player) {
		
		boolean KingStatus = false;
		
//		IF player.piece.getPosition = endOfBoard THEN
//			KingStatus = true;
//		ENDIF
		
		return KingStatus;
	}
	
	void winner() {
//		IF (player.pieces == 0) || opponent.pieces == 0)
//			Print("You won " + player/human/cpu);
//				Break;
//		ENDIF
	}
	
}
