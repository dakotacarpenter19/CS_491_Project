
package com.mycompany.checkers;

/**
 *
 * @author Austin Winters, Dakota Carpenter
 */
public class Game {
    private boolean validate;
    private boolean isFull;
    private boolean pdestroy;

    private int currentPlayer;

    private int[][] board;

    private int[] selectedPiece;
   
    public Game(){
        this.validate = false;
        this.isFull = false;
        this.pdestroy = false;

        board = Board.getBoard();

    }

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

    public void movePiece(int row, int col) {
        if (isValidMove(selectedPiece[0], selectedPiece[1], row, col)) {
            board[row][col] = board[selectedPiece[0]][selectedPiece[1]];
            board[selectedPiece[0]][selectedPiece[1]] = 0;
        }

        selectedPiece = null;

    }

    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol) {
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
        if (board[jumpedRow][jumpedCol] == currentPlayer || board[jumpedRow][jumpedCol] == currentPlayer + 2) {
            System.out.println("Invalid move: cannot jump over your own piece");
            return false; // cannot jump over your own pieces
        }
        return true; // actually jump
    }


//    public boolean validMove(int x, int y){
//
//        if(y==8){
//            y--;
//        }
//        if(x==8){
//            x--;
//        }
//        if(x ==0 && y == 0 ){
//           this.validate = true;
//        }
//        else if(x == 0 && y == 2 ){
//
//           this.validate = true;
//        }
//        else if(x == 0 && y == 4){
//            this.validate = true;
//        }
//        else if(x == 0 && y == 6){
//            this.validate = true;
//        }
//        else if(x==1 && y==1){
//            this.validate = true;
//        }
//        else if(x==1 && y==3 ){
//            this.validate = true;
//        }
//        else if(x==1 && y==5){
//            this.validate = true;
//        }
//        else if(x==1 && y==7){
//            this.validate = true;
//        }
//        else if(x == 2 && y == 0){
//            this.validate = true;
//        }
//        else if(x==2 && y == 2){
//            this.validate = true;
//        }
//        else if(x==2 && y==4){
//            this.validate = true;
//        }
//        else if(x==2 && y==6){
//            this.validate = true;
//        }
//        else if(x==3 && y==1){
//            this.validate = true;
//        }
//        else if(x==3 && y==3 ){
//            this.validate = true;
//        }
//        else if(x==3 && y==5){
//            this.validate = true;
//        }
//        else if(x==3 && y==7){
//            this.validate = true;
//        }
//        else if(x == 4 && y == 0){
//            this.validate = true;
//        }
//        else if(x==4 && y == 2){
//            this.validate = true;
//        }
//        else if(x==4 && y==4){
//            this.validate = true;
//        }
//        else if(x==4 && y==6){
//            this.validate = true;
//        }
//        else if(x==5 && y==1){
//            this.validate = true;
//        }
//        else if(x==5 && y==3 ){
//            this.validate = true;
//        }
//        else if(x==5 && y==5){
//            this.validate = true;
//        }
//        else if(x==5 && y==7){
//            this.validate = true;
//        }
//        else if(x == 6 && y == 0){
//            this.validate = true;
//        }
//        else if(x==6 && y == 2){
//            this.validate = true;
//        }
//        else if(x==6 && y==4){
//            this.validate = true;
//        }
//        else if(x==6 && y==6){
//            this.validate = true;
//        }
//        else if(x==7 && y==1){
//            this.validate = true;
//        }
//        else if(x==7 && y==3 ){
//            this.validate = true;
//        }
//        else if(x==7 && y==5){
//            this.validate = true;
//        }
//        else if(x==7 && y==7){
//            this.validate = true;
//        }
//        else{
//            this.validate = false;
//        }
//
//        return this.validate;
//    }
//    public boolean isFull(int x1, int y1, int x2, int y2){
//        if(x1 == x2 && y1 == y2){
//            this.isFull = true;
//
//        }
//        return this.isFull;
//    }
//    public boolean destroyPiece(int x1, int y1, int x2, int y2){
//
//            if((x1 == 3 && y1 == 5) && (x2 == 1 && y2 == 3)){
//                   pdestroy = true;
//            }
//         return pdestroy;
//    }
}
