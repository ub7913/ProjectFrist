package com.yedam.generic;

public class Box<T> {//<T>아직은 타입을 안정 했지만 box라는 클래스를 실행하는 시점에 타입을 정해주겠다라는의미,ex)박스 클래스를 오랜지로 선언하려고 하면 T를 Orange로 바꿔줘야 한다.<T>를 타입파라미터라고 한다.
	T object;//아무 데이터나 다 받고 싶어서 object타입 줌
	void set(T object) {
		this.object = object;
	}
	
	T get() {
		return object;
	}
}
