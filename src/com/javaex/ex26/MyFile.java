package com.javaex.ex26;

import java.io.IOException;

public class MyFile {

		
		//하드 디스크에 있는 파일을 읽는 클래스

		//필드
		
		//생성자
		
		//메소드gs
		
		//메소드일반
		public String read(String path) {
			//path의 파일을 찾는다 C:\javaStudy\java\노래.txt
			//파일의 내용을 읽어서 변수에 담는다
			String result = "학교종이 땡땡땡 어서 모이자";
			
			return result;
		
		}
		
	
		
		public String read2(String path) {
			//path의 파일을 찾는다 C:\javaStudy\java\노래.txt
			//파일의 내용을 읽어서 변수에 담는다
			//정상적이면 리턴
			
			
			//**파일이 없는 경우
			try {
				//path의 파일을 찾는다 C:\javaStudy\java\노래.txt
				//파일의 내용을 읽어서 변수에 담는다
				//정상적이면 진행

				//!!!!!!!!!!!!!!!!!!!!!!!!!!!
				//예외발생 (파일이 없다)
				throw new IOException(); //파일이 없는 상황을 강제로 만듬
				
			}catch (Exception e) {
				System.out.println("파일이 없습니다.");
			}
			
			return "";

		}
		
		
		
		//파일이 없어서 못 읽었을 때 예외처리를 하지 않음 -->알려만 준다.
		public void read3(String path) throws IOException {
			
				throw new IOException(); //재연할 수 없어 강제로 쓴 문법임. 존재하지 않음.
										//파일이 없는 상황을 강제로 만듬		
		}

}
