package com.javaex.ex15;

public class Math {
	
	//필드
    //private String name; 
	//private int price;
	//생략가능
	private static final double PI = 3.151592;
	
	//생성자
	/*
	public math() {
		//메모리
		//얘는 완전 생략 가능한 게 아니라 얘가 만들어주니까 
	}
	*/
	
	
	
	
	
	//생성자2
	
	//매소드-gs

	//메소드-일반
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}

	
	
	public static double circleArea(int radius) {
		double result = PI * radius * radius;
		return result;
	}
	
	
	
	
	
	
}
