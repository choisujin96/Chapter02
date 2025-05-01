package com.javaex.ex14;

public class Goods {

	// 필드

	private String name;
	private int price;
	public static int count; // 전역변수 (다같이 갖고 있는 변수)
	
	
	
	
	// 생성자
	public Goods() {
		count = count+1;

	}

	// 생송자2
	public Goods(String name, int price) {
		count = count+1;
		this.name = name;
		this.price = price;
	
	}

	// 메소드gs
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}
	
	
	// 메소드일반
	public void showInfo() {
		System.out.println("이름:" + name + " 가격:" + price);
	}
}
