package com.yedam.nestedInterfaces;

class CallListener implements Button.OnClickListener {//중첩된 인터페이스이기 때문에 Button. 필요

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	} 
}

class MessageListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다");
	}
}

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		CallListener cListener = new CallListener();
		btn.setOnClickListener(cListener);// 두줄과같은 의미 btn.setOnClickListener(new CallListener());
		btn.touch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnClickListener(mListener);
		btn.touch();
	}
}
