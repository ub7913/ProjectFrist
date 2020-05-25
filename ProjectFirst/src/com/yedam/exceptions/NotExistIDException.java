package com.yedam.exceptions;

public class NotExistIDException extends Exception {
	public NotExistIDException() {
		//System.out.println("아이디가 존재하지 않습니다");
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
