package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		int result1 = cal.sum(10, 50);
		double result2 = cal.sum(10.5, 50.3);
		//println 메소드의 매개변수를 다르게 호출 /실행하도록
		//메소드 오버로딩(재정의)
		cal.println("30");
		cal.println(result1);
		cal.println(result2);
		
		double area1 = cal.getAreaRectangle(4.6,5.5); // 굳이 변수 이름을 정해 주지 않아도 되지만, 다른곳에 쓰일 수도 있기때문에 변수 이름을 정해 주는 것이 효율 적이다.
		cal.println("직사각형의 넓이의 " + area1); // 문자열과 숫자열 합쳐져있지만 이것은 문자열로 인식 해버린다.
		
		double area2 = cal.getAreaRectangle(5.5);
		cal.println(area2);
		
		cal.getAreaRectangle(area1, area2);
		cal.println(cal.getAreaRectangle(area1, area2));
	}
}
