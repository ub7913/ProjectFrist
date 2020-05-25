package com.yedam.exercise;

import java.util.List;

public class BoardImpl implements BoardService {

	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}

	@Override
	public void updateBoard(List<Board> list, Board board) {

	}

	@Override
	public void delete(List<Board> list, Board board) {
		list.remove(board);
	}

	@Override
	public void view(List<Board> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}

	}
}
