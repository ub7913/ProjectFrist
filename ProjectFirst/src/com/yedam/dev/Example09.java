package com.yedam.dev;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);// Scanner에 빨간줄 뜨면 마우스 올려서 import 누르면 위에 자동으로 import가 입력됨

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.최고점수 | 5.분석 | 6.종료 ");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			scn.nextLine();// 몇번을 선택했는지 구분 할 수 있게 해주는 것. scn.nextInt()는 숫자를 받고 엔터 치면 밑으로 내려간다. 그래서 커서가 가만히
							// 있게 하기위해서 scn.nextline이 필요하다
			if (selectNo == 1) {
				System.out.println("학생수를 입력하세요.");
				studentNum = scn.nextInt();
				scores = new int[studentNum];// new int[5] 이런 식으로 썻었는데, scn.nextInt()를 통해서 임의로 입력되는 숫자를 받아서 int[]안에 숫자가
												// 들어간다.
				System.out.println("배열생성 되었습니다.");
			} else if (selectNo == 2) { // 2번을 선택했다
				int i = 0;// 밑의 scores[i++]를 쓰게 하기 위해서 i를 선언해준다.
				for (int score : scores) {// 한번만 해서 안되서 반복 할수 있도록 for문 쓰기
					System.out.println("점수를 입력하세요.");
					scores[i++] = scn.nextInt();// 위의 학생수 입력 된 만큼 scores[]의 크기가 된다.
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				int maxValue = Integer.MIN_VALUE;
				for (int score : scores) {
					if (score >= maxValue) {
						maxValue = score;
					}
				}
				System.out.println("최고점수 : " + maxValue);
			} else if (selectNo == 5) {
				// 합계, 평균 둘다 보여줘야함.
				int sum = 0;
				// int cnt=0;
				for (int score : scores) {
					sum += score;
					// cnt++;
				}
				double avg = (double) sum / scores.length;// scores.length 대신에 cnt변수를 선언해서 cnt로 나눠도 된다. avg는 double타입이기
															// 때문에 정수 타입인 sum또는 scores.length 둘중 하나를 double타입으로 강제 변환
															// 해줘야 한다.
				System.out.println("합계는 : " + sum);
				System.out.println("평균은 : " + avg);
			} else if (selectNo == 5) {
				run = false;
			} // end of if
		} // end of while
		System.out.println("프로그램 종료");
	}// end of main()
}// end of class
