package com.javaex.ex11;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(68);
		p01.draw();
		
		
		Point p02 = new Point(45,88);
		p02.draw();
		

		System.out.println("****************************");
	
		
		p01.draw();
		
		
		
		
		
		p01.draw(true); //그리다
		p01.draw(false); //지우다
	
	
	}
	
	
}
