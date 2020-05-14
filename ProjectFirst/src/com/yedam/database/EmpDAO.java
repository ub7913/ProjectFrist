package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	//사원등록 Emp 테이블
	public void insertEmp(Emp emp) {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try { // 데이터베이스 불러오는것
			Class.forName("oracle.jdbc.driver.OracleDriver"); //예외처리 클릭 하기, oracl.jdbc.driver.OrcleDriver 드라이버 위치
			conn = DriverManager.getConnection(url,"hr","hr"); //"hr"은 사용자 계정과 암호 , 1.입력하고 import만들기 2.오류 위에 세번째 3.멀티로 설정됨 , Exception누르고  4. ClassNotFoundException 지우기
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sql = "insert into emp values(" +emp.getEmployeeId()
				+ ",'" + emp.getLastName() + "'"
				+ "," + emp.getSalary()
				+ ",'" + emp.getHireDate() + "'"
				+ ")";
		try {
			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);//위의 sql을 담는다
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// employees 테이블데이터 조회 결과
	public Employee[] /*void*/ getEmpList() {//void는 리턴 타입이 없어서 바로 출력하고 끝.
		Employee[] emps = new Employee[100];//배열 추가
		Connection conn = null; // import 해주기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";//jdbc:oracle:thin:고정 주소임, 이 컴퓨터에서 사용 하니까 @localhost, 1521은 포트번호, xe는 계정
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //예외처리 클릭 하기, oracl.jdbc.driver.OrcleDriver 드라이버 위치
			conn = DriverManager.getConnection(url,"hr","hr"); //"hr"은 사용자 계정과 암호 , 1.입력하고 import만들기 2.오류 위에 세번째 3.멀티로 설정됨 , Exception누르고  4. ClassNotFoundException 지우기
		} catch (Exception e) {
			e.printStackTrace();
		}
		String sql="select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);//예외처리 해주고 PreparedStatement import해주기
			ResultSet rs = pstmt.executeQuery();//ResultSet import 해주기
			int i = 0;
			while(rs.next()) {//가져올 데이터가 있으면 while구문을 실행 시키라는 의미
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); //숫자를 담기위해서 getInt가 필요
				emp.setFirstName(rs.getString("first_name")); //문자를 담기위해서 getString이 필요
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("Phone_number"));
				emps[i++] = emp; //Employee 인스턴스 저장
				
//				System.out.println(rs.getInt("employee_id") + 
//						     " " + rs.getString("first_name") + 
//						     " " + rs.getString("last_name") + 
//						     " " + rs.getString("email") + 
//						     " " + rs.getString("phone_number"));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("조회 완료");
		return emps;
	}//end of getEmpList()
}

//sql구문을 실행 하겠다는 의미의 메소드임
