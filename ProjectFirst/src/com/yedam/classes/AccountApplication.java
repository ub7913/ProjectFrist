package com.yedam.classes;

import java.util.Scanner; // 단축키 컨트롤 쉬프트 'o'

//AccountExample->AccountAplication
public class AccountApplication {
	private Scanner scn = new Scanner(System.in);
	private Account[] accounts = new Account[100];
	//생성자 따로 안해줄것임
	//메소드 생성
	//1.계좌생성
	private void createAccount() {
		System.out.println("계좌생성 선택");
		System.out.println("계좌번호를 입력하세요");
		String ano = scn.nextLine();
		System.out.println("예금주 입력하세요");
		String owner = scn.nextLine();
		System.out.println("금액을 입력하세요");
		int balance = scn.nextInt();
		Account acnt = new Account(ano, owner, balance);
		for (int i=0; i<accounts.length; i++) {
			if(accounts[i]==null) {
			   accounts[i] = acnt;
			   break;
			}
		}
		System.out.println("계좌 생성되었습니다");
	}
	//2.계좌목록
	private void accountList() {
		System.out.println("계좌목록 선택");
		for(Account acc : accounts) {
			if(acc != null) { 
			System.out.println("계좌번호: "+acc.getAno()+
					           ", 예금주: "+acc.getOwner()+
					           ", 잔액: "+acc.getBalance());
			}
		}
	}
	//3.입금
	private void deposit() {
		System.out.println("예금 선택");
		System.out.println("계좌번호 입력하세요");
		String ano = scn.nextLine();
		System.out.println("예금액 입력하세요");
		int balance = scn.nextInt();
//		for(Account acc : accounts) {
//			if(acc != null && acc.getAno().equals(ano)) { 
//				int result = acc.getBalance();
//				acc.setBalance(result + balance);
//			}
//		}
		Account acnt = findAccount(ano);
		if (acnt != null) {
			acnt.setBalance(acnt.getBalance()+balance);
			System.out.println("예금 처리가 되었습니다");
		} else {
		System.out.println("해당 계좌가 없습니다");
		} //출금도 바꿔보기
	}
	//4.출금
	private void withdraw() {
		System.out.println("출금 선택");
		System.out.println("계좌번호 입력하세요");
		String ano = scn.nextLine();
		System.out.println("출금액 입력하세요");
		int balance = scn.nextInt();
//		for(Account acc : accounts) {
//			if(acc != null && acc.getAno().equals(ano)) {
//				int result = acc.getBalance(); 
//				acc.setBalance(result - balance); 
//			}
//		}
		Account acnt = findAccount(ano);
		acnt.setBalance(acnt.getBalance()-balance);
		System.out.println("출금 처리가 되었습니다");
	}
	//5.종료
	
	//6.계좌번호를 입력하면 해당 Account를 반환해주는 메소드
	private Account findAccount(String ano) {
		Account result = null; //null 값 지정 안해주고 1
		for(Account acc : accounts) {
			if(acc != null && acc.getAno().equals(ano)) {
				 result = acc;   //return acc;2
				 return result; 
			} // else로는 왜 안되는가? accounts 배열이 한번도 실행 안될수도 있기때문에
		}
		return result; // return null;
	} 
	public void execute() {//얘만 호출 해서 쓸수 있도록 , AccountExample에서 메인메소드에 해당 되는
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성   2.계좌목록   3.예금   4.출금   5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			if(menu==1) {//1.계좌생성
				createAccount();
			} else if(menu==2) {//2.계좌목록
				accountList();
			} else if(menu==3) {//3.입금
				deposit();
			} else if(menu==4) {//4.출금
				withdraw();
			} else if(menu==5) {//5.종료
				break;
			}//end of if
		}//end of while()
		System.out.println("프로그램 종료");
	}//end of execute()
}//end of class


// 큰 구조 그리기 : 1.execute에 while 먼저 불러오기 2.if먼저 쭉 쓰기 3.만들어 놓은 메소드를 if안에 넣기(메소드로 호출 하겠다는 뜻) 4. 각 메소드안 정의 하기
