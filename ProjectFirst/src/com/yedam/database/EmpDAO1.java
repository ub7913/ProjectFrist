package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO1 {

	public Employee1[] getEmpList() {
		Employee1[] emps = new Employee1[100];
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"hr","hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		String sql="select  * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int i = 0;
			while(rs.next()) {
				Employee1 emp = new Employee1();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emps[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("조회 완료");
		return emps;
	}
}
