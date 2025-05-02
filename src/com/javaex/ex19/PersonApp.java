package com.javaex.ex19;

public class PersonApp {

	public static void main(String[] args) {

		//Student s01 = new Student();
		//s01.setSchoolName("제주고등학교");
		//이름
		//나이
		//이건 person 추가 전이라 추가할 수 없었음. (지금은 가능)
		
		
		// 필드가 각각 나눠져있지만 
		//extends "person" 을 추가해서 클래스(틀)가 나눠져도 가능함
		 Student s02 = new Student();
		 s02.setSchoolName("서울고등학교");
		 s02.setName("최수진");
		 s02.setAge(30);
		 
		 
		 
		 System.out.println("-------------------");
		 
		 Student s03 = new Student("이효리", 22,"제주고등학교");		 
		 
		 System.out.println(s03.getSchoolName());
		 System.out.println(s03.getName());
		 System.out.println(s03.getAge());
		 
		 s03.showInfo();
		 
		 
		 
		/* 
		 <오늘의 내용>
		 -상속: 자식 클래스 extends 부모
		 
		 -생성자 순서-> 자식의 생성자 시작(끝이아님)
		            부모의 생성자시작->끝
		            자식의 생성자 끝
		            
          -틀: 자식의 생성자가 부모생서ㅇ자를 고르는 방법
              자식의 부모의 필드에 접근하는 방법
              (값을 넣는다, 읽는다)
              
          private은 부모자식간에도 안된다
          protected 사용시 가능(캡슐화 유지. 자식에게 허용, 외부는 접근 불가)
		*/
	
	}

}
