package com.yedam.classes;

public class StringExample {
	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		
		if(str1.equals(str2)) {//.equals는 str1의 값과 str2의 값을 비교하겠다는 의미, 문자열을 비교할때 쓰임.
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}
			
	}
}
