package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); //0번째 자리에 계속해서 값이 들어가고 원래 있던 값들은 뒤로 밀림
		long startTime, endTime;
		startTime = System.nanoTime();//nanoTime()세밀한 실제 시간을 표시해줌
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList: 걸린시간 " + (endTime - startTime));
		
		List<String> list2 = new LinkedList<>(); //
		startTime = System.nanoTime();//nanoTime()세밀한 실제 시간을 표시해줌
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList: 걸린시간 " + (endTime - startTime));
		
	}
}
