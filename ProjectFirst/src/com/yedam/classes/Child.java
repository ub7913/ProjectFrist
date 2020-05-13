package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class Child extends Parent {	
	Child(){
		super(); // Paraent(); 생성자를 protected로 바꾸니 접근 된다.
	}
	Child(String lastName, String firstName, String telNumber){
		super(lastName, firstName, telNumber);
	}
	//protected 구분
	void showInfo() {
		Child child = new Child();
		child.getLastName();// default 다른 패키지에 있어서 불러 올수가 없음
		child.getFirstName();// protected 다른 패키지에 있지만 상속된 클래스라서 불러올수 있다
		child.getTelNumber();//public 
	}
}
