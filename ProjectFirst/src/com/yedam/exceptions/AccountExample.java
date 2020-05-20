package com.yedam.exceptions;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(1000);
		
		try {
			account.withdraw(2000);
		} catch (BalanceInsufficientException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();//예외가 발생하는 영역을 추적해서 메세지를 띄워줌, 일반 사용자는 에러가 나는 것을 알 필요가 없으므로 주석 처리 해주면 된다
		} finally {
			System.out.println("실행할 메뉴를 선택하세요");
		}
		System.out.println("end of program");
	}
}
