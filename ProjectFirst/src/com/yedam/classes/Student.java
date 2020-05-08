package com.yedam.classes;

public class Student {//student를 실행할 수 있는 메인 메소드가 필요하다.
	//(속성) -> 필드
	String name; //이름
	int age; //나이
	double height; //키
	double weight; //몸무게
	//(생성자) -> 필드의 초기값 지정
	Student() {//내가 따로 정의를 하지 않으면 자바에서 스스로 클래스 이름의 생성자(Student())를 default로 만들어 준다.
		System.out.println("생성자호출");
	}
	Student(String name) {
		this.name = name; // this는 Student 클래스에 정의 되어 져 있는 필드들을 의미한다.
	}
	
	//(기능) -> 메소드
	void study() {
		System.out.println("공부합니다.");
	};//공부한다, 반환타입 필요 (void는 리턴값이 없는것), {}는 정의하는것
	void excercise() {
		System.out.println("운동합니다.");
	};//운동한다
	void eat(String str) {
		System.out.println(str + " 을 먹는다.");
	};//~을 먹는다
}
