package com.yedam.interfaces;

import java.util.Scanner;

public class EmpMain {//실행
	public static void main(String[] args) {
		//1.입력 2.전체리스트 3.수정 4.삭제 5.종료
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();
//		EmpServiceImpl service = new EmpServiceImpl();
//		EmpseviceImplVer2 service = new EmpServiceImplVer2();
		while(true) {
			System.out.println("===================================");
			System.out.println("1.입력  2.전체리스트  3.수정  4.삭제  5.종료");
			System.out.println("===================================");
			System.out.println("선택> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("입력선택");
				System.out.println("사원번호 입력: ");
				int empId = scn.nextInt();scn.nextLine();
				System.out.println("성 입력: ");
				String lastName = scn.nextLine();
				System.out.println("급여 입력: ");
				int salary = scn.nextInt();scn.nextLine();//scn.nextInt();다음에는 scn.nextLine();넣어주기 안그러면 오류남
				System.out.println("입사일 입력(2020/05/05): ");
				String hireDate = scn.nextLine();
				
				Employee emp = new Employee(empId, lastName, salary, hireDate);
				service.createEmp(emp);
				
			} else if (menu == 2) {
				service.getEmpList();
				
			} else if (menu == 3) {
				System.out.println("변경 사원번호 입력");
				int empId = scn.nextInt();
				System.out.println("급여 입력");
				int salary = scn.nextInt();
				
				Employee emp = new Employee(empId, "", salary, "");
				service.changeEmp(emp);
				
			} else if (menu == 4) {
				System.out.println("삭제할 사원번호 입력: ");
				int empId = scn.nextInt();
				
				service.removeEmp(empId);
				
			} else if (menu == 5) {
				break;
			}
		}// end of while loop
	}
}
