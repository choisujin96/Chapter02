package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		
		Goods camera = new Goods();
		
		//camera.name = "니콘" //캡슐화로 사용못함(private)
		camera.setName("니콘");
		String name = camera.getName();
		System.out.println(name);
		
	
		
		camera.setPrice(400000);
		int price = camera.getprice();
		System.out.println(price);
	}


}
