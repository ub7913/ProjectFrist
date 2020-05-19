package com.yedam.nestedClasses;
//외부클래스
class A {
	A() {System.out.println("A객체가 생성됨");}
	//인스턴스 멤버 클래스.
	class B {
		B() {System.out.println("B객체가 생성됨");}
		int field1;
		//static int field2;//클래스가 만들어지는 시점에 존재하겠다는 의미?
		void method1() {System.out.println("method1() 호출됨");}
		//static void method2() {System.out.println("method2() 호출됨"); //static 타입은 올 수 없다.
	}
	//정적 멤버  클래스.
	static class C{
		C() {System.out.println("C객체가 생성됨");}
		int field1;
		static int field2; //정적인 static타입 필드도 선언 가능
		void method1() {System.out.println("method1() 호출됨");}
		static void method2() {System.out.println("method2() 호출됨");}
	}
	//로컬 클래스.
	void method() {
		class D{ //B와 같이 인스턴스(동적?) 필드와 메소드만 생성됨
			D() {System.out.println("D객체가 생성됨");}
			int field1;
			void method1() {System.out.println("method1() 호출됨");}
		}
		D d = new D();
		d.field1 = 10;
		d.method1();
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A(); //A클래스를 생성하는 변수 a
		
		A.B b = a.new B(); //a를 호출해 A 클래스에 있는 B클래스의 인스턴스를 생성
		b.field1 = 5;
		b.method1();
		
		A.C c = new A.C();
		//정적 멤버 클래스의 인스턴스 필드(메소드)
		c.field1 =10;
		c.method1();
		
		//정적 멤버 클래스의 정적필드(메소드)
		A.C.field2 = 10;
		A.C.method2();
		
		a.method();
	}
}
