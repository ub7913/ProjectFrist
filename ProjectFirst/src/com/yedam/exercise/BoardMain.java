package com.yedam.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.list.Employee;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();

		BoardService service = new BoardImpl();
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
				
				
			}
			
			if (menu == 3) {
				System.out.println("삭제선택");
				System.out.println();
				System.out.println("제목입력");
				String title = scn.nextLine();
				Board board = new Board(title);
				for (int i = 0; i < list.size(); i++) {
					if (list != null&&list.get(i).equals(title));
				}
				service.delete(list, board);
			}
			
			if (menu == 4) {
				service.view(list);
			}
		}
	}
}
