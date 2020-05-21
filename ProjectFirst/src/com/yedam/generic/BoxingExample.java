package com.yedam.generic;

public class BoxingExample {
	public static void main(String[] args) {
		Box<Integer> box = Utils.boxing(new Integer(10));//Integer(10) 10이라는 기본 데이터 타입을 Integer라는 객체를 통해서 표현 하겠다는 의미
		Integer num = box.get();
		System.out.println(num);
		
		Box<String> strBox = Utils.boxing("Park");
		String result = strBox.get();
	}
}
