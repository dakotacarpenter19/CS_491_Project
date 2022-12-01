package com.mycompany.checkersgame;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

public class PlayerChoice {
	
	private String difficulty;
	private String color;

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
		btnNewButton.setBounds(20, 166, 148, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Computer Player");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckersBoard c = new CheckersBoard();
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(20, 200, 148, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JComboBox difficultyBox = new JComboBox();
		difficultyBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDifficulty(difficultyBox.getSelectedItem().toString());
			}
		});
		difficultyBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		difficultyBox.setBounds(178, 200, 42, 22);
		frame.getContentPane().add(difficultyBox);
		
		JComboBox colorSelection = new JComboBox();
		colorSelection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(colorSelection.getSelectedItem().toString());
			}
		});
		colorSelection.setModel(new DefaultComboBoxModel(new String[] {"Choose Color", "black", "red"}));
		colorSelection.setSelectedIndex(0);
		colorSelection.setBounds(20, 133, 148, 22);
		frame.getContentPane().add(colorSelection);
		
		JLabel OptionsText = new JLabel("Game Options");
		OptionsText.setHorizontalAlignment(SwingConstants.CENTER);
		OptionsText.setForeground(new Color(255, 255, 255));
		OptionsText.setFont(new Font("Tahoma", Font.BOLD, 32));
		OptionsText.setBounds(81, 11, 269, 51);
		frame.getContentPane().add(OptionsText);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PlayerChoice.class.getResource("/images/Checkers.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		
		
	}
	
	public void setColor(String color) {
		if (color.equals("red")) {
			color = "red";
		} else if (color.equals("black")) {
			color = "black";
		}
	}
	
	public String getColor() {
		return color;
	}
	
	public void setDifficulty(String d) {
		difficulty = d;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
}
