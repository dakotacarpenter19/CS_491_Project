package com.mycompany.checkersgame;

import javax.swing.Icon;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

public class CheckersGame {
	
	public static final int PLAYER_1 = 1;
	public static final int PLAYER_2 = 2;
	public static final int PLAYER_1_KING = 3;
	public static final int PLAYER_2_KING = 4;
//	public static final String RED_PIECE = images/piece_red.png;
//	public static final String BLACK_PIECE = "/images/piece_black.png";
	

	public CheckersGame() {
//		CheckersGame game = new CheckersGame();
		
		
		// probably delete this garbage
//		board = new int [BOARD_SIZE][BOARD_SIZE];
//		currentPlayer = RED;
//		gameOver = false;
//		winner = 0;
//		
//		for (int i = 0; i < BOARD_SIZE; i++) {
//			for (int j = 0; j < BOARD_SIZE; j++) {
//				if (i % 2 == j % 2) {
//					if (i < 3) {
//						board[i][j] = BLACK;
//					} else if (i > 4) {
//						board[i][j] = RED;
//					} else {
//						board[i][j] = EMPTY;
//					}
//				} else {
//					board[i][j] = EMPTY;
//				}
//			}
//		}
		
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
	
//	public static int[][] createBoard() {
//		int[][] testBoard = new int[0][0];
//		return testBoard;
//	}
	
//	private Move getJump() {
//		
//	}
	
}
