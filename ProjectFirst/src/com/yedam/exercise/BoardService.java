package com.yedam.exercise;

import java.util.List;

public interface BoardService {
	
	public void insertBoard(List<Board> list, Board board);//인터페이스 안에서 List 컬랙션이 선언 될 수 없음. List컬랙션이 접근할 방법이 없음. list 얘가 db의 역할을 함, 저장할 것을 담음, 그리고 매개변수로써 사용됨
	
	public void updateBoard(List<Board> list, Board board);
	
	public void delete(List<Board> list, Board board);
	
	public void view(List<Board> list);
}
