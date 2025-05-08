package com.javaex.ex23;

public abstract class Shape {
	
	//필드
	private String fillcolor;
	private String linecolor;
	
	
	
	//생성자
	public Shape() {
		
	}
	
	public Shape(String fillcolor, String linecolor) {
		this.fillcolor = fillcolor;
		this.linecolor = linecolor;
	}

	

	//메소드-gs
	
	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}


	
	//메소드-일반
	
	@Override
	public String toString() {
		return "Shape [fillcolor=" + fillcolor + ", linecolor=" + linecolor + "]";
	}
	
	
	
	//----오버라이딩용-----
	/*
	public void draw() {
		//코드 쓸 게 없어서 억지로 씀
		System.out.println("shape draw()");
	}	
	*/
	
	
	/*
	코드는 작성하고 싶어도 못한다 ---> 안만들면 되잖아?
	그러나 필요는 하다 ---> 자식들이 만들어야 한다
	오버라이딩용 메소드 작성 메소드 껍데기만 만들기
	abstract 사용해서 내부코드는 없어도 되게 한다.
	abstract 를 사용한 메소드는 자식이 꼭 구현해야한다.
	*/
	public abstract void draw(); //내용을 안써도 됨   ----> 오버리딩용 메소드 (자식쪽에 꼭 같은 메소드가 있어야함)
	
	//public abstract void soojin();
	public void area() {
		System.out.println("어쩔 수 없이 만들었음");
	}
	
}
