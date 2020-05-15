package com.yedam.interfaces;

public class Television implements RemoteControl {//현재 이 클래스는 RemoteControl를 구현하는 클래스이다.

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

}
