package com.javaex.ex16;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	//생성자
	public Goods() {
		
	}


	//ctrl+shift+s ==> constructor using field ==>generate
	//(필드에 적힌 거 기준으로 만들어줌)
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}



	
	//메소드-gs
	//ctrl+shift+s ==> constructor getter setter ==>generate
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}	
	

	
	//메소드-일반

	public void showInfo() {
		System.out.println("----------------");
		System.out.println("이름:" +  name);
		System.out.println("가격:" +  price);
		System.out.println("----------------");
	}
	

	
	//ctrl+shift+s ==> constructor toString ==>generate
	//이건 값 확인용(개발). showInfo는 html꾸미기용
	/*
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	 */






}
