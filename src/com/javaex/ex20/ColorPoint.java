package com.javaex.ex20;

public class ColorPoint extends Point {//자식

	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}

	
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}

	
	public ColorPoint(int x, int y, String color) {
		/*
		//초기화1-부모의 생성자이용1
		super(x, y);
		this.color = color;
		*/
		
		
		//초기화2-부모의 필드이용 - setter 이용
		super.setX(x);
		super.setY(y);
		this.color = color;
		System.out.println("ColorPoint(3)");
	}
		/*
		//초기화3 - 부모의 필드가 protected일때
		//super();
		super.x=x;
		super.y=y;
		this.color = color;
		/*
	
	
	
	//메소드-gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//메소드-일반
	/*
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	 */
	
	public void showInfo() {
		System.out.println("=============");
		System.out.println("x는: " + super.getX());
		System.out.println("y는: " + super.getY());
		System.out.println("색은: " + this.color);
		System.out.println("=============");
		
		/*부모의 필드가 protectd 일 때
		System.out.println("=============");
		System.out.println("x는: " + super.x);
		System.out.println("y는: " + super.y);
		System.out.println("색은: " + this.color);
		System.out.println("=============");
		*/
		
	}
	
}
