package com.mycompany.checkers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Austin Winters, Dakota Carpenter
 */
public class Board extends JFrame {

	public static LinkedList<CPiece> cp = new LinkedList<>();
	public static CPiece selectedPiece = null;

	public Board() {

		// image array and images by Dakota Carpenter
		Image[] img = new Image[4];
		img[0] = Toolkit.getDefaultToolkit().getImage("images/piece_black.png");
		img[1] = Toolkit.getDefaultToolkit().getImage("images/piece_red.png");
		img[2] = Toolkit.getDefaultToolkit().getImage("images/piece_red_king.png");
		img[3] = Toolkit.getDefaultToolkit().getImage("images/piece_black_king.png");

		JFrame frame = new JFrame();
		frame.setBounds(10, 10, 415, 439);
		frame.setTitle("Checkers");

		// need to add an exit button and restart button to rebuild the board.
		// may be able to use esc key to exit game and a popup window to declare winner
		// and restart.
		// JPanel for the displayable board and pieces by Austin Winters
		JPanel panel = new JPanel() {

			@Override
			public void paint(Graphics g) {

				int ind = 0;
				boolean isred = true;
				for (int i = 0; i < 8; i++) {
					for (int j = 0; j < 8; j++) {
						if (isred) {
							if (i < 3) {
								CPiece p = new CPiece(j, i, true, cp);

							}
							if (i > 4) {
								CPiece p = new CPiece(j, i, false, cp);

							}

							g.setColor(Color.red);

						} else {

							g.setColor(Color.black);

						}

						g.fillRect(i * 50, j * 50, 50, 50);
						isred = !isred;

					}
					isred = !isred;

				}
				for (CPiece p : cp) {
					if (p.isRed()) {
						ind = 1;

					} else {
						ind = 0;

					}
					g.drawImage(img[ind], p.xpos * 50, p.ypos * 50, this);

				}

			}

		};
		frame.add(panel);
		

		frame.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (selectedPiece != null) {
					selectedPiece.x = e.getX() - 25;
					selectedPiece.y = e.getY() - 25;
					frame.repaint();
				}
			}

			@Override
			public void mouseMoved(MouseEvent e) {}
		});

		frame.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(getPiece(e.getX(), e.getY()));
				selectedPiece = getPiece(e.getX(), e.getY());
				frame.repaint();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				selectedPiece.move(e.getX() / 50, e.getY() / 50);
				frame.repaint();
			}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}
		});

		frame.setDefaultCloseOperation(3);

		frame.setVisible(true);

	}

	public static CPiece getPiece(int x, int y) {
		int xp = x / 50;
		int yp = y / 50;

		for (CPiece c : cp) {
			if (c.xpos == xp && c.ypos == yp) {
				return c;
			}
		}
		return null;
	}

	/*
	 * private JButton exit(){ JButton endGame = new JButton();
	 * 
	 * endGame.setPreferredSize(new Dimension(91, 25)); //endGame.setMaximumSize(new
	 * Dimension(91, 25)); endGame.setAlignmentX(10); endGame.setAlignmentY(-10);
	 * endGame.setVisible(true); return endGame; }
	 */

}