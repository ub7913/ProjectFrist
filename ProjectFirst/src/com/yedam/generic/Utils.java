package com.yedam.generic;

public class Utils {
	public static <T> Box<T> boxing(T t) { //<T>제네릭 타입임을 알려줌 Box<T>는 다른 클래스에서 쓰일때 어떤 타입이든 올 수 있게 한다
		Box<T> box = new Box<T>();
		box.set(t);
		return null;
	}
	
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) { //메소드에서 바로 쓸때
		boolean keyComp = p1.getKey().equals(p2.getKey());
		boolean valComp = p1.getValue().equals(p2.getValue());
		return keyComp && valComp;
		
	}
	
	public static <T extends Number> int compare(T t1, T t2) { //T에 아무거나 받지 않고 Number클래스에 상속받는 타입들만 받겠다는 의미, 제네릭 타입에 제한두기 ex)T는 제네릭 타입이지만 extneds Number에 의해 String타입은 올 수 없다.
		int d1 = t1.intValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);//앞이 크면 '+1', 같으면 '0', 뒤가크면 '-1'
	}
}
