package com.javaex.ex05;

public class Goods {//틀, 도장
	
	
	//==필드==
		private String name;
		private int price;
		
		
		//==생성자==
		
		
		
		//==메소드==
		
		
		//name등록
		public void setName(String n) {
			name = n;
		}
		

		//name읽어오기
		public String getName() {
			return name;
		}
		
		
		//price등록
		public void setPrice(int p) {
			price=p;
		}
		
		
		
		//price읽어오기
		public int getPrice() {
			return price;
		}
		
		//정보출력/ 똑같은 걸 반복해야 하니까 한꺼번에 출력. 붕어빵 틀을 다시 만듬
		public void showInfo(){
			System.out.println("================");
			System.out.println("이름" + name);
			System.out.println("가격" + price);
			System.out.println("================");
		}
		
		
		
		

}
