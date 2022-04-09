package com.StyleM;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		Shape myShape = new Shape();
		
		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.setContentPane(myShape);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myShape.draw();					        //APPLICATION 1
		f.setVisible(true);
		
												//APPLICATION 2
		System.out.println("Lower Right Corner. X: " + myShape.getXLowerRightCorner()
		                                    + " Y: " + myShape.getYLowerRightCorner());

		myShape.paint();
		                             
	}	
}
