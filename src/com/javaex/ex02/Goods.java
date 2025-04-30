package com.javaex.ex02;

//틀만드는창 (class = 틀)
public class Goods {
	
	
	//필드
	 private String name;
	 private int price;
	//private는 다른 사용자가 접근하지 못하게 하기 위함
	  
	//생성자 - 메모리에 올린다. (자동)
	 public Goods() {
		
			//우리가 따로 코드 짤 필요는 없음.
			//따로 자료형도 안붙음
		}
	 
	 
	//메소드
	//name 값 입력 //set = 세터(값 넣는애)
	 public void setName(String n){
		 //n이 "니콘"
		 //위에 있는 name 입력
		 name = n;
		 //return 필요없는 경우 비워놓을 수 없으니 void 사용
	 }	 
		 
	//name값 읽어오기 //get = 게터(값 읽는애)
	 public String getName(){//return이 있는 경우엔 자료형 그대로 갖고 와야함
		 return name; 
		 //밖으로 내보내기 위해 Return! 안하면 지만 읽고 끝냄.
	 }
	 
	//price 값 입력
	 public void setPrice(int p){
		 price = p;
	 }
	 
	//price값 읽어오기 
	 public int getprice() {
		 return price;
	 }
	 
	 
	 
	 

	
	

}
