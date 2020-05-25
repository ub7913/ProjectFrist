package com.yedam.interfaces;

interface Action {
	void work();
}

public class ActionExample { //원래라면 클래스를 하나 만들어서 임플리먼츠 해줘야 하는데 이번에는 익명객체를 만들어서 할것
	public static void main(String[] args) {
		Action action = new Action() {//인터페이스를 익명객체로 구현 하는 것이다.
			public void work() { //접근 수준을 public으로 변경 해준다.
				System.out.println("복사를 합니다.");
			}
		}; //익명객체는 반드시 마지막에 ';'붙일것.
		action.work();//복사를 합니다.
	}
}// 익명객체는 임플리먼츠 클래스를 밖에서 따로 구현 없이 인터페이스를 메인 클래스 안에서 구현 한다는 느낌.
