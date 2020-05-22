package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	static class Member {
		String name;
		int age;
		Member(String name, int age) {
			this.name=name;
			this.age=age;
		}
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
		
	}
	
	public static void main(String[] args) {
		List<Member> members = new ArrayList<>();
		members.add(new Member("Hong", 28));
		members.add(new Member("Kim", 19));
		members.add(new Member("Park", 18));
		for (Member mem : members) {
			System.out.println(mem.getName() + ", " + mem.getAge());
		}
		
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Hong");
		list.add(3, "Hwang");
		
		String str1 = list.get(0); //배열의 첫번째의 Hello가 나올것임
		
		list.remove(3);
		
//		for (int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		} 
		for (String str : list) {
			System.out.println(str);
		}
	}
}
