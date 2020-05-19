package com.yedam.interfaces;
interface DataAccessObject { //한번에 보기 위해 한 클래스 안에서 인터페이스를 만듬
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject {
	String dbType = "Oracle DB";
	@Override
	public void select() {
		System.out.println(dbType+"에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(dbType+"에 삽입");
	}

	@Override
	public void update() {
		System.out.println(dbType+"를 수정");
	}

	@Override
	public void delete() {
		System.out.println(dbType+"에서 삭제");
	}
	
}

class MySqlDao implements DataAccessObject {
	String dbType = "MySql DB";
	@Override
	public void select() {
		System.out.println(dbType+"에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(dbType+"에 삽입");
	}

	@Override
	public void update() {
		System.out.println(dbType+"를 수정");
	}

	@Override
	public void delete() {
		System.out.println(dbType+"에서 삭제");
	}
	
}
public class DaroExample {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
