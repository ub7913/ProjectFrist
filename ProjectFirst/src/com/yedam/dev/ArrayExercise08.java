package com.yedam.dev;

public class ArrayExercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
			};
		int sum=0;//선언을 어디 하냐가 중요하다. 만약 첫번째 for문에 sum을 선언하면 실컷 더해놓고 for문 안에 0이 선언 되어 있어서 array[i].length의 마지막 값들의 합만 결과로 보여 지게 될것이다.
		int sum1=0;
		double avg=0.0;
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum=sum+array[i][j]; // array[]하나만 쓰면 배열 타입이라서 sum과 타입이 안맞아서 계산 안됨, array[][]써야지 포함하는 정수 타입을 찾아내서 sum과 계산 할 수 있음
			}
			sum1+=array[i].length;	
		}
		avg=(double)sum/sum1;// sum과 sum1은 int값이기 때문에 강제적으로 double값으로 바꿔줘야 한다.
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(avg);
	}
}
