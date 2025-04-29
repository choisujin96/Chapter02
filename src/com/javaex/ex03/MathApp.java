package com.javaex.ex03;

public class MathApp {

	public static void main(String[] args) {
		
		
		Math math = new Math();
		
		
		//틀에서 찍은 자료형이랑 똑같은 걸 사용하는데, 
		//만든사람이 뭘 썻는지 모르면 도움창에 정보가 나옴.
		int sum = math.plus(5, 2);
		System.out.println(sum);
		
	}

}
