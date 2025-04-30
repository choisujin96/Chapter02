package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(800000);
		camera.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(3000);
		cup.showInfo();
		
		/*
		Goods computer = new Goods();
		computer.setName("엘지그램");
		computer.setPrice(1000000);
		computer.showInfo();
		*/
		
		
		// 아래는 #####을 만들어야 실행가능
		//이곳에 setName과 setPrice를 적용하지 않고 값만 같이 넣어주면 실행됨
		Goods computer = new Goods("엘지그램",1000000);
		computer.showInfo();
		
	}

}
