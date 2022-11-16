package com.mycompany.checkersgame;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class PlayerChoice {

	public PlayerChoice() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(447, 311));
		frame.setPreferredSize(new Dimension(431, 311));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Human Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckersBoard c = new CheckersBoard();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(121, 191, 99, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Computer Player");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckersBoard c = new CheckersBoard();
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(230, 191, 127, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PlayerChoice.class.getResource("/images/Checkers.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
	
}
