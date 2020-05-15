package com.yedam.classes;

public class Code20200515 {
	public static void main(String[] args) {
		int a = 0;
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
		}
	}
}

