package com.yedam.generic;

public class Course<T> {
	private String name;
	private T[] students;
	Course(String name, int capacity) { //capacity는 배열의 크기를 정할 용도로 만듬
		this.name=name;
		this.students= (T[]) new Object[capacity];
	}
	String getName() { //과정명 메소드
		return this.name;
	}
	T[] getStudents() {
		return students;
	}
	void add (T t) { //배열에 학생들을 하나씩 담을 메소드
		for (int i=0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
