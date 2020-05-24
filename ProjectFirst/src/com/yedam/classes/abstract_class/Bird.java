package com.yedam.classes.abstract_class;

public class Bird extends Animal{
	
	public Bird(String kind) {
		super(kind);
	}

	@Override
	public void kind() {
		System.out.println("새");
		
	}

	@Override
	public void sound() {
		System.out.println("짹짹");//정의를 해주지 않으면 에러가 난다.
	}
	
}
