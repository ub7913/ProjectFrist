package com.yedam.dev;

public class ArrayEx {
	public static void main(String[] args) {
		int num1 =100;
		String str1 = "Hello";
		
		int[] intAry = new int[5];
		intAry[0]=10;
		intAry[1]=20;
		System.out.println(intAry[0]);
		
		int result = sumAry(intAry);
		System.out.println(result);
		
		double
		double result2
		
		String[] strAry = {"Hello", "World", "Nice","10"}; //배열은 모든 타입을 사용 할수 있지만 동시에 다른 타입을 사용 할수 없다. 그래서 10을 ""에 담아서 표현함.
		for(int i=0; i<strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
		for(String str : strAry) { //배열 strAry의 변수를 str이라는 for의 변수에 담아서 배열의 변수 갯수만큼 반복 해준다.
			System.out.println(str);
		}
	}//end of main()
	public static double avgAry(double[] ary) {
		double sum=0, avg=0;
		for(int i=0;i<ary.length;i++) {
			sum +=ary[i];
		}
		avg=sum/ary.length;
		return avg;
	}
	
	public static int sumAry(int[] ary) {
		int sum=0;
		for (int i=0; i<ary.length;i++) {
			sum+=ary[i];
		}
		return sum;
	}
}//end of class
