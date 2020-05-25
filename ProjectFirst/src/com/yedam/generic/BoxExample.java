package com.yedam.generic;

class Apple {
	
}

class Orange {
	
}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String str = box.get();//set에 String 타입을 넣어서  str에 String 타입을 줬는데 오류 나서 (String)으로 강제 형변환 함
		
//		box.set(new Apple());//object 타입으로 선언되어 있어서 파라미터는 아무 타입이나 모두 다 받을 수 있다
//		Apple apple = (Apple) box.get();
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		
//		box.set(new Orange());
//		Orange.orange = (Orange) box.get(); //전부 형변환 하니 너무 잦아서 성능이 떨어짐. 형변환 없이 할수 있는 방법은?
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.set(new Orange());
		Orange orange = orangeBox.get();
	}
}
