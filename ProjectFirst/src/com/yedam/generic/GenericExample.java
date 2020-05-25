package com.yedam.generic;

import java.util.ArrayList;//클래스
import java.util.List;//인터페이스

public class GenericExample {
	public static void main(String[] args) {
//		Object[] strAry = new Object[5];
//		strAry[0] = "Hello";
//		strAry[1] = new Integer(0);
//		
//		String str = (String) strAry[0];
//		Integer num = (Integer) strAry[1];
//		Integer num1 = (Integer) strAry[0]; //Object는 모든 타입을 담을 수 있다. 그래서 타입 형 변환 하면서 담았는데 막상 실행 해보니 오류가 남
		
		
		
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		list.add(new Double(2.4));
		
		String s1 = (String) list.get(0);
		String s2 = (String) list.get(1);
		Double d1 = (Double) list.get(0);//문제 없어 보이지만 실행시 오류가 남
		
		//제네릭.
		List<String> strList = new ArrayList<String>();//<String>는 String 타입만 넣을 수 있게 한다
		//strList.add(new Interger(0)); 다른 타입이 들어 오니 오류가 남
		strList.add(new String("Hello"));//new String("Hello")값은 파라미터라고 한다
		//strList.add(new Integer(10)); List가 Object타입이라서 모든 타입을 다 받을 수 있지만 제네릭으로 String을 지정 해줬기 때문에 Integer는 올 수없어서 add아래에 빨간줄이 끄인다.
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(new Integer(0));
	}
}
