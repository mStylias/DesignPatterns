package com.StyleM;

import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent {

	private int xUpperLeftCorner;
	private int yUpperLeftCorner;
	private int width;
	private int height;

	private Rectangle rect;

	public int getxUpperLeftCorner() {
		return xUpperLeftCorner;
	}
	public int getyUpperLeftCorner() {
		return yUpperLeftCorner;
	}
	public int getWidthLocal() {
		return width;
	}
	public int getHeightLocal() {
		return height;
	}

	public Shape()
	{
		super();
		xUpperLeftCorner = 10;
		yUpperLeftCorner = 10;
		width = 200;
		height = 100;
	}

	/**
	 * Instantiates a rectangle from the available information
	 * and triggers the paint method
	 */
	public void draw()
	{
		rect = new Rectangle(xUpperLeftCorner, yUpperLeftCorner, width, height);
		this.repaint();
	}

	/**
	 * Paints the rectangle on the UI
	 */
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(rect);
	}
}

	


