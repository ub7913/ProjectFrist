package com.yedam.exercise;

public class Board1 {
	private String title;
	private String content;
	private String writer;

	public Board1(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Borar1 [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
