package com.yedam.dev;

class Student {
	String name; // 주소값을 알아보기 위해서 따로 해봄
}

public class StringEqualExample {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		st1.name = "Hong";
		st2.name = "Park";

		System.out.println(st1); // 79698539 주소값 저장
		System.out.println(st2); // 73f792cf 주소값 저장

		String str1 = new String("Hello"); 
		String str2 = "Hello";
		String str3 = "Hello";
		System.out.println(str1); // 같은 "Hello"가 나오지만 주소값이 다름 heap영역에 str2와 str3와 다르게 다른 객체가 만들어 짐
		System.out.println(str2);
		System.out.println(str3);

		if (str3 == str2) {
			System.out.println("참조가 같다.");
		} else {
			System.out.println("참조가 다르다.");
		}
	}

}
