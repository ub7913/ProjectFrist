package com.yedam.api;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("Hong");
		Member m2 = new Member("Hong");
		Member m3 = new Member("Park");
		
		if(m1.equals(m2)) {
			System.out.println("동등합니다");
		} else {
			System.out.println("다릅니다");
		}
		
		System.out.println(m1.toString()); // 이대로만 하면 주소값만 나오는데 Member클래스에서 toString 재정의를 해주면 원하는 출력을 얻을 수 있다.
		
		System.out.println(m1.hashCode() + ", " + m2.hashCode());
		if (m1 == m2) { // 실제는 같은 객체이지만 객체의 주소값을 가져 와서 비교했기 때문에 주소값은 당연히 다르기에 다른 객체라고 나온다.
			System.out.println("동일한 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
		}
	}
}
