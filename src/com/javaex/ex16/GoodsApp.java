package com.javaex.ex16;

public class GoodsApp {

	public static void main(String[] args) {
		/*
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(5000);
	
		Goods cup = new Goods("머그컵", 20000);
		Goods computer = new Goods("lg그램", 250000);
		
		//값 확인용
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		System.out.println(computer.toString());
		
		
		
		
		camera.showInfo();
		cup.showInfo();
		computer.showInfo();
		
		System.out.println(camera.getName());
		System.out.println(cup.getName());
		System.out.println(computer.getName());
		*/
		
		
		
	////////////////////////////////////////////////////////////////////////////////////////
		
		//int[] intArr = new int[3];
		
		//Goods를 관리할 배열3칸을 만든다
		
		Goods[] goodsArr = new Goods[4];
		
		
		// 상품을 메모리에 올린다.
		Goods cup = new Goods("머그컵",2000);
		Goods camera = new Goods("니콘",500000);
		Goods computer = new Goods("LG그램",1000000);
		Goods haribo = new Goods("젤리",100);
		
		//배열에 상품의 !!!!!!주소!!!!!!를 대입한다.
		goodsArr[0] = cup;
		goodsArr[1] = camera;
		goodsArr[2] = computer;
		goodsArr[3] = haribo;
		
		//모든상품의 이름을 출력해라
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
		
		}
		
		for(int i=0; i<goodsArr.length;i++) {
			goodsArr[i].showInfo(); //이미 쇼인포 만들때 println을 만들었으니 안해도댐
		}
		
		
		
		
		
		
	}

}
