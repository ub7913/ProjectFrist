package com.yedam.classes;

public class Student {//student를 실행할 수 있는 메인 메소드가 필요하다.
	//(속성) -> 필드
	String name; //이름
	int age; //나이
	double height; //키
	double weight; //몸무게
	String major;
	//(생성자) -> 필드의 초기값 지정
	public Student() {//내가 따로 정의를 하지 않으면 자바에서 스스로 클래스 이름의 생성자(Student())를 default로 만들어 준다.
	}
	public Student(String name) {
		this.name = name; // this는 Student 클래스에 정의 되어 져 있는 필드들을 의미한다. 만약 String n이라고 한다면 굳이 this.는 필요 없지만 일반적으로 같은 매개변수 이름을 쓰기에 this.가 필요하다.
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String major) {
		this(name, age); // this.name = name 과  this.age = age를 포함해서 한번에 쓴것과 같다.
		//this();
		this.major = major;
	}
	
	//여러개의 생상자가 있을때 디폴트 생성자인 Student() 또한 같이 정의 해줘야 에러없이 실행가능하다. 만약 아무 생성자도 없으면 디폴트 생성자를 사용 할수 있다.
	
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
