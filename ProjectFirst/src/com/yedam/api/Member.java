package com.yedam.api;

public class Member {
	public String id;
	public Member()  {
		//기본 생성자
	}
	
	public Member(String id) {
		this.id=id;
	}

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj; //Object타입 obj를 Member타입으로 형변환
		return this.id.equals(m.id);//super.는 member를 오버라이딩 한것이 아니라 Object를 오버라이딩 한 것이기 때문에 출력했을때 원하는 값을 받지 못한다.(계속 member의 id가 아닌 super와 비교만 하기때문에)
		//return super.equals(obj); 
	}

	@Override
	public String toString() {
		return "id값은 " + this.id;
		//return super.toString();
	}

	@Override
	public int hashCode() {
		return id.hashCode();
		//		return super.hashCode();
	}
	
	
}
