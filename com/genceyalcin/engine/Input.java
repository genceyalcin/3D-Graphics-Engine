package com.genceyalcin.engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements KeyListener, MouseListener {

	// FIELDS

	private boolean[] keys = new boolean[256];
	private boolean[] keysLast = new boolean[256];

	private boolean[] buttons = new boolean[5];
	private boolean[] buttonsLast = new boolean[5];

	private int mouseX;
	private int mouseY;

	private GameContainer gc;

	public Input(GameContainer gc) {
		this.gc = gc;

		mouseX = 0;
		mouseY = 0;

		gc.getWindow().getCanvas().addKeyListener(this);
		gc.getWindow().getCanvas().addMouseListener(this);
	}

	public void update() {
		for (int i = 0; i < keys.length; i++) {
			keysLast[i] = keys[i];
		}
		for (int i = 0; i < buttons.length; i++) {
			buttonsLast[i] = buttons[i];
		}
	}

	public boolean isKey(int key) {
		return keys[key];
	}

	public boolean isKeyDown(int key) {
		return keys[key] && !keysLast[key];
	}

	public boolean isKeyUp(int key) {
		return !keys[key] && keysLast[key];
	}

	public boolean isButton(int key) {
		return buttons[key];
	}

	public boolean isButtonDown(int key) {
		return buttons[key] && !buttonsLast[key];
	}

	public boolean isButtonUp(int key) {
		return !buttons[key] && buttonsLast[key];
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		buttons[e.getButton()] = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		buttons[e.getButton()] = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		mouseX = (int) (e.getX() / gc.getScale());
		mouseY = (int) (e.getY() / gc.getScale());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		mouseX = (int) (e.getX() / gc.getScale());
		mouseY = (int) (e.getY() / gc.getScale());
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	public int getMouseX() {
		return mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

}
