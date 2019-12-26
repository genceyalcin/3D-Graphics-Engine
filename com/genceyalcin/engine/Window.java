package com.genceyalcin.engine;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Window {

	private JFrame frame;
	private Canvas canvas;
	private BufferedImage image;
	private BufferStrategy bs;
	private Graphics g;

	public Window(GameContainer gc) {

		image = new BufferedImage(gc.getWidth(), gc.getHeight(), BufferedImage.TYPE_INT_RGB);

		canvas = new Canvas();
		Dimension size = new Dimension((int) (gc.getWidth() * gc.getScale()), (int) (gc.getHeight() * gc.getScale()));

		canvas.setPreferredSize(size);
		canvas.setMaximumSize(size);
		canvas.setMinimumSize(size);

		frame = new JFrame(gc.getTitle());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(canvas, BorderLayout.CENTER);
		frame.pack();

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);

		canvas.createBufferStrategy(2);
		bs = canvas.getBufferStrategy();
		g = bs.getDrawGraphics();
	}

	public void update() {
		g.drawImage(image, 0, 0, canvas.getWidth(), canvas.getHeight(), null);
		bs.show();
	}
	
	public BufferedImage getImage() {
		return image;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}

}
