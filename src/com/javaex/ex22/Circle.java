package com.javaex.ex22;

public class Circle extends Shape {
	
	//필드
	private int radius;


	
	//생성자
	
	public Circle() {
		
	}
	
	
	public Circle(String fillcolor, String linecolor, int radius) {
		super(fillcolor, linecolor);
		this.radius = radius;
	}		
	
	//메소드-gs


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	
	//메소드-일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillcolor()=" + getFillcolor() + ", getLinecolor()=" + getLinecolor()
				+ "]";

	}
		
	public void draw() {
		System.out.println("========원형을 그렸습니다.========");
		System.out.println("면색:" + super.getFillcolor());
		System.out.println("선색:" + super.getLinecolor());
		System.out.println("가로:" + this.radius);
		System.out.println("================================");
	}	
	
	
	
}
