package com.yedam.database;

public class EmpExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Emp emp = new Emp("Hong", "2020/05/15");
		emp.setEmployeeId(300);
		emp.setSalary(3000);
		
		dao.insertEmp(emp);
//		Employee[] employees = dao.getEmpList();
//		for (Employee emp : employees) {
//			if (emp != null) {
//				System.out.println(emp.toString());
//			}
//		}
//			dao.getEmpList();
	}
}
//에러뜸 , 실행된 창에서 마지막과 마지막 위 오류 찾아봄
//보니까 int r = pstmt.executeUpdate();에서 잘못됨
//그래서 그 위에서 sysout(sql)출력해봄
//문자인 hong과 날짜는 작은 따옴표 필요
//메소드에서 따옴표 추가