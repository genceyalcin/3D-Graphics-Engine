package com.genceyalcin.engine;

import java.awt.image.DataBufferInt;

public class Renderer {

	private int pW;
	private int pH;

	private int[] p;

	private int color;

	public Renderer(GameContainer gc) {
		pW = gc.getWidth();
		pH = gc.getHeight();

		p = ((DataBufferInt) gc.getWindow().getImage().getRaster().getDataBuffer()).getData();

		color = 0xffffff;
	}

	public void clear() {
		for (int i = 0; i < pW * pH; i++) {
			p[i] = 0;
		}
	}

	public void drawLine(int x0, int y0, int x1, int y1) {
		// Calculate the change in x, y and the slope
		int dx = x1 - x0;
		int dy = y1 - y0;
		
		float slope = (float) dy / dx;
			
		// Draw lines depending on the case
		if (Math.abs(slope) >= 0 && Math.abs(slope) <= 1 && dx > 0) {
			float y = y0;
			for (int x = x0; x <= x1; x ++) {
				drawPixel(x, (int)y);
				y += slope;
			}
			return;
		} 
		else if (Math.abs(slope) >= 0 && Math.abs(slope) <= 1 && dx < 0) {
			float y = y1;
			for (int x = x1; x <= x0; x ++) {
				drawPixel(x, (int)y);
				y += slope;
			}
			return;
		}
		else if (Math.abs(slope) >= 1 && dy > 0) {
			float x = x0;
			for (int y = y0; y <= y1; y ++) {
				drawPixel((int) x, y);
				x += 1 / slope;
			}
			return;
		}
		else if (Math.abs(slope) >= 1 && dy < 0) {
			float x = x1;
			for (int y = y1; y <= y0; y ++) {
				drawPixel((int) x, y);
				x += 1 / slope;
			}
			return;
		}
	
	}
	
	public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		drawLine(x1, y1, x2, y2);
		drawLine(x1, y1, x3, y3);
		drawLine(x2, y2, x3, y3);
	}

	private void drawPixel(int x, int y) {
		if (x < 0 || y < 0 || x >= pW || y >= pH) {
			return;
		}
		p[(y * pW) + x] = color;
	}

}
