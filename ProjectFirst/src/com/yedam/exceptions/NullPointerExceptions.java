package com.yedam.exceptions;

public class NullPointerExceptions {
	public static void main(String[] args) {
		String str = "Hello";
		try {//예외처리 해준다. 오류가 있으면 메시지를 출력해주고 정상적으로 끝까지 실행된다
			System.out.println(str.toString());//컴파일 상에는 에러가 없다. 하지만 실행시 생각지 못한 예외가 발생함 -> str 에 필드값을 주니 에러 안남
			Class.forName("java.lang.String2");//String2라는 클래스를 찾아서 이름을 넣는것, 현재 String2 클래스는 없다.
		} catch (NullPointerException e) {
		System.out.println("실행중 오류가 발생했습니다");
		} catch (ClassNotFoundException e) { 
			System.out.println("존재하지 않는 클래스입니다");
			//e.printStrackTrace();
		} catch (Exception e) { //모든 예외처리의 최상위는 Exception e 이다
			System.out.println("알수 없는 예외 발생");
		}
		System.out.println("프로그램 종료");
	}
}
