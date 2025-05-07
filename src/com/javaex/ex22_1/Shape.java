package com.javaex.ex22_1;

public class Shape {
	
	//필드
	private String fillColor;
	private String lineColor;


	
	//생성자
	
	public Shape() {
		
	}
	
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}



	
	//메소드-gs
	public String getFillColor() {
		return fillColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	public String getLineColor() {
		return lineColor;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}


	
	//메소드-일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	public void showInfo() {
		//오버라이딩 위해 만들어진 것
	}
	
}
