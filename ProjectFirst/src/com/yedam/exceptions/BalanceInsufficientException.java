package com.yedam.exceptions;

public class BalanceInsufficientException extends Exception { // 우리가 예외처리를 만들때는 Exception클래스를 상속 받아서 만들어야 한다
	public BalanceInsufficientException() {
		System.out.println("잔고부족합니다");
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
