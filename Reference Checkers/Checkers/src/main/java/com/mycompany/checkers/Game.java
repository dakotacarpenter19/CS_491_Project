
package com.mycompany.checkers;

/**
 * @author Austin Winters, Dakota Carpenter
 */
public class Game {
    private boolean validate;
    private boolean isFull;
    private boolean pdestroy;

    private int redCount, redKingCount, blackCount, blackKingCount;

    // need to implement this for turns
    private int currentPlayer;

    private int[][] board;

    private int[] selectedPiece;

   
    public Game(){
        this.validate = false;
        this.isFull = false;
        this.pdestroy = false;

        board = Board.getBoard();
        redCount = 12;
        blackCount = 12;
        redKingCount = 0;
        blackKingCount = 0;

    }

    public int getRedCount() {
        return redCount;
    }

    public int getRedKingCount() {
        return redKingCount;
    }

    public int getBlackCount() {
        return blackCount;
    }

    public int getBlackKingCount() {
        return blackKingCount;
    }

    public int[] getSelectedPiece() {
        return selectedPiece;
    }

    public void setSelectedPiece(int row, int col) {
        selectedPiece = new int[]{row, col};
    }

    public void movePiece(int row, int col, boolean isRed) {
        if (isValidMove(selectedPiece[0], selectedPiece[1], row, col, isRed)) {

            if (row == 0 && board[selectedPiece[0]][selectedPiece[1]] == 2) {
                blackCount--;
                blackKingCount++;
                board[row][col] = 4;
                board[selectedPiece[0]][selectedPiece[1]] = 0;
            } else if (row == 7 && board[selectedPiece[0]][selectedPiece[1]] == 1) {
                redCount--;
                redKingCount++;
                board[row][col] = 3;
                board[selectedPiece[0]][selectedPiece[1]] = 0;
            } else {
                board[row][col] = board[selectedPiece[0]][selectedPiece[1]];
                board[selectedPiece[0]][selectedPiece[1]] = 0;
            }

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
            System.out.println("Invalid move: black piece not moving in the correct direction");
            return false;
        } else if (board[startRow][startCol] == 1 && endRow < startRow) {
            System.out.println("Invalid move: red piece not moving in the correct direction");
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
//        if ((board[jumpedRow][jumpedCol] == currentPlayer && isRed == true) || (board[jumpedRow][jumpedCol] == currentPlayer + 2 && isRed == false)) {
//            System.out.println("Invalid move: cannot jump over your own piece");
//            return false; // cannot jump over your own pieces
//        }
        if (board[startRow][startCol] == board[jumpedRow][jumpedCol]) {
            System.out.println("Invalid move: cannot jump over your own piece");
            return false; // cannot jump over your own pieces
        }

        // removed jumped pieces
        if (Math.abs(endRow - startRow) == 2) {
            int midRow = (startRow + endRow) / 2;
            int midCol = (startCol + endCol) / 2;
            // checks if piece is your own
            if (board[startRow][startCol] == board[midRow][midCol]) {
                System.out.println("Cannot jump over your own piece");
                return false;
            } else if (board[startRow][startCol] == 3 && board[midRow][midCol] == 1) {
                System.out.println("Cannot jump over your own piece");
                return false;
            } else if (board[startRow][startCol] == 4 && board[midRow][midCol] == 2) {
                System.out.println("Cannot jump over your own piece");
                return false;
            } else if (board[startRow][startCol] == 1 && board[midRow][midCol] == 3) {
                System.out.println("Cannot jump over your own piece");
                return false;
            } else if (board[startRow][startCol] == 2 && board[midRow][midCol] == 4) {
                System.out.println("Cannot jump over your own piece");
                return false;
            } else {
                if (board[midRow][midCol] == 1) {
                    redCount--;
                } else if (board[midRow][midCol] == 2) {
                    blackCount--;
                } else if (board[midRow][midCol] == 3) {
                    redKingCount--;
                } else if (board[midRow][midCol] == 4) {
                    blackKingCount--;
                }
                board[midRow][midCol] = 0;
            }
        }

        return true; // actually move
    }

}
