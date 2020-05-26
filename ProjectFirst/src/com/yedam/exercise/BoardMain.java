package com.yedam.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.list.Employee;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		BoardService service = new BoardServiceImpl();
		while (true) {
			System.out.println("===================================");
			System.out.println("1.입력  2.수정  3.삭제  4.리스트 5.종료");
			System.out.println("===================================");
			System.out.println("선택> ");

			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.println("입력선택");
				System.out.println();
				System.out.println("제목입력");
				String title = scn.nextLine();
				System.out.println("내용입력");
				String content = scn.nextLine();
				System.out.println("작성자입력");
				String name = scn.nextLine();
				Board board = new Board(title, content, name);
				service.insertBoard(list, board);
			}
			
			if (menu == 2) {
				System.out.println("수정선택");
				System.out.println();
				System.out.println("제목선택");
				String title = scn.nextLine();
				Board result = null;
				for (int i=0; i<list.size(); i++) {
					if (list != null&&list.get(i).getName().equals(title)) {
						result=list.get(i);
						System.out.println("수정내용입력");
						String content = scn.nextLine();
						result.setContent(content);
					}
				}
			}
			
			if (menu == 3) {
				System.out.println("삭제선택");
				System.out.println();
				System.out.println("제목입력");
				String title = scn.nextLine();
				Board result = null;
//				for (Board b : list) {
//					if (list != null&&b.getName().equals(title)) {
//						result=b;
//						service.delete(list, result);
//					}
//				} 이거 왜 안되지?
				for (int i=0; i<list.size(); i++) {
					if (list != null&&list.get(i).getName().equals(title)) {
						result=list.get(i);
						service.delete(list, result);
					}
				}
			}
			
			if (menu == 4) {
				service.view(list);
			}
			
			if (menu == 5) {
				break;
			}
		}//end of while
		System.out.println("프로그램 종료");
	}
}
