package com.yedam.exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) { //사실 프로그래밍 하다보면 이런 오류는 발견 될수 있고, 바로 수정 하면 되지만 이번에 배우기 위해서 한번 써봄
		int[] intAry = new int[3];
		
		for (int i=0; i<=intAry.length; i++) { // 컴파일은 되지만 사실 배열의 범위를 벗어나있음
			try {
			intAry[i] = i+1;
			System.out.println(intAry[i]);
			int num1 = Integer.parseInt(args[0]);//args의 문자열을 Integer.parseInt가 정수로 바꿔준다 ex) "100" ->100 but "100a" -> 오류발생(예외처리 필요)
			} catch (ArrayIndexOutOfBoundsException e) { //AIOOB 배열 초과 예외 처리 자동완성 
				System.out.println("배열의 범위를 초과했습니다. intAry [" + i + "]");//에러난 부분을 출력해줌
			} catch (NumberFormatException e1) {
				System.out.println("변환불가");
			} catch (Exception e2) {//exception은 모든 예외들을 받아낸다. 만약 이 최상위 예외처리코드가 위로 올라가면 나머지 예외처리 문구는 필요가 없음. 다른 예외처리는 아 알지만 혹시 모를 예외가 있을 수 있으므로 마지막에 써주는 것이 좋다.
				System.out.println("알수 없는 오류 발생");
			}
		}
		System.out.println("end of program");
	}
}
//예외처리가 어떤 순서로 작용하는지 확인 할것