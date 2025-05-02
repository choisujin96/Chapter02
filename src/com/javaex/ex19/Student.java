package com.javaex.ex19;

public class Student extends Person {

	// 필드

	private String schoolName;

	// 생성자

	public Student() {
		// super()
		System.out.println("student()");
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("student(1)");
	}

	public Student(String name, int age, String schoolName) {
		super(name, age); // person의 파라미터 2개짜리 생성자 실행
		this.schoolName = schoolName;
		System.out.println("student(3)");
	}

	/*
	 * 자식쪽에서 부모 생성자를 부를때, 슈퍼에 입력된값을 확인한다(부모 생성자를 찾아갈 자료형)
	 * 
	 * 자식에 부모를 생서하러 때 (이효리,22) 입력값에 해당하는 생성자를 찾아간다 해당하는 생성자의 값을 찍는다(출력)
	 * 
	 * (아무것도 없으면 기본생성자를 찾아감.)
	 * 
	 * 
	 * --결과값-- 부모 먼저 생성해서 person(2) 먼저찍고 부모생성끝/ Student() 스튜던트(자식) 생성
	 */

	// 메소드-gs

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드 일반
	/*
	 * @Override public String toString() { return "Student [schoolName=" +
	 * schoolName + "]"; }
	 */

	public void showInfo() {
		System.out.println("===========");
		//System.out.println("이름: " + super.getName());  //아무리 부모 자식이어도 private이면 읽을 수 없음. 그래서 getter로 가져와서 출력한다.
		System.out.println("이름: " + name); //상속된 클래스까지 허용해주는 protected를 사용해서 name이 사용가능하다.
		System.out.println("나이: " + super.getAge());			//super를 굳이 안써도 되지만 부모쪽과 자식쪽 구별위해 공부할 땐 사용하는 게 좋을듯.	
		System.out.println("학교: " + this.schoolName); //내꺼의 스쿨네임
		System.out.println("===========");
	}

}
