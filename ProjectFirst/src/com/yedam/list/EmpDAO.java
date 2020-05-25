package com.yedam.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO { // db처리
	Connection conn = null; //자바의 sql클래스라서 import필요
	PreparedStatement pstmt = null; //반복되는것 하나로 선언

	public Connection getConnect() {//대표로 db연결하는 것 하나만 만듬
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try { // 데이터베이스 불러오는것
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection(url,"hr","hr");   
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
		
	public void insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp values(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate()); //위의 sql을 정상적으로 만들어 주는 작업
			int r = pstmt.executeUpdate();
			System.out.println(r+"건 입력됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of insertEmp
	
	public Employee[] getEmpList() {
		conn = getConnect();
		String sql = "select * from emp";
		Employee[] employees = new Employee[100]; //Employee 타입
		int i = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {//들어있는 건수 만큼 배열에 담는다.
				Employee emp = new Employee(rs.getInt("employee_id")//
						,rs.getString("last_name")//
						,rs.getInt("salary")//
						,rs.getString("hire_date")//
				);
				employees[i++] = emp;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}// end of empList
	
	public void updateEmp(Employee emp) {
		//전제:급여만 변경. 다른것까지 하기에는 복잡하니 일단 급여만
		conn = getConnect();
		String sql = "update emp set salary = ? where employee_id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r+"건 변경됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of ubdateEmp
	
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r+"건 삭제됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// end of deleteEmp
}
