package com.yedam.classes.abstract_class;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal animal =new Animal(); // 추상 클래스이기 때문에 인스턴스 생성 불가
		Animal animal = new Bird("조류");//Animal의 자식 클래스이기 때문에 형변환 됨 , Animal 타입
		animal.breathe();
		animal.sound();
		
		Cat cat = new Cat("포유류"); //상속 관계에 있기 때문에 자식 클래스인 Cat으로 타입 만들 수 있다
		cat.breathe();
		cat.sound();
		
		animal = cat; //상속 관계에 있기 때문에 자동 형변환 일어 남
	}
}
