package com.yedam.classes.inherit;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {//부모클래스의 메소드를 재정의 함, HankookTire로 수정
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명" + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}