package com.yedam.interfaces;

public interface EmpService { //인터페이스
	// 기능정의, 구현은 안함
	//한건 생성
	public void createEmp(Employee emp);//public abstract void createEmp(); 추상메소드가 만들어짐
	
	//전체 조회
	public void getEmpList();
	
	//한건 수정
	public void changeEmp(Employee emp);
	
	//한건 삭제
	public void removeEmp(int empId);
}
