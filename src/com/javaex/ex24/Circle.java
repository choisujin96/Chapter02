package com.javaex.ex24;

public class Circle extends Shape implements Drawable {
	
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
		
	//Drawalbe 인터페이스 구현	
	public void draw() {
		System.out.println("========원형을 그렸습니다.========");
		System.out.println("면색:" + super.getFillcolor());
		System.out.println("선색:" + super.getLinecolor());
		System.out.println("가로:" + this.radius);
		System.out.println("================================");
	}	
	

	
	//shape의 area()메소드 오버라이드: 넓이 구하는 함수
	public void area() {
		System.out.println("원의 넓이--------------");
		System.out.println(3.14*radius*radius);
		System.out.println("---------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
