package com.yedam.list;

public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();
	

	@Override
	public void createEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void getEmpList() {
		for(Employee emp : dao.getEmpList()) {
			if(emp != null) { // 2번까지 작성하고 실행 해봤는데 에러가 났음, 그 에러를 찾아 와서 수정한것
				System.out.println(emp.toString());
			}
		}
	}

	@Override
	public void changeEmp(Employee emp) {
		dao.updateEmp(emp);
	}

	@Override
	public void removeEmp(int empId) {
		dao.deleteEmp(empId);
	}

}
