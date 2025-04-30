package com.javaex.ex11;

public class Point {
	
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		
	}
	
	
	
	//생성자2
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	//메소드 gs
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

	public void draw(){
		System.out.println("x는:" + x + " y는:"+ y + "을 그렸습니다.");
	}

	
	
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("x는:" + x + " y는:"+ y + "을 그렸습니다.");
			System.out.println("--------------------------");
		}else {
			System.out.println("x는:" + x + " y는:"+ y + "을 지웠습니다.");
		
		}
		
	}
	
	
	
	public void remove() {
		System.out.println("x는:" + x + " y는:"+ y + "을 지웠습니다.");
		
		
	}






}
