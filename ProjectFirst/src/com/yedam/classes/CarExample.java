package com.yedam.classes;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "Sonata";
		System.out.println(c1.maxSpeed);
		
		Car c2 = new Car(200);
		c2.model = "BMW";
//		System.out.println(c2.maxSpeed);
		
		Car c3 = new Car("Benz");
		c3.maxSpeed = 300;
		
		Car c4 = new Car("Accent", 200); // 생성자 선언은 필드값을 초기화 할 이유로 사용한다.
	}
}
