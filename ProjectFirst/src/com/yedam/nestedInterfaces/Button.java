package com.yedam.nestedInterfaces;

public class Button {
	OnClickListener listener; //밑에서 선언한 인터페이스를 타입으로 listener선언
	
	void setOnClickListener(OnClickListener listener) { //위에 선언된 필드를 담을 수 있는 메소드 생성
		this.listener = listener;
	}
	
	void touch() { // listener를 어떻게 구현하냐에 따라 달라진다
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
