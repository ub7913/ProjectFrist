package com.yedam.dev;

public class ArrayMethodExample {
	public static void main(String[] args) {
		int result = sum(10,11);
		int[] intAry = {1,2,3,4,5};
		result = sumAry(intAry);
		System.out.println("배열 intAry 의 합: " + result);
		double[] dobAry= {1.1,2.2,3.3,4.4};
		double result2 = avgAry(dobAry); // 변수이름은 타입이 변경 되어도 같은 이름을 쓸수 없다
		System.out.println("배열 dobAry 의 합: " + result2); 
		int[] minAry = {5,2};
		int result3 = minusAry(minAry);
		System.out.println("배열 minAry 의 차: "+ (10+result3));
		
	}
	
	public static int sumAry(int[] ary) { // 정수가 담겨질 배열 변수가 들어옴
		int sum=0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	
	public static double avgAry(double[] ary) {
		//매개값으로 받은 배열의 요소들의 평균을 계산하는 메소드.
		//1. 배열의 각 요소의 합
		//2. 평균: 합/배열의크기
		double sum=0;
		//double avg=0.0;  avg라는 변수이름에 double타입을 넣어 준다.
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		} 
		return sum/ary.length;
		//avg = sum/ary.length;
		//return avg;
	}
	
	public static int minusAry(int[] ary) {
		int minus=0;
		for (int i=0; i<ary.length; i++) {
			minus -= ary[i];
		}
		return minus;
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
}
