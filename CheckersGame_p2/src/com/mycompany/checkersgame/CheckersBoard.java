package com.mycompany.checkersgame;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class CheckersBoard {

	public CheckersBoard() {
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(700, 700));
		frame.setSize(new Dimension(700, 700));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitButton.setBounds(580, 11, 89, 23);
		frame.getContentPane().add(ExitButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CheckersBoard.class.getResource("/images/checkersboard.png")));
		lblNewLabel.setBounds(0, 0, 669, 479);
		frame.getContentPane().add(lblNewLabel);
		
		JButton MovePieceButton = new JButton("Move Piece");
		MovePieceButton.setBounds(47, 510, 89, 23);
		frame.getContentPane().add(MovePieceButton);
		
		JButton UndoButton = new JButton("Undo Piece");
		UndoButton.setBounds(165, 510, 89, 23);
		frame.getContentPane().add(UndoButton);
		
		JButton InstructionsButton = new JButton("How to Play");
		InstructionsButton.setBounds(293, 510, 89, 23);
		frame.getContentPane().add(InstructionsButton);
		frame.setVisible(true);
	}
	
}
