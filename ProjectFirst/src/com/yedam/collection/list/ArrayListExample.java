package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); //List 인터페이스에 있는 ArrayList메소드
		list.add(new String("Hello"));//배열에 추가하는것
		list.add("World");
		list.add(2, "Hong");//1.2번 인덱스에 추가 4.얘는 밀려서 인덱스 5번째에 들어간다.
		list.add(2,"Hong");//2.얘가 2번 인덱스로 들어 간다
		list.add(2,"Hwang");//3.다시 얘가 2번에 들어간다
		list.set(2, "Park");//5. Hwang이었던 2번 인덱스를 Park로 치환 시킴
		
		for (String str:list) {
			System.out.println(str.toString()); 
		}
		
		System.out.println(list.get(1));
		
		list.remove(4); // 마지막에 밀려있던 Hong이 빠진다.
		System.out.println("after remove(4)");
		for (String str:list) {
			System.out.println(str.toString()); 
		}
		System.out.println("list.size와 list.get 메소드");
		for (int i =0; i < list.size(); i++) { //list.size는 배열의 크기를 알려준다.
			System.out.println(list.get(i).toString());
		}
	}
}
