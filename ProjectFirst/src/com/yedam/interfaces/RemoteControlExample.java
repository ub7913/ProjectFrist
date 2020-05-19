package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Audio(); //추상메소드와 비슷하게 인스턴스 생성 가능
		rc.turnOn();
		rc.turnOff();
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		//익명객체
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명 객체 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명 객체 끕니다.");
			}
			
		}; //하나의 실행문이기 때문에 ;으로 닫고 마무리 한다.
		rc2.turnOn();
		rc2.turnOff();
	}
}
