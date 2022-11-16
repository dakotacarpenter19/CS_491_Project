package com.mycompany.checkersgame;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class StartGame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(464, 324));
		frame.setPreferredSize(new Dimension(430, 310));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton StartButton = new JButton("Start");
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayerChoice p = new PlayerChoice();
				frame.dispose();
			}
		});
		StartButton.setBounds(98, 186, 89, 23);
		frame.getContentPane().add(StartButton);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitButton.setBounds(215, 186, 89, 23);
		frame.getContentPane().add(ExitButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(StartGame.class.getResource("/images/Checkers.png")));
		lblNewLabel.setBounds(10, 11, 434, 261);
		frame.getContentPane().add(lblNewLabel);

	}
}
