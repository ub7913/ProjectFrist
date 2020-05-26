package com.yedam.exercise;

import java.util.List;

public interface BoardService1 {
	void insertBoard(List<Board1> list, Board1 board);
	void updateBoard(List<Board1> list, Board1 board);
	void deleteBoard(List<Board1> list, String title);
	void showBoard(List<Board1> list);
}
