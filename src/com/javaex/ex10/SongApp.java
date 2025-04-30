package com.javaex.ex10;

public class SongApp {

	public static void main(String[] args) {
	
		Song A01=new Song("아이유", "좋은날", "Real", 2010, 3, "이민수작곡");
		A01.showInfo();
		
		Song A02=new Song("빅뱅", "거짓말", "Real", 2010, "이민수작곡");
		A02.showInfo();
		
		Song A03=new Song("버스커버스커", "좋은날", "Real", 2010, 3, "이민수작곡");
		A03.showInfo();
		
	}

}
