package com.yedam.classes.statics;

public class CalExample {
	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.pi = 2.2; new를 통해서 인스턴스를 만드는 것은 다른 기능들을 사용 할 때 필요
		
		Calculator.pi = 3.14;
		Calculator.sum(45, 55); // 왜 구분해서 쓰는가 하면, 달리 뭔가 할필요 없이 딱 한 기능만 사용 할때는 static을 사용 한다. new를 통한 인스턴스가 필요 없음
	}
}
