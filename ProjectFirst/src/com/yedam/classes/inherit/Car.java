package com.yedam.classes.inherit;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0; //4개타이어 모두가 정상적으로 움직이고 있을때 0, 이걸 넣어 주니까 run()의 오류가 사라짐
	}//end of run()
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}//end of stop()
}//end of class