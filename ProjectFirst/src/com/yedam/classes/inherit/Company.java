package com.yedam.classes.inherit;

public class Company extends Friends {
	String dept;
	
	public Company (String name, String tel, String dept) {
		super(name, tel);
		this.dept = dept;
	}
	
	@Override
	public void ShowInfo() {
		super.ShowInfo();
		System.out.println("부서: "+dept);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}