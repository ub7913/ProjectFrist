package com.yedam.lambda;
//함수적인 인터페이스 : 인터페이스에 추상 메소드가 하나만 있어야 된다(기준). 만약 ,추상메소드가 두개 있으면 익명객체가 메소드를 어느것을 구현해야 하는지 알 수가 없다.
public interface MyMultiInterface {
	public int multi(int num1, int num2);
}
