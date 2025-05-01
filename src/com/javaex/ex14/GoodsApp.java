package com.javaex.ex14;

public class GoodsApp {
	
	//static 먼저 조사 --> 스태틱영역에 올려놓는다
	//스태틱 메모리에서 main()을 실행한다. 이름 바뀌면 얘가 못 읽음

	public static void main(String[] args) {

		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		System.out.println(Goods.count);		
		
		//Q.0000000000000000000
		//public 사용시 다른사람이 입력값을 변경할 수 있는데, 그게 싫으면
		//private static int count; 로 바꾸고
		//System.out.println(cup.getCount()); 이렇게 쓰면 되는지?	
		
		
		
		
		
		
		Goods cup = new Goods("머그컵",2000);
		System.out.println(cup.getCount());	
		
		
		
	}

}
