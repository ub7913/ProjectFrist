package com.yedam.dev;

public class ArrayExample {
	public static void main(String[] args) {
		
		int[] intAry = new int[5]; // [5]는 크기를 지정 , 크기만 선언
		
		intAry[0] = 10;
		intAry[1] = 15;
		intAry[2] = 20;
		intAry[3] = 25;
		intAry[4] = 30;
//		intAry[5] = 30; 오류, 배열 범위 초과
		
		int[] intAry2 = {1,2,3,4,5}; // 바로 값을 설정
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		int sum = intAry [0] + intAry [1] + intAry [2] + intAry [3] + intAry [4]; // 인덱스 값이 매우 커지면 이렇게 쓰기 힘들다. 그래서 for문으로 하는 것이 편함 
		
		sum =0;
		for (int i=0; i<5; i++) {//배열은 for반복문으로 쓰면 편하다
			System.out.println(intAry[i]);
			sum += intAry[i];
		}
		
		// 5,10,15,.....50
		
		int[] intAry3 = new int[10];
		
		for(int i=0; i<10; i++) {
			intAry3[i]=5*(i+1);	//(i+1)을 하는 이유는 i가 0부터 시작 했기 때문
		}
		for (int i=0; i<intAry3.length; i++) { //.length는 앞에 변수 이름의 길이를 알아서 계산 해준다.
			System.out.println(intAry3[i]);
		}
	}
}
