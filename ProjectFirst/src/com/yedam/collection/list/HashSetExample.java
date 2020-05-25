package com.yedam.collection.list;

import java.util.HashSet;
import java.util.Set;
class Member {
	String name;
	int age;
	Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}
	@Override
	public int hashCode() { //객체가 가지고 있는 값       3. 해쉬코드와 이퀄즈를 재정의 해줌
		//return this.age; 
		return this.name.hashCode(); // 5. 인스턴스(객체)가 가지고 있는 값을 비교 했을때 같으면 중복에서 제거함
	}
	@Override
	public boolean equals(Object obj) {//기준은 객체기준 
		Member mem = (Member) obj; //강제 형변환 해줌
		return this.name.equals(mem.name); //4. 이름이 같은 인스턴스(객체)는 인스턴스가 다르지만 같다고 판단하여 중복에서 제거함
	}
	
	
	
}
public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> members = new HashSet<>();
		members.add(new Member("Hong", 10));
		members.add(new Member("Hong", 20));
		members.add(new Member("Hong", 10));
		
		for (Member member:members) {
			System.out.println(member.toString());//2.하지만 여기서는 중복이 사라지지 않고 나옴
		}
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		
		for (String str : set) {
			System.out.println(str.toString()); //1.중복된 값을 받아 들이지 않음
		} // 
	}
}

//hashCode와 equals 는  인스턴스가 달라도 이름과 나이가 같다면 중복저장 하지 않게 한다
