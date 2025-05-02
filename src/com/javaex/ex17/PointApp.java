package com.javaex.ex17;

public class PointApp {

	public static void main(String[] args) {
		
		
		Point[] pArray = new Point[3];
		
		Point p01 = new Point(5,5);
		Point p02 = new Point(10,10);
		Point p03 = new Point(20,20);
		
		
		/*//개발 체크용
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());
		*/
		
		
		pArray[0] = p01; //배열에 !!!!주소!!!!를 대입
		pArray[1] = p02; //배열에 !!!!주소!!!!를 대입
		pArray[2] = p03; //배열에 !!!!주소!!!!를 대입
		
		for(int i=0; i<pArray.length; i++) {
			pArray[i].draw();
			
			
		}
		


	}

}
