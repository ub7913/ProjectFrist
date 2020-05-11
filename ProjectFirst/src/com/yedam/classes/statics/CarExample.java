package com.yedam.classes.statics;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setSpeed(-10); // c1.speed = -10; 같은 말인데 이렇게 안하는 이유가 speed라는 필드에 직접 값을 넣지 않도록 하는 것이다.(Private을 썼기 때문)
		System.out.println("속도: "+c1.getSpeed()); 
		c1.setSpeed(60);
		
		if(!c1.isStop() ) {
			c1.setStop(true); //stop:true, speed:0
		}
		System.out.println("현재속도: "+c1.getSpeed());
	}
}
