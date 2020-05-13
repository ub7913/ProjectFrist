package com.yedam.classes.inherit;

public class guguDan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
			
			for(int j = 2; j<10;j++) {
				int result = i*j;
				if(i==0) {
					//System.out.print(j+"d     ");
					System.out.print(j+"단        ");
				}else {
					System.out.print(j+"x"+i+"="+result+" ");
					if(result<10) {
						System.out.print(" ");
					}
				}
				if (j==9&&i<9) {
					i++;
					j=1;
					System.out.println();
				}
			}
			
		}
}
//	public static void main(String[] args) {
//		int a = 0;
//		for (int v=2; v<10; v++) {
//			//System.out.print(v+"d     ");
//			System.out.print(v+"단                   ");
//		} System.out.println();
//		for (int i=2; i<10; i++) {
//			
//			for(int j=2; j<10; j++) {
//				a = j*i;
//				if (a<=9) {
//					System.out.print(j+" * "+i+" = "+a+"  ");
//				} else {
//				System.out.print(j+" * "+i+" = "+a+" ");
//				}
//			}System.out.println();
//		}
//	}
//}// 간격 맞추기