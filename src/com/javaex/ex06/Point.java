package com.javaex.ex06;

public class Point {
	
	//필드
	
	private int x;
	private int y;
	
	//생성자
	
	
	//메소드gs
	
	public void setX (int x) { 
		this.x =x;   //x가 이름이 겹치니 틀에서 x앞에 this를 먹여줌. 눈에 띄는 오류는 안뜨지만 결과값에는 오류가 생김. 
		             //그럼 찍었을 때 해당 몸에 있는 값만 적용 됨.
	}
	
	public int getX() {
		return x;
	}
	
	public void setY (int y) {
		this.y =y;
	}
	
	public int getY() {
		return y;
	}
	
	//메소드
	
	public void draw(){
		System.out.println("점[x는:"+ x + " y는:" + y + "]을 그렸습니다.");
		
	}
}
