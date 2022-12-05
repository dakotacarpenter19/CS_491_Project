package com.mycompany.checkersgame;

/*
 * @author Dakota Carpenter and Lale Saparova
 */

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

public class PlayerChoice {
	
	private String difficulty;
	private String color;
	private String color2;
	private String player1_name;
	private String player2_name;

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
				HumanPlayer p1 = new HumanPlayer(player1_name, color);
				HumanPlayer p2 = new HumanPlayer(player2_name, color2);
				
				frame.dispose();
			}
		});
		btnNewButton.setBounds(20, 166, 148, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Computer Player");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckersBoard c = new CheckersBoard();
				ComputerPlayer cpu = new ComputerPlayer(color2, difficulty);
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
		
		JTextPane p2_name_label = new JTextPane();
		p2_name_label.setEditable(false);
		p2_name_label.setText("Player 2 Name: ");
		p2_name_label.setBounds(178, 169, 98, 20);
		frame.getContentPane().add(p2_name_label);
		
		JTextPane p2_name = new JTextPane();
		p2_name.setText("Player 2");
		p2_name.setBounds(289, 169, 98, 20);
		frame.getContentPane().add(p2_name);
		
		player2_name = p2_name.getText();
		
		JTextPane p1_name_label = new JTextPane();
		p1_name_label.setText("Player 1 Name: ");
		p1_name_label.setEditable(false);
		p1_name_label.setBounds(178, 133, 98, 20);
		frame.getContentPane().add(p1_name_label);
		
		JTextPane p1_name = new JTextPane();
		p1_name.setText("Player 1");
		p1_name.setBounds(289, 133, 98, 20);
		frame.getContentPane().add(p1_name);
		
		player1_name = p1_name.getText();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(PlayerChoice.class.getResource("/images/Checkers.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		
	}
	
	public void setColor(String c) {
		if (c.equals("red")) {
			color = "red";
			color2 = "black";
		} else if (c.equals("black")) {
			color = "black";
			color2 = "red";
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
	
	public String getPlayer1Name() {
		return player1_name;
	}
	
	public String getPlayer2Name() {
		return player2_name;
	}
}
