package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Graphics;

public class CheckersBoard {
	
	public String[][] board;
	
	public CheckersBoard() {
		
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(700, 700));
		frame.setSize(new Dimension(820, 806));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitButton.setBounds(705, 733, 89, 23);
		frame.getContentPane().add(ExitButton);
		
		JButton MovePieceButton = new JButton("Move Piece");
		MovePieceButton.setBounds(10, 733, 105, 23);
		frame.getContentPane().add(MovePieceButton);
		
		JButton UndoButton = new JButton("Undo Move");
		UndoButton.setBounds(125, 733, 105, 23);
		frame.getContentPane().add(UndoButton);
		
		JButton InstructionsButton = new JButton("How to Play");
		InstructionsButton.setBounds(240, 733, 113, 23);
		frame.getContentPane().add(InstructionsButton);
		frame.setVisible(true);
		
		drawBoard(frame);
	}
	
	public void drawBoard(JFrame frame) {
		
		JLabel[][] board = new JLabel[8][8];
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = new JLabel();
				board[i][j].setBounds(i * 75 + 100, j * 75 + 50, 75, 75);
				if (i % 2 == j % 2) {
					board[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/images/square_red.png")));
				} else {
					board[i][j].setIcon(new ImageIcon(StartGame.class.getResource("/images/square_black.png")));
				}
				frame.getContentPane().add(board[i][j]);
			}
		}
	}
	
}
