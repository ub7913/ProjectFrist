package com.yedam.generic;

public class PairExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair</*Integer, String*/>(1,"사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(2,"사과");
		if (Utils.compare(p1, p2))
			System.out.println("논리적으로 동등학 객체");
		else
			System.out.println("논리적으로 다른 객체");
		
		int result = Utils.compare(2,2.2);
		System.out.println(result);
	}
}
