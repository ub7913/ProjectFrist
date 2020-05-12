package com.yedam.classes.inherit;

public class DmbExample {
	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("DMB폰", "흰색", 10);
		System.out.println(dcp.model); //DmbCellPhone에는 model이 없지만, CellPhone을 상속 받기 때문에 model을 쓸수 있다.
		System.out.println(dcp.channel);//DmbCellPhone가 정의한 channel도 쓸수 있다.
		//부모 클래스의 메소드
		dcp.powerOn();
		dcp.powerOn(1);
		dcp.bell();
		dcp.sendVoices("안녕하세요");
		dcp.receiveVoices("반갑습니다");
		//자식 클래스의 메소드
		dcp.turnOnDmb();
		dcp.changeChannel(10);
		dcp.turnOffDmb();
		
		dcp.powerOff();
	}
}
