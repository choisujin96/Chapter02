package com.javaex.ex01;

public class GoodsApp {

	//시나리오 짜는 곳
	public static void main(String[] args) {
		            //main이 붙은 애가 첫번째
		
		Goods camera = new Goods();
		camera.name="니콘";
		camera.price=400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		System.out.println("======================");
		
		Goods cup = new Goods();
		cup.name="머그컵";
		cup.price=2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);

		System.out.println("======================");
		
		Goods computer = new Goods();
		computer.name="LG그램";
		computer.price=1000000;		
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		System.out.println("======================");
		
		System.out.println(camera.price);
		
		
		
	}

}
