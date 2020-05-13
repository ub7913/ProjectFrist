package com.yedam.classes.inherit;

public class University extends Friends {
	String major;
	
	public University(String name, String tel, String major) {
		super(name,tel);
		this.major=major;
	}
	
	
	
	@Override
	public void ShowInfo() {
		// TODO Auto-generated method stub
		super.ShowInfo();
		System.out.println("학과: "+getMajor());
	}



	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
