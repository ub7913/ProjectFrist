package com.yedam.classes.inherit;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		
		vehicle=new Bus(); //부모클래스 변수 = 자식클래스 인스턴스 할당 가능(자동형변환이 일어나기 때문)
		vehicle.run();//버스 인스턴스가 담겨져서 버스의 메소드를 호출
		
		vehicle=new Taxi();
		vehicle.run();//버스와 같은 메소드지만 마지막에 택시 인스턴스로 담겨져 있기 때문에 버스와 다르게 각각 메소드가 호출 된다. 현재 vehicle.run()에는 택시 인스턴스 담겨져 있음
		
		Taxi taxi=(Taxi)vehicle;//Taxi taxi= vehicle; 에러남, 자식클래스 변수 = 부모클래스 할당 하려면 강제형변환 필요
		taxi.run();
	}
}
