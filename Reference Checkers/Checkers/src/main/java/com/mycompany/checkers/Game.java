
package com.mycompany.checkers;

/**
 * @author Austin Winters, Dakota Carpenter
 */
public class Game {
    private boolean validate;
    private boolean isFull;
    private boolean pdestroy;

    // need to implement this for turns
    private int currentPlayer;

    private int[][] board;

    private int[] selectedPiece;
   
    public Game(){
        this.validate = false;
        this.isFull = false;
        this.pdestroy = false;

        board = Board.getBoard();

    }

    // this method currently is not used, I don't think we need to use it
    public int[][] constructBoard() {
        int[][] newBoard = new int[8][8];
        System.out.println("" + newBoard.length + " " + newBoard[0].length);
        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; i < newBoard[i].length; j++) {
                if ((i + j) % 2 == 1 && i < 3) {
                    newBoard[i][j] = 1;
                } else if ((i + j) % 2 == 1 && i > 4) {
                    newBoard[i][j] = 2;
                } else {
                    newBoard[i][j] = 0;
                }
            }
        }
        return newBoard;
    }

    public int[] getSelectedPiece() {
        return selectedPiece;
    }

    public void setSelectedPiece(int row, int col) {
        selectedPiece = new int[]{row, col};
    }

    public void movePiece(int row, int col, boolean isRed) {
        if (isValidMove(selectedPiece[0], selectedPiece[1], row, col, isRed)) {
            board[row][col] = board[selectedPiece[0]][selectedPiece[1]];
            board[selectedPiece[0]][selectedPiece[1]] = 0;
        }

        selectedPiece = null;

    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol, boolean isRed) {
        System.out.println("startRow: " + startRow + " startCol: " + startCol + " endRow: " + endRow + " endCol: " + endCol);

        // Checks if the end position is within the board
        if (endRow < 0 || endRow > 7 || endCol < 0 || endCol > 7) {
            System.out.println("endRow = " + endRow + " and endCol = " + endCol);
            System.out.println("Invalid move: end position is not within the board");
            return false;
        }
        // Checks if the end position is empty
        if (board[endRow][endCol] != 0) {
            System.out.println("Invalid move: end position is not empty");
            return false;
        }
        // Checks if the move is diagonal
        if (Math.abs(endRow - startRow) != Math.abs(endCol - startCol)) {
            System.out.println("Invalid move: move is not diagonal");
            return false;
        }
        // Checks if the piece is moving in the correct direction
        if (board[startRow][startCol] == 2 && endRow > startRow) {
            System.out.println("Invalid move: red piece not moving in the correct direction");
            return false;
        }
        if (board[startRow][startCol] == 1 && endRow < startRow) {
            System.out.println("Invalid move: black piece not moving in the correct direction");
            return false;
        }
        // Checks if the move is regular or jump
        if (Math.abs(endRow - startRow) == 1) {
            return true; // regular move
        }

        int jumpedRow = (startRow + endRow) / 2;
        int jumpedCol = (startCol + endCol) / 2;
        if (board[jumpedRow][jumpedCol] == 0) {
            System.out.println("Invalid move: no jumpable piece");
            return false; // no jumpable piece
        }
        if ((board[jumpedRow][jumpedCol] == currentPlayer && isRed == true) || (board[jumpedRow][jumpedCol] == currentPlayer + 2 && isRed == false)) {
            System.out.println("Invalid move: cannot jump over your own piece");
            return false; // cannot jump over your own pieces
        }
        return true; // actually jump
    }

}
