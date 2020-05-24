package com.yedam.classes.abstract_class;

public class Cat extends Animal {

	public Cat(String kind) {
		super(kind);
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	//public abstract void eat();//추상 메소드는 추상 클래스에서만 사용 할 수있다.

	@Override
	public void kind() {
		System.out.println("고양이");
		
	}
}
