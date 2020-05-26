package com.yedam.exercise;

import java.util.List;

public interface BoardService2 {
	abstract void insertBoard(Board1 board);
	void updateBoard(Board1 board);
	void deleteBoard(String title);
	void showBoard();
}
