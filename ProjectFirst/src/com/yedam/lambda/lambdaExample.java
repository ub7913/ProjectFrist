package com.yedam.lambda;

//class MyFuncClass implements MyFunctionalInterface {
//
//	@Override
//	public void run() {
//		System.out.println("실행");
//	}
//}

public class lambdaExample {
	// 1.매개값이 있는 람다식(인터페이스)
	public static void main(String[] args) {
		MyFunctionalInterface fi = new MyFunctionalInterface() {
			//익명구현객체 (클래스 이름이 없다)
			public void run() {
				System.out.println("실행");
			}
		}; //여러번 쓸경우 클래스를 만들고 쓰면 좋고, 한번만 쓸경우 익명객체를 쓰는 것이 편하다
		fi.run();
		
		//간단한 람다표현식 -> run() 메소드 구현 하는 부분, 알 수 있는 표현을 다 제거함
		MyFunctionalInterface fi2 = /*new MyFunctionalInterface*/() -> /*{*/ //메소드 run()의 매개값이 없음 
			
			/*public void run() {*/
				System.out.println("행실");
		//	}
		/*}*/; //실행구문이 하나밖에 없으면 {} 또한 생략 할 수 있다 
		fi2.run();
		
		//2. 매개값이 있는 람다식(인터페이스)
		MySumInterface si = new MySumInterface () {
			public void sum(int num1, int num2) {
				int result = num1+num2;
				System.out.println("두수의 합: "+ result);
			}
		};
		si.sum(10, 20);
		
		MySumInterface si2 = (num1, num2) -> {
				int result = num1+num2;
				System.out.println("두수의 합: "+ result);
		};
		si2.sum(30, 20);
		
		//3.반환값이 있는 람다식(인터페이스)
		MyMultiInterface mi = new MyMultiInterface() {
			public int multi(int num1, int num2) {
				return num1*num2;
			}
		};
		int result = mi.multi(10, 15);
		System.out.println("결과값은: "+result);
		
		MyMultiInterface mi2 = (num1, num2) -> {
				return num1*num2;
		};
		result = mi2.multi(20, 15);
		System.out.println("결과값은: "+result);
	}
}
