package com.yedam.classes;

public class People {
	//속성(필드) 3가지
	String con;
	int pop;
	int avgh;
	
	//기능(메소드) 2가지
	void eat1(String str) {
		System.out.println(str + "을(를) 자주 먹습니다.");
	};
	void character(String str) {
		System.out.println(str + " 편입니다.");
	};
	
	
	void showInfo() { // 내가 정의했던 것들을 보이게 할 수 있음
		System.out.println("나라: "+con + "인구수: "+pop + "평균키: "+avgh);
	};
}
