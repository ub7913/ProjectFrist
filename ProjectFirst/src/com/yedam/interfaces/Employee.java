package com.yedam.interfaces;

public class Employee { //클래스 정의
	private int employeeId;
	private String lastName;
	private int salary;
	private String hireDate;
	// 생성자
	public Employee(int employeeId, String lastName, int salary, String hireDate) { //소스탭에서 제너레이터 유징 클릭
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	// get/set메소드
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	//toString 오버라이딩 하기
	@Override
	public String toString() { 
		return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + ", hireDate="
				+ hireDate + "]";
	}
}
