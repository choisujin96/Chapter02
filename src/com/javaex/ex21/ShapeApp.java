package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
	
		
		Triangle t01 = new Triangle("검정","주황",10,5);
		
		Rectangle r01 = new Rectangle("검정","노랑",5,13);
		
		Circle c01 = new Circle("빨강","연두",13);
		
		/*
		System.out.println(t01.toString());
		System.out.println(r01.toString());
		System.out.println(c01.toString());
		*/
		
		t01.draw();
		r01.draw();
		c01.draw();
	}

}
