package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		//====아이유====
		Song A01 = new Song(); // 파일 이름이 아닌 생성자를 호출하는 것.
		
		A01.setArtist("아이유"); 
		A01.setTitle("좋은날");
		A01.setAlbum("Real");
		A01.setYear(2010);
		A01.setTrack("3번트랙");
		A01.setComposer("이민수작곡");
		
		A01.showInfo();
		
		//====빅뱅====
		Song A02 = new Song();
		
		A02.setArtist("빅뱅");
		A02.setTitle("거짓말");
		A02.setAlbum("Always");
		A02.setYear(2007);
		A02.setTrack("2번트랙");
		A02.setComposer("G-dragon작곡");
		
		A02.showInfo();
		
		//====버스커버스커====
		Song A03 = new Song();
		
		A03.setArtist("버스커버스커");
		A03.setTitle("벚꽃엔딩");
		A03.setAlbum("버스커버스커1집");
		A03.setYear(2012);
		A03.setTrack("4번트랙");
		A03.setComposer("장범준작곡");
		
		A03.showInfo();
	}

}
