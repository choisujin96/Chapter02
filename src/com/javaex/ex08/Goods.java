package com.javaex.ex08;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Goods() {//기본생성자 -- 아무것도 없을 땐 얠 자동으로 만들지만(디폴트 생성자),
		            //밑에 다른 생성자가 있을 때 어? 생성자 있네?하고 디폴트 생성자를 만들지 않아서 작동을 안한다.   
		                      
		//메모리에 올린다
	}
	
	//생성자 오버로딩
	public Goods(String name, int price) {
		//메모리에 올리는 일
		this.name = name;
		this.price = price;
	}//#####
	//이거는 자동으로 만들지 않음.
	

	//메소드gs
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int price() {
		return price;
	}
	
	
	
	//메소드
	
	public void showInfo() {
		
		System.out.println("이름: " + name );
		System.out.println("가격: " + price );
		System.out.println("++++++++++++++++++++");
	}

}
