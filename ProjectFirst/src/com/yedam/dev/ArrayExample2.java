package com.yedam.dev;

public class ArrayExample2 {

	public static void main(String[] args) {
		//System.out.println(getLargeValue(10,20));
		
		System.out.println(getLargeValue(new int[] {3,6,100,2,9,10}));
		String result=getString("Hello","World");
		System.out.println(result);
		String[] ary = {"Lee", "Kim", "Park", "Choi", "Han"};
		System.out.println(getString(ary));
//		int[] intAry = {1,2,3,4};// 가장 편한 배열 선언 방법
//		int[] intAry2 = new int[5];//사용자가 어떤 숫자를 넣을지 모를때는 크기만 지정해주고 숫자를 넣을 수 있게끔 만들어 줄수 있다.
//		intAry2[0]=10;
//		intAry2[0]=20; //.....
//		intAry2 = new int[] {1,2,3,4};//배열 타입(enw int[])을  지정해주고 값을 넣어 준다. 
		
		int[][] intAry3 =  new int[3][3]; //인덱스 값이 2차원으로 변함 (2차원 배열),첫번째[]는 행, 두번째[]는 열
		intAry3[0]=new int[] {1,2,3};//intAry3[0]은 첫번째 열에 해당되는 것을 이야기함
		intAry3[1]=new int[] {4,5,6};
		intAry3[2]=new int[] {7,8,9};
		
		intAry3[0][0] =1; //각각 하나씩 값을 주고 싶을때는 이렇게 쓰면됨
		intAry3[0][1] =2;
		intAry3[0][2] =3;
		
		intAry3[1][0] =4; //각각 하나씩 값을 주고 싶을때는 이렇게 쓰면됨
		intAry3[1][1] =5;
		intAry3[1][2] =6;
		
		intAry3[2][0] =7; //각각 하나씩 값을 주고 싶을때는 이렇게 쓰면됨
		intAry3[2][1] =8;
		intAry3[2][2] =9;
		
		int[][] intAry4 = new int[3][];
		intAry4[0] = new int[] {1,2,3,4};
		intAry4[1] = new int[] {1,2,3,4,5};
		intAry4[2] = new int[] {1,2,3,4,5,6};
		System.out.println("intAry4의 크기: "+ intAry4.length);
		System.out.println("intAry4[0]의 크기: "+ intAry4[0].length);
		System.out.println("intAry4[1]의 크기: "+ intAry4[1].length);
		System.out.println("intAry4[2]의 크기: "+ intAry4[2].length);
		
		
		for(int i=0; i<intAry3.length;i++) { //행에 해당하는 배열
			for (int j=0; j<intAry3[i].length;j++){ //열에 해당하는 배열
				System.out.println(intAry3[i][j]);//아래로 쭉 쓰여짐. print로 바꾸면 가로로 죽 쓰임. 한행이 끝나면 다른 행에 쓰게 하려면 print쓰고 두번째 for문 밖에서 println()을 쓴다.
			}
		}
		
	}
	
	public static String getString(String[] strAry) {
		String aa = strAry[0];
		for (int i=1; i<strAry.length; i++) {
			aa=aa+" - "+strAry[i];
		} return aa; // 교수님이 내준 문제에서 가장 완벽한 결과를 제시함
	}
//	public static String getString(String[] strAry) {
//		String result = "";
//	for (int i=0; i<strAry.length;i++) {
//		result += strAry[i]+"-";
//		if (i=int strAry.length-1){
//			result = result+" - ";
//	    }return result;
//	} //교수님 방법인데, 끝에 ' - '하나가 남는데, 이걸 업애려면 if를 써서 없애야 함(어떻게 해야 할지 모르겠음)
//	
	public static String getString(String str1, String str2) {
		return str1 + " - " + str2;
	}
	
	public static int getLargeValue(int[] ary) {
		int maxValue=Integer.MIN_VALUE; // int타입(정수)의 최소값, 만약 배열에서 최소값을 구하고 싶으면 max_value를 쓰면 된다.
		for (int i=0; i<ary.length;i++) {
			if(ary[i]>=maxValue)
				maxValue=ary[i];
		}
		return maxValue;
	}

	public static int getLargeValue(int a, int b, int c) {
		int maxValue = Integer.MIN_VALUE;
		if(a>=maxValue) 
			maxValue=a; 
		if(b>=maxValue) // 현재 b>=a를 비교중인거임
			maxValue=b;
		if(c>=maxValue) // 만약 위의 b가 a보다 컸으면 지금은 c>=b를 비교하는 것임
			maxValue=c;
		return maxValue;
	}
}
