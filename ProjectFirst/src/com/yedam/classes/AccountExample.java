package com.yedam.classes;

import java.util.Scanner;

public class AccountExample {
	public static void main(String[] args) {
		/*java.util.*/Scanner scn = new Scanner(System.in); //Scanner 오류 위에 import 눌러주기 // new Scanner오류 뜨면,System.in입력해서 키보드로 입력하는 값을 쓰겠다는 것을 말해줘야함
		Account[] accounts = new Account[100];
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성   2.계좌목록   3.예금   4.출금   5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();/*키보드로 입력 한 값을 menu라는 것에 담겠다.*/ scn.nextLine(); //입력 할 때까지 기다리고 있다.
			if (menu==1) {
				System.out.println("계좌생성 선택");
				System.out.println("계좌번호를 입력하세요");
				String ano = scn.nextLine(); // 문자 타입이니까 nextLine
				System.out.println("예금주 입력하세요");
				String owner = scn.nextLine();
				System.out.println("금액을 입력하세요");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i=0; i<accounts.length; i++) {
					if(accounts[i]==null) {//배열 공간안에 null일 경우에만 데이터를 집어 넣는다는 의미
					   accounts[i] = acnt;
					   break;
					}
				}
				System.out.println("계좌 생성되었습니다");
			} else if (menu==2) {
				System.out.println("계좌목록 선택");
				for(Account acc : accounts) {
					if(acc != null) { // acc가 null이 아닐 경우에만 실행 할것을 조건 걸어 줌, 전체 배열중에 값이 있는 경우에만 출력
					System.out.println("계좌번호: "+acc.getAno()+
							           ", 예금주: "+acc.getOwner()+
							           ", 잔액: "+acc.getBalance()); //if(acc != null)조건이 없으면 배열 안에서 null이 있는 공간 때문에 null point exception이라는 오류 뜸 그래서, if(acc != null) 써준다
					}
				}
			} else if (menu==3) {
				System.out.println("예금 선택");
				System.out.println("계좌번호 입력하세요");
				String ano = scn.nextLine();
				System.out.println("예금액 입력하세요");
				int balance = scn.nextInt();
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(ano)) { // 'acc != null &&' 를 넣어 줌으로 acc가 null이 아니면서 acc.getAno()'입력계좌번호'와 ano가 같을때 실행 시켜줌
						int result = acc.getBalance(); //현재잔액을 의미
						acc.setBalance(result + balance);
					}
				}
				System.out.println("예금 처리가 되었습니다");
			} else if (menu==4) {
				System.out.println("출금 선택");
				System.out.println("계좌번호 입력하세요");
				String ano = scn.nextLine();
				System.out.println("출금액 입력하세요");
				int balance = scn.nextInt();
				for(Account acc : accounts) {
					if(acc != null && acc.getAno().equals(ano)) {
						int result = acc.getBalance(); //현재잔액을 의미
						acc.setBalance(result - balance); //출금은 산술 기호인 -로만 바꾸면 된다.
					}
				}
				System.out.println("예금 처리가 되었습니다");
			} else if (menu==5) {
				System.out.println("종료 선택");
				break;//키보드로 5를 입력했을때 break가 실행 됨
			}
		}//end of while()
		System.out.println("프로그램 종료");
	}//end of main
}//end of class
