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

	public String getSubtitle() {
		return title;
	}

	public void setSubtitle(String subtitle) {
		this.title = title;
	}

	public String getContents() {
		return content;
	}

	public void setContents(String content) {
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
		return "Board [title=" + title + ", content=" + content + ", name=" + name + "]";
	}
	
}
