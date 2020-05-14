package com.yedam.database;

public class EmpExe1 {
	public static void main(String[] args) {
		EmpDAO1 dao = new EmpDAO1();
		Employee1[] employees = dao.getEmpList();
		for (Employee1 emp : employees) {
			if (emp != null) {
				System.out.println(emp.toString());
			}
		}
		dao.getEmpList();
	}
}
