package com.yedam.classes.statics;

public class Calculator {
	static double pi = 3.14; //static는 인스턴스를 만들지 않아도 pi를 바로 쓸수 있다. 클래스가 선엔되는 시점에  매개변수 이름(sum, pi)라는 것을 사용 할 수 있도록 준비 시킨다.
	static int sum (int a, int b) {
		return a+b;
	}
}
