package com.mycompany.checkers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Arrays;

/**
 * @author Austin Winters, Dakota Carpenter
 */

public class Board extends JFrame {
	public static LinkedList<CPiece> cp = new LinkedList<>();

	private int selectedRow = -1;
	private int selectedCol = -1;
	private static int[][] board = {
			{1, 0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0, 1},
			{1, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 2, 0, 2, 0, 2, 0, 2},
			{2, 0, 2, 0, 2, 0, 2, 0},
			{0, 2, 0, 2, 0, 2, 0, 2},
	};

	private int[] selectedPiece;

	public Board() {
		Game game = new Game();

		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 528, 551);
		frame.setTitle("Checkers");
		frame.setResizable(false);

		JPanel panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				// builds and paints the board
				for (int a = 0; a < board.length; a++) {
					for (int b = 0; b < board[a].length; b++) {
						if ((a + b) % 2 == 0) {
							g.setColor(Color.WHITE);
						} else {
							g.setColor(Color.BLACK);
						}
						g.fillRect(b * 64, a * 64, 64, 64);

						if (board[a][b] == 1) {
							CPiece p = new CPiece(b, a, true, cp);
							g.setColor(Color.RED);
							g.fillOval(b * 64 + 16, a * 64 + 16, 32, 32);
						} else if (board[a][b] == 2) {
							CPiece p = new CPiece(b, a, false, cp);
							g.setColor(Color.BLACK);
							g.fillOval(b * 64 + 16, a * 64 + 16, 32, 32);
						} else if (board[a][b] == 0) {
							g.setColor(Color.RED); // not sure why this is here
						}

						if (a == selectedRow && b == selectedCol) {
							g.setColor(Color.GREEN);
							g.drawRect(b * 64, a * 64, 63, 63);
						}
					}
				}
			}
		};

		frame.add(panel);
		frame.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {}

			@Override
			public void mouseMoved(MouseEvent e) {}
		});

		frame.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int squareSize = 64;
				int col, row;

				row = e.getY() / squareSize;
				col = e.getX() / squareSize;

				/**
				 * checks if a piece is selected
				 * if not, selects a piece
				 * if so, moves the selected piece
				 */
				if (game.getSelectedPiece() == null) {
					System.out.println("Piece is selected");
					game.setSelectedPiece(row, col);
				} else {
					System.out.println("Piece is moved");
					game.movePiece(row, col);
				}

				frame.repaint();

				// "debug" message
//				System.out.println(Arrays.deepToString(board));

			}

			@Override
			public void mousePressed(MouseEvent e) {
				frame.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		});

		frame.add(panel);
		frame.setDefaultCloseOperation(3);
		frame.setVisible(true);

	}

	// might not need
	public static CPiece getPiece(int x, int y) {
		int xp = x / 64;
		int yp = y / 64;

		for (CPiece p : cp) {
			if ((p.getX() / 64) == xp && (p.getY() / 64) == yp) {
				return p;
			}
		}
		return null;
	}

	// not sure if necessary
	public static int[][] getBoard() {
		return board;
	}
}