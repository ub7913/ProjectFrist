package com.yedam.classes.morning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("야구게임을 시작합니다");
		//int[] selectNum = new int[3];
		List<Integer> selectNum = new ArrayList<>();
		Random random = new Random();

		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if(selectNum.get(i) != selectNum.get(j))
			}
			if(
				selectNum.add(random.nextInt(9)+1);
		}
		
		
//		while (true) {
//			Integer a = random.nextInt(9)+1;
//			selectNum.add(a);
//			if (selectNum.get(1)==null&&selectNum.get(0)!=a) {
//				selectNum.add(random.nextInt(9)+1);
//				if (selectNum.get(2)==null&&selectNum.get(1)!=selectNum.get(0)&&selectNum.get(0)!=a) {
//					selectNum.add(random.nextInt(9)+1);
//					break;
//				}
//			
				
				
			//}
//		for (int i = 0; i < 3; i++) {
//			Integer a = random.nextInt(9)+1;
//			for(int j=0; j<3; j++) {
//				if (selectNum.get(i) != selectNum.get(j)) {
//					selectNum.add(a);
//				}
//				System.out.println(selectNum);
//			}
			
			
//			selectNum[i] = random.nextInt(9) + 1;
	//	}
		//System.out.print(selectNum + " ");
//		System.out.println();
//		System.out.println("번호를 선택하시오");
//		while (true) {
//			System.out.println();
//			int num = scn.nextInt();
//			int num1 = scn.nextInt();
//			int num2 = scn.nextInt();
//			List<Integer> list = new ArrayList<>();
//			list.add(num);
//			list.add(num1);
//			list.add(num2);
//			
//			System.out.println(Arrays.deepEquals((int)selectNum, list));
//			if(selectNum[0] == num && selectNum[1] == num1 && selectNum[2] != num2) {
//				System.out.println("2 Strike 1 Ball");
//				
//			} else if(selectNum[0] == num && selectNum[1] != num1 && selectNum[2] != num2) {
//				System.out.println("1 Strike 2 Ball");
//			
//			} else if(selectNum[0] == num && selectNum[1] != num1 && selectNum[2] == num2) {
//				System.out.println("2 Strike 1 Ball");
//				
//			} else if(selectNum[0] != num && selectNum[1] == num1 && selectNum[2] == num2) {
//				System.out.println("2 Strike 1 Ball");
//				
//			} else if(selectNum[0] != num && selectNum[1] != num1 && selectNum[2] != num2) {
//				System.out.println("3 Ball");
//				
//			} else if(selectNum[0] == num && selectNum[1] == num1 && selectNum[2] == num2) {
//				System.out.println("삼진아웃!! 게임을 종료합니다");
//				break;
//			}
			//break;
	//	} 
	}
}
