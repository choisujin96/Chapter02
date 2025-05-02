package com.javaex.ex19;

public class Person {
	
	
	//필드
	protected String name;
	private int age;

	
	
	//생성자

	public Person() {
		System.out.println("person()");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("person(2)");
	}


	
	//메소드-gs
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//메소드 일반
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	

	/*
	자식쪽에서 부모 생성자를 부를때,
	슈퍼에 입력된값을 확인한다(부모 생성자를 찾아갈 자료형)

	자식에 부모를 생서하러 때 (이효리(name), 22(age)) 입력값에 해당하는
	생성자를 찾아간다 해당하는 생성자의 값을 찍는다(출력)

	(아무것도 없으면 기본생성자를 찾아감.)


	--결과값--
	부모 먼저 생성해서 
	person(2) 먼저찍고 부모생성끝/
	Student() 스튜던트(자식) 생성 뿅
	*/
	
	
	
}
