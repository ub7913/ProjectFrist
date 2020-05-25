package com.yedam.exercise;

public class Board {
	private String title;
	private String content;
	private String name;
	
	public Board (String title) {
		this.title=title;
	}
	
	public Board (String title, String content, String name) {
		this.title=title;
		this.content=content;
		this.name=name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
//		for (int i = 0; i<100; i++) {
		return "게시글목록[제목=" + title + ", 내용=" + content + ", 작성자=" + name + "]";
		//}
	}
}
