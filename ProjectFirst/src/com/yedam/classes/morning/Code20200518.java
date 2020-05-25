package com.yedam.classes.morning;

public class Code20200518 {
	public static void main(String[] args) {
		int[] intAry = {10,8,5,3,7,1};
		
////		for (int i:intAry) {
////			int temp=0;
////			if (i>i+1) {
////				temp=i;
////				i=i+1;
////				i+1=temp;
////			}
//				
//				
//			System.out.print(i+" ");
//		}
		for (int j=0; j<intAry.length; j++) {
			for (int i=0; i<intAry.length-1; i++) {
				int temp =0;
				if (intAry[i]>intAry[i+1]) {
					temp = intAry[i];
					intAry[i]=intAry[i+1];
					intAry[i+1]=temp;
				}
			}
		}
		for (int i=0; i<intAry.length; i++ ) {
			System.out.println(intAry[i]);
		}
	}
}
