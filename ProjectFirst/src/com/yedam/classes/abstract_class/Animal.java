package com.yedam.classes.abstract_class;
//추상클래스
public abstract class Animal { //추상 클래스 명시 해줄것
	String kind;
	public Animal(String kind) {
		this.kind=kind;
	}
	public void breathe() {//실행 할 수 있도록 메소드를 {}안에 정의 했다
		System.out.println("숨을 쉰다");
	}
	public abstract void kind() ;
	public abstract void sound();//추상메소드 _정의는 할 수 있지만 실행 할 수 없다. 실행시키기 위해서 자식 클래스에서 반드시 정의해줘야 한다. , 일반 메소드에서는 추상 메소드를 구현 할 수 없다. 
}
