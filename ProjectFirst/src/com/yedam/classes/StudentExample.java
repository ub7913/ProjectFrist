package com.yedam.classes;

public class StudentExample {
	public static void main(String[] args) {
		Student stu = new Student();//new = 실제 인스턴스(결과:자동차)를 하나 만들기 위해 필요한것 , Student라는 타입의 stu , 내가 방금전에 만들어 놓은 Student라는 클래스를 불러 오는 것임
		stu.name = "Hong";
		stu.age = 20;
		stu.height = 178.4;
		stu.weight = 70.5;
		stu.study();
		stu.eat("banana"); //필요한 정보를 정의한것!
		
		System.out.println("이름은 : "+stu.name + ", 나이는: " +stu.age);//결과(인스턴스)를 읽어 오겠다.
		
		Student stu1 = new Student();//만들어진 인스턴스(new Student())에 stu1이라는 이름에 담는다. 타입은 Student이다.
		stu1.name = "Park";
		stu1.age = 30;
		stu1.height = 178.4;
		stu1.weight = 70.5;
		stu1.eat("사과");
		
		Student stu2 = new Student("Choi");//필드에 name 넣지 않고 생성자에 넣어서 생성자를 호출 , 매개값"Choi"을 줌
		stu2.age = 40;
		stu2.height = 168.4;
		stu2.weight = 60.5;
		System.out.println("이름은 : "+stu2.name + ", 나이는: " +stu.age);
		stu2.eat("수박");
		
		People popl = new People();
		popl.con = "Korea";
		popl.pop = 50000000;
		popl.avgh = 175;
		System.out.println("나라는: "+popl.con+", 인구는: "+popl.pop+", 평균키: "+popl.avgh);
		popl.eat1("김치");
		popl.character("조용한"); 
		
		Student[] s1 = new Student[3];
		s1[0] = stu; //일반적인 문자 같은 것들 타입이 Student타입이 아니기 때문에 에러난다.
		s1[1] = stu1;
		s1[2] = stu2;//new Student(); // '()'의 의미는 생성자라는 의미,인스턴스가 한번 만들어 질때 필드들은 한번 실행 하겠다라는 뜻, 따로 정의 하지 않으면 자바에서 디폴트 생성자라는것을 만든다.
		
		String inputStr = "Hong"; //Hong에 해당하는 것만 출력 할 수 있도록
		
		for(Student stud : s1 ) {// 만들어진 인스턴스를 반복할 수 있게 함
			if(inputStr.equals (stud.name)) {
				System.out.println(stud.name + "/ " + stud.age);//만들어진 각 인스턴스의 이름과 나이만 보도록
			} 
			System.out.println(stud.name + "/ " + stud.age);//만들어진 각 인스턴스의 이름과 나이만 보도록
		}
		//5월 11일
		Student a1 = new Student();
		a1.name = "Hong";
		a1.age = 20;
		a1.major = "English";
		
		
		Student s2 = new Student("Park"); //s2.name="Park"를 굳이 쓸필요 없다. 필드의 초기값을 "Park"으로 선언
		s2.age = 22;
		s2.major = "History";
		
		Student s3 = new Student("Choi", 25);
		s3.major = "Math";
		
		Student[] students = new Student[5];
		students[0] = a1;
		students[1] = new Student();
		students[2] = s2;
		students[3] = s3;
		students[4] = new Student();
		for (Student aa:students) {
			System.out.println(aa.name + aa.age+aa.major);
		}
	} // 내가 만든 클래스가 결과를 만들 수 있게 만들었다.
}
