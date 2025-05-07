package com.javaex.ex22_1;

public class ShapeApp {
	//수진 오버라이딩 복습

	public static void main(String[] args) {
		
		Triangle t01 = new Triangle("핑크","하늘",23,8);
		//System.out.println(t01.toString());
		//t01.showInfo();
		
		Circle c01 = new Circle("하얀","회색",15);
		//System.out.println(c01.toString());
		//c01.showInfo();
		
		Rectangle r01 = new Rectangle("보라","남색",35,13);
		//System.out.println(r01.toString());
		//r01.showInfo();
		
		//여기에 도형들 저장.
		Shape[] sArray = new Shape[3];
		sArray[0] = t01;
		sArray[1] = c01;
		sArray[2] = r01;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].showInfo();
			//부모쪽에 쇼인포 만들지 않으면 출력 노.
		}
		
	}

}
