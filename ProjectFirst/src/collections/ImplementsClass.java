package collections;


interface Runnable<T> {
	public void run(T t);
}

class Car implements Runnable<String> {
	@Override
	public void run(String str) {
		System.out.println("자동차 달린다");
	}
}

class Bus implements Runnable<String> {
	@Override
	public void run(String intVal) {
		System.out.println("버스가 달린다");
	}
}

public class ImplementsClass {
	// 메소드 구현.

	public static void callRun(Runnable<String> runnable) { // 인터페이스 클래스를 매개값으로 썼다.
		runnable.run("Hello");
	}

	public static void main(String[] args) {
		Runnable<String> runnable = new Car();
		runnable.run("Car");
		runnable = new Bus();
		runnable.run("Bus");
		runnable = (str) -> System.out.println("익명 객체 달립니다");// 익명구현객체 , 람다표현식
		runnable.run("Run");

		callRun(new Car());
		callRun((str) -> System.out.println("메소드 매개값 달린다"));
//		callRun(new Runnable() {
//			public void run() {
//				System.out.println("메소드 매개값 달린다");
//			}
//		});
	}
}
