package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {//여기에 찍을거임.필드

		//메모리에 올리고
				Goods camera = new Goods();
				Goods cup = new Goods();
				Goods computer = new Goods();
				
				
				
				//니콘세팅
				camera.setName("니콘");
				camera.setPrice(400000);
				
				//머그컵세팅
				cup.setName("머그컵");
				cup.setPrice(2000);
				
				//LG그램세팅
				computer.setName("Lg그램");
				computer.setPrice(1000000);
				
				
				//니콘출력
				String cameraname = camera.getName();
				camera.showInfo();
				/*
				int cameraprice = camera.getPrice();
				System.out.println("이름:" + camername);
				System.out.println("가격: "+cameraprice);
				*/
				
				
				
				//머그컵출력
				String cupname = cup.getName();
				cup.showInfo();
				
				/*
				int cupprice = cup.getPrice();
				System.out.println("이름:" + cupname);
				System.out.println("가격:" + cupprice);
				*/
				
				
				//LG그램 출력
				String computername  = computer.getName();
				computer.showInfo();
				
				/*
				int computerprice = computer.getPrice();
				System.out.println("이름: " + computername);
				System.out.println("가격: " + computerprice);
				*/

	}

}
