package com.yedam.classes;

public class Account {
	private String ano; //외부 클래스에서 바로 이 필드로 못오도록 잠금 //계좌번호
	private String owner; //예금주
	private int balance; //잔액
	public Account(String ano, String owner, int balance) { // 오른쪽 마우스 - 소스 - 컨스트럭터 필드 - 디폴트 확인, 생성자는 클래스 이름이랑 같고 인스턴스를 만들어주는 용도이다.
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
