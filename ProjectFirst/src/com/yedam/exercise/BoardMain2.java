package com.yedam.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService2 service = new BoardServiceImpl2();
		
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.추가 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("-------------------------------");
			System.out.println("선택> ");
			
			int menu = scn.nextInt();scn.nextLine();
			
			if(menu == 1) {
				System.out.println("제목입력:");
				String title = scn.nextLine();
				System.out.println("내용입력:");
				String content = scn.nextLine();
				System.out.println("작성자입력");
				String writer = scn.nextLine();
				Board1 board = new Board1(title, content, writer);
				service.insertBoard(board);
				
			} else if (menu == 2) {
				System.out.println("제목입력:");
				String title = scn.nextLine();
				System.out.println("변경내용입력:");
				String content = scn.nextLine();
				Board1 board = new Board1(title, content, null); //매개값 세개받는 생성자만 선언했기 때문에 없는 부분은 null값으로 처리 한다.
				service.updateBoard(board);
				
			} else if (menu == 3) {
				System.out.println("제목입력");
				String title = scn.nextLine();
				service.deleteBoard(title);
			} else if (menu == 4) {
				service.showBoard();
			} else if (menu == 5) {
				break;
			}
		}
	}
}
