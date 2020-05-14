package com.yedam.classes.inherit;

public class Tire {
	public int maxRotation; // 타이어 수명 회전수
	public int accumulatedRotation; // 현재 사용된(누적된) 회전수
	public String location; //타이어의 위치
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	public boolean roll() { 
		++accumulatedRotation;//한번 호출 될때마다 누적 회전수에 추가
		if(accumulatedRotation < maxRotation) {//누적회전수가 수명보다 적을 경우에
			System.out.println(location + " Tire 수명" + (maxRotation-accumulatedRotation) + "회");
			return true;//사용 가능의 의미, 불린에서 참값을 반환시키는 것
		} else {
			System.out.println("***" + location + " Tire 펑크 ***");
			return false;//사용 불가능의 의미, 불린에서 거짓값을 반환시키는 것
		}
	}
}