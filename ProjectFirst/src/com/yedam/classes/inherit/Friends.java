package com.yedam.classes.inherit;

public class Friends {
	String name;
	String tel;
	
	public Friends(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public void ShowInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+tel);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
