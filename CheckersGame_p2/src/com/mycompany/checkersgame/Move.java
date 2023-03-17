package com.mycompany.checkersgame;

public class Move {
	public int startRow, startCol, endRow, endCol;
	
	public Move (int startRow, int startCol, int endRow, int endCol) {
		this.startRow = startRow;
		this.startCol = startCol;
		this.endRow = endRow;
		this.endCol = endCol;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Move) {
			Move other = (Move) obj;
			return startRow == other.startRow && startCol == other.startCol && endRow == other.endRow && endCol == other.endCol;
		}
		return false;
	}
}
