package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.LinkedList;

public class CheckersBoard extends JFrame {
	
//	public String[][] board;
	
	private final int BOARD_SIZE = 8;
	private final int TILE_SIZE = 50;
	
	private JPanel boardPanel;
	private JLabel[][] boardLabels;
	private int[][] board;
	private int currentPlayer;
	private boolean canJump;
	
	public CheckersBoard() {
		
		LinkedList<Piece> pieces = new LinkedList<>();
		board = new int[BOARD_SIZE][BOARD_SIZE];
		setTitle("Checkers Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(new Dimension(1000, 1000));
		setResizable(false);
		boardPanel = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
		boardLabels = new JLabel[BOARD_SIZE][BOARD_SIZE];
//		board = CheckersGame.createBoard();  
		currentPlayer = CheckersGame.PLAYER_1;
		canJump = false;
		initBoard();
		getContentPane().add(boardPanel);
		setLocationRelativeTo(null); //not sure if keeping
		setVisible(true);
		
		
//		JFrame frame = new JFrame();
//		frame.setPreferredSize(new Dimension(700, 700));
//		frame.setSize(new Dimension(820, 806));
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		
//		JButton ExitButton = new JButton("Exit");
//		ExitButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
//		ExitButton.setBounds(705, 733, 89, 23);
//		frame.getContentPane().add(ExitButton);
//		
//		JButton MovePieceButton = new JButton("Move Piece");
//		MovePieceButton.setBounds(10, 733, 105, 23);
//		frame.getContentPane().add(MovePieceButton);
//		
//		JButton UndoButton = new JButton("Undo Move");
//		UndoButton.setBounds(125, 733, 105, 23);
//		frame.getContentPane().add(UndoButton);
//		
//		JButton InstructionsButton = new JButton("How to Play");
//		InstructionsButton.setBounds(240, 733, 113, 23);
//		frame.getContentPane().add(InstructionsButton);
//		frame.setVisible(true);
//		
//		drawBoard(frame);
	}
	
//	public void drawBoard(JFrame frame) {
//		
//		JLabel[][] board = new JLabel[8][8];
//		
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 8; j++) {
//				board[i][j] = new JLabel();
//				board[i][j].setBounds(i * 75 + 100, j * 75 + 50, 75, 75);
//				if (i % 2 == j % 2) {
//					board[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/images/square_red.png")));
//				} else {
//					board[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/images/square_black.png")));
//				}
//				frame.getContentPane().add(board[i][j]);
//			}
//		}
//	}
	
	private void initBoard() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				boardLabels[i][j] = new JLabel();
				boardLabels[i][j].setPreferredSize(new Dimension(TILE_SIZE, TILE_SIZE));
				boardLabels[i][j].setOpaque(true); // not sure if needed
				
				if ((i + j) % 2 == 0) {
					boardLabels[i][j].setBackground(Color.RED);
				} else {
					boardLabels[i][j].setBackground(Color.BLACK);
					boardLabels[i][j].setBorder(BorderFactory.createLineBorder(Color.WHITE));
//					boardLabels[i][j].addActionListener(this);
				}
				boardPanel.add(boardLabels[i][j]);
			}
		}
		updateBoard();
                loadPieces();
	}
	
	private void updateBoard() {
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				int piece = board[i][j];
				if (piece == CheckersGame.PLAYER_1) {
					boardLabels[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/images/piece_red.png")));
				} else if (piece == CheckersGame.PLAYER_1_KING) {
					boardLabels[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/iimages/piece_red_king.png")));
				} else if (piece == CheckersGame.PLAYER_2) { 
					boardLabels[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/images/piece_black.png")));
				} else if (piece == CheckersGame.PLAYER_2_KING) {
					boardLabels[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/images/piece_black_king.png")));
				} else {
					boardLabels[i][j].setIcon(null);
				}
			}
		}
	}
        
        private void loadPieces(){
        
            
        
        
        }
	
//	private void handleMove(int i, int j) {
//		if (canJump) {
//			Move jump = CheckersGame.getJump(board, currentPlayer, i, j);
//		}
//	}
	
}
