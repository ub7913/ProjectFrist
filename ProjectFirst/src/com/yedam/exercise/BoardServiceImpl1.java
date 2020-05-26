package com.yedam.exercise;

import java.util.List;

public class BoardServiceImpl1 implements BoardService1 {

	@Override
	public void insertBoard(List<Board1> list, Board1 board) {
		list.add(board);
	}

	@Override
	public void updateBoard(List<Board1> list, Board1 board) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(board.getTitle())) {
				list.get(i).setContent(board.getContent());
			}
		}
		
	}

	@Override
	public void deleteBoard(List<Board1> list, String title) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void showBoard(List<Board1> list) {
		for (Board1 board : list) {
			System.out.println(board.toString());
		}
	}
	
}
