package com.yedam.classes.inherit;

public class guguDan {
	public static void main(String[] args) {
		int a = 0;
		for (int v=2; v<10; v++) {
			System.out.print(v+"단"+"   ");
		} System.out.println();
		for (int i=2; i<10; i++) {
			
			for(int j=2; j<10; j++) {
				a = j*i;
				if (a<=9) {
					System.out.print(j+"*"+i+"="+a+"  ");
				} else {
				System.out.print(j+"*"+i+"="+a+" ");
				}
			}System.out.println();
		}
	}
}// 간격 맞추기