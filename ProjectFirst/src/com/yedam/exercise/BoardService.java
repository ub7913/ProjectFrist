package com.yedam.exercise;

import java.util.List;

public interface BoardService {
	
	public void insertBoard(List<Board> list, Board board);//얘가 db의 역할을 함, 저장할 것을 담음, 그리고 매개변수로써 사용됨
	
	public void updateBoard(List<Board> list, Board board);
	
	public void delete(List<Board> list, Board board);
	
	public void view(List<Board> list);
}
