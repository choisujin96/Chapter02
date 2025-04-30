package com.javaex.ex13;

public class TvApp {

	public static void main(String[] args) {
		
		Tv tv = new Tv(7,20,false);
		tv.status();

		
		tv.setPower(true);
		tv.setChannel(68);
		tv.setVolume(100);
		tv.status();
		
		

		tv.setPower(false);
		tv.setChannel(50);
		tv.setVolume(100);
		tv.status();
		
		
	  //false면 나머지 애들이 작동 안하는 게 맞는지?
		//(위에 true값이 먹어요ㅠ)
		
		//볼륨이 작동 안하는 이유? 주르륵
		
		
	}

}
