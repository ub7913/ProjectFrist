package com.yedam.interfaces;

public interface RemoteControl { // 추상클래스와 같이 인스턴스를 못만듬, 클래스를 만드는 용도이기에 규격만 정해주면된다, 큰 틀만 만들어 준다.
	// 상수 final static(포함) static 클래스 기준으로 움직여지는? final 한번 선언된 필드값이 다시 바뀌지 않음(변수가 아닌 상수)
	public int MAX_VOLUME = 0;
	public int MIN_VOLUME = 10;
	
	// 추상메소드
	public void turnOn();//{}선언하는 중괄호 없이 메소드만 선언되는 것을 추상 메소드라고 한다
	public void turnOff();
}
