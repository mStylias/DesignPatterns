package com.StyleM;

import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent {
	
	public void draw()
	{
		rect = new Rectangle(xUpperLeftCorner, yUpperLeftCorner, width, height);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(rect);
	}

	private int xUpperLeftCorner = 10;
	private int yUpperLeftCorner = 10;
	private int width = 200;
	private int height = 100;
	private Rectangle rect;

	public Rectangle getRect() {
		return rect;
	}
}

	


