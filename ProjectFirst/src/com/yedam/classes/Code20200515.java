package com.yedam.classes;

public class Code20200515 {
	public static void main(String[] args) {
/*		int a = 0;
		int b = 1;
		for (int i=1; i<6; i++) {
			for (int j=1; j<6; j++) {
			a = a+b;
			System.out.print(" "+a);
			}
			System.out.println();
		}
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print((i+1)+(j*5)+" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<6; i++) {
			for (int j=i; j<i+21; j+=5) {
				System.out.print(j+" ");
			}System.out.println();
		}*/
		
		int number[][] = {
				{1,6,11,16,21},
				{2,7,12,17,22},
				{3,8,13,18,23},
				{4,9,14,19,24},
				{5,10,15,20,25}
		};
		for (int i=0; i<number.length; i++) {
			for (int j=0; i<number[i].length; j++) {
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
	}
}

