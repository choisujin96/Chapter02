package com.javaex.ex17;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}
	
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
		
	
	
	//메소드 - gs
	public void setX(int x) {
		this.x=x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}



	
	//메소드 일반
//	
	/*/개발 체크용
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	 */
	
	
	public void draw() {
		System.out.println("x는:" + x + " y는:" + y);
	}
	

}
