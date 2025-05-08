package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Triangle t01 = new Triangle("연두","파랑",10,5);
		t01.draw();

		
		Rectangle r01 = new Rectangle("핑크","검정",20,3);
		r01.draw();
		
		Circle c01 = new Circle("보라","남색", 8);
		//System.out.println(c01.toString());
		c01.draw();
		
		
		//모든 도형을 하나의 배열로 관리하고 싶다.
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = t01;
		sArray[1] = r01;
		sArray[2] = c01;
		
		for(int i=0; i<sArray.length; i++) {
		 
			System.out.println("면색:" + sArray[i].getFillcolor());
			System.out.println("선색:" + sArray[i].getLinecolor());
			System.out.println("가로:" + sArray[i]);
			System.out.println("--------------------------------");
		 */
		
		//////////////////////////////////////////////////////////////////
		
		Shape st = new Triangle("초록","검정",1000,100);
		//st.getFillcolor();
		
		Shape sc = new Circle("빨강","빨강",50);
		//sc.getFillcolor();
	
		Shape sr = new Rectangle("노랑","노랑",33,33);	
		//sr.getFillcolor();
		
		//하나의 배열에 모든 도형을 담는다 --> 자식쪽의 기능은 사용 할 수 없다.
		//해결방법 오버라이딩
		//모든 도형을 담을 수 있는 배열
		Shape[] sArray = new Shape[3];
	
		//도형 담기
		//sArray[0] = t01; //업캐스팅 자동으로 섞어쓰기 된다.
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		//전체 draw()로 출력--> 자식쪽의 기능으로 사용할 수 없다.
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		
		//첫번째방(삼각형)의 가로값을 읽고싶다 -->가려져서 못 읽는다.
		System.out.println(((Triangle)sArray[0]).getWidth());
		                   //강제변환하여 사용한다.
		System.out.println(((Rectangle)sArray[2]).getWidth());
		System.out.println(((Circle)sArray[1]).getRadius());
		
		
		
		st.draw();
		
		st.soojin();
		sr.soojin();
		sc.soojin();
		
	}
	
	
	
		
		
		
		
		
		
		
		
		
	
}
