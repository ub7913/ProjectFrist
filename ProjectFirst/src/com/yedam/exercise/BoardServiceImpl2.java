package com.yedam.exercise;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl2 implements BoardService2 {
	List<Board1> list = new ArrayList<>(); // 1과 다른 점은 매개값이였던 list가 빠진것이다.

	@Override
	public void insertBoard(Board1 board) {
		list.add(board);
	}

	@Override
	public void updateBoard(Board1 board) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
			}
		}
	}

	@Override
	public void deleteBoard(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void showBoard() {
		for (Board1 board : list) {
			System.out.println(board.toString());
		}
	}
}
