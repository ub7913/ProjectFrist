package com.yedam.classes.statics;

public class Car { // public은 다른 클래스에도 Car클래스를 호출 할수 있다는 뜻
	private int speed; //접근 수준을 정함. speed는 현재 이 클래스 안에서만 접근 할수 있다. 초기값 0
	private boolean stop; // 초기값 false
//	Car(int speed) {
//		this.speed = speed;
//	}
	void setSpeed(int speed) {
		if(speed<0)
			this.speed = 0;
		else
		    this.speed = speed;
	}
	
	int getSpeed() {
		return this.speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop; //오른쪽 마우스 - 소스 - 게터 세터 - 선택 - 디폴트 확인 , 편하게 사용 하기 위해 이클립스에서 제공해주는 메소드 만들기
		this.speed = 0;
	}
	
	
}
