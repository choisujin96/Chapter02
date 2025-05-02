package com.javaex.ex20;

public class PointApp {

	public static void main(String[] args) {
		
		System.out.println("-------------");
		Point p = new Point(4,4);
		System.out.println("-------------");
		ColorPoint cp1 = new ColorPoint("red");
		System.out.println("-------------");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		System.out.println("-------------");
		
		
		//System.out.println(cp2.toString());
		
		
		p.showInfo();
		
		cp1.showInfo();
		
		cp2.showInfo();
		
	}

}
