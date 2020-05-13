package com.yedam.classes.inherit;

public class Parent {
	private String lastName;
	private String firstName;
	private String telNumber;//집전화번호
	
	protected Parent() {
		
	}

	public Parent(String lastName, String firstName, String telNumber) {
		super();//부모클래스를 의미 하는데, 자바의 모든 클래스는 object클래스를 상속 받고 있기 때문에 자동생성시 super();가 생성 된다.
		this.lastName = lastName;
		this.firstName = firstName;
		this.telNumber = telNumber;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	@Override //기본적으로 상속 받고 있는 object클래스를 재정의 한다.
	public String toString() {
		return "lastName="+lastName+"firstName"+firstName;
	}

	
	
}
