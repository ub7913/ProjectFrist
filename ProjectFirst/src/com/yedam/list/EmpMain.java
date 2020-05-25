package com.yedam.list;

import java.io.IOException;
import java.util.Scanner;

public class EmpMain {// 실행
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// 1.입력 2.전체리스트 3.수정 4.삭제 5.종료
		EmpService service = new EmpServiceImpl();
//		EmpServiceImpl service = new EmpServiceImpl();
//		EmpseviceImplVer2 service = new EmpServiceImplVer2();
		while (true) {
			System.out.println("===================================");
			System.out.println("1.입력  2.전체리스트  3.수정  4.삭제  5.종료");
			System.out.println("===================================");
			System.out.println("선택> ");

			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.println("입력선택");
				System.out.println("사원번호 입력: ");
				int empId;
				try {
					empId = scn.nextInt();scn.nextLine();
					
				} catch (Exception e) {
					System.out.println("잘못입력했습니다");
					scn.nextLine(); //1. 만약 이거 없다고 생각하면, 위에서 잘못 입력된 값 a를 넣고 엔터를 치면 a가 일단은 들어감
					empId = reCheck("사원번호 입력: ");
				}
				System.out.println("성 입력: ");
				String lastName = scn.nextLine();
				System.out.println("급여 입력: ");
				int salary = scn.nextInt();
				scn.nextLine();// scn.nextInt();다음에는 scn.nextLine();넣어주기 안그러면 오류남
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
		} // end of while loop
	}

	static int reCheck(String m) {
		int empId;
		while (true) {
			try {
				System.out.println(m);//2 . 일단 출력됨 6. while로 돌아와서 다시 일단 출력
				empId = scn.nextInt(); //3. *엔터가 여기서 먹혀버림(엔터도 입력값으로 받음)* 7. 이제 다시 입력을 기다림
				scn.nextLine(); // 에러로 실행 없이 넘어감 
				break;
			} catch (Exception e) {
				System.out.println("잘못입력했습니다"); //5. 일단 출력
				scn.nextLine(); 
			}
		}

		return empId;
	}
}
