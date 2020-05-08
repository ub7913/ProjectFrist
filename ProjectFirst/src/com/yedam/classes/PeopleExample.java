package com.yedam.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People p1 = new People(); //내가 People()를 만들진 않았지만 default로 자바가 만들어 주었다. 이게 People 클래스안의 필드를 불러올수 있게끔 해준다.
		p1.con = "Korea";
		p1.pop = 50000000;
		p1.avgh = 175;
		System.out.println("나라는: "+p1.con+", 인구는: "+p1.pop+", 평균키: "+p1.avgh);
		p1.eat1("김치");
		
		People p2 = new People();
		p2.con = "Nepal";
		p2.pop = 30000000;
		p2.avgh = 165;
		System.out.println("나라는: "+p2.con+", 인구는: "+p2.pop+", 평균키: "+p2.avgh);
		p2.eat1("찌야");
		
		People p3 = new People(); 
		p3.con = "New Zealand";
		p3.pop = 25000000;
		p3.avgh = 180;
		System.out.println("나라는: "+p3.con+", 인구는: "+p3.pop+", 평균키: "+p3.avgh);
		p3.eat1("빵");
		
		People[] p4 = new People[3];//People(타입)[](배열) p4(변수이름) = new(인스턴스만들때 필요) People(클래스를 불러오는것)[3](배열의 크기);
		p4[0]=p1;
		p4[1]=p2;
		p4[2]=p3;
		
		for(People peo : p4) {
			System.out.println("나라 : "+ peo.con);//eat1은 메소드로 지정이 되어 있어서 배열에서 굳이 쓸 필요가 없다. 
			peo.showInfo();//People 안에서 이 메소드안에 필드값을 넣어서 정의 해주면, 인스턴스를 for문으로 이렇게 쉽게 출력할 수 있다.
			//peo.eat1("");//하지만 굳이 써서 매개값을 넣어 준다면 넣어준 매개값("")만 출력 된다.
		}
	}
}
