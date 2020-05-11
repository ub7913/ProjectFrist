package com.yedam.classes;

public class Calculator {
	String model;
	void powerOn() { //리턴타입이 없으면 void
		System.out.println("전원을 켭니다.");
	}
	int sum(int num1, int num2) { //인트타입의 메소드라서 리턴타입이 필요하다.
		return num1 + num2;
	}
	double sum(double num1, double num2) { //배개변수의 갯수가 달라지거나 타입이 달라지면 매개이름이 같아도 구분이 된다.
		return num1 + num2;
	}
	void println(String str) {
	System.out.println("결과 값은 : "+str);
	}
	void println(int str) {
	System.out.println("결과 값은 : "+str);
	}
	void println(double str) {
	System.out.println("결과 값은: "+str);
	}
	double getAreaRectangle(double width, double height) { // 넓이 구하는 계산식
		return width * height;
	}
	double getAreaRectangle(double width) { // 만약 정사각형이라면 매개변수를 하나만 선언해 오버로딩 하면된다.
		return width * width;
	}
}
