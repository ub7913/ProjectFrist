package com.yedam.exceptions;
abstract class Animal {
	abstract void sound();
}
class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("야옹");
	}
}
	

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		try {
		changeDog(dog);
		} catch (ClassCastException e) {
			System.out.println("변환불가");
		}//정상처리
		
		Animal cat = new Cat();
		try {//떠넘겨 받은 예외를 예외처리 해준다
			changeDog(cat);
		} catch (ClassCastException e) {
			System.out.println("변환불가");
		}//예외처리
	}
	public static void changeDog(Animal animal) throws ClassCastException { //예외를 발생하면 예외를 돌려주겠다. 예외를 떠넘긴다
//	try { 1. 예외처리를 해줘도 된다
//		if (animal instanceof Dog) { // 2. instanceof는 animal이 Dog의 인스턴스가 맞는지 확인해서 오류 없이 실행 시키는 방법
		Dog dog = (Dog) animal;
		dog.sound();
//		} else {
//			System.out.println("변경할 수 없는 클래스입니다.");
//		}
//		} catch(ClassCastException e) {
//			System.out.println("cast할수 없습니다");
//		}
	}
}
