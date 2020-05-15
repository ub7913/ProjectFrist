package com.yedam.interfaces;

public class Audio implements RemoteControl { // Audio위에 에러 뜨면 add umimplemnted method 클릭 ,implements는 인터페이스를 구현한다는 의미

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
	}
	
}
