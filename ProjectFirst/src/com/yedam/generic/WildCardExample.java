package com.yedam.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

//<T>
//<?>, <? extends class>, <? super class>
//Person -> Worker
//       -> Student -> HighStudent (수업을 듣는 사람들을 분류했다고 가정)
//Course<T>
public class WildCardExample {
	
	public static void registerCourse(Course<?> course) { //1. 코스 인스턴스가 매개값으로 와야 하는데, 모든 타입이 올수 있도록 와일드카드를 정의
		//Course<Person>, Course<Worker>, Course<Student>, Course<HighStudent> 모든 타입을 매개값으로 받음
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
		// Arrays.tostring 은 이렇게 나오게 한다. {1,2,3} => [1,2,3]
	}
	
	public static void registerStudent(Course<? extends Student> course) {//2. Course 클래스의 제네릭 타입으로는 Student의 하위클래스만 받겠다는 의미
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerWorker(Course<? super Worker> course) {//3. 여기서 최하위 클래스인 Worker의 상위 클래스들만 받겠다는 와일드카드
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인 과정", 5);
		coursePerson.add(new Person("일반인")); // Student 클래스를 불러온것
		coursePerson.add(new Worker("직장인")); // Person클래스가 Worker의 부모 클래스이기때문에 매개값으로 불러올수 있음
		coursePerson.add(new Student("학생")); 
		coursePerson.add(new HighStudent("고등학생"));
		
		Course<Worker> courseWorker = new Course<Worker>("직장인 과정", 5);
		//courseWorker.add(new Person("일반인"));//Person은 Worker의 부모클래스라서 올수 없어 .add에서 에러난다.
		courseWorker.add(new Worker("직장인"));
		
		Course<Student> courseStudent = new Course<Student>("학생 과정", 5);
		courseStudent.add(new Student("학생"));//Student타입 아래만 올수 있다.
		courseStudent.add(new HighStudent("고등학생"));
		
		Course<HighStudent> courseHigh = new Course<HighStudent>("고등학생 과정", 5);
		courseHigh.add(new HighStudent("고등학생"));
		
		//1. Course<?> 코스에 관해서 모든 타입을 매개값으로 받겠다
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);
		
		//2. Course<? extends class>
		//registerStudent(courseWorker);//Worker는 Person에 상속되는 Studnet와 또다른 클래스이기 때문에 와일드 카드에 배반 되서 에러남
		registerStudent(courseStudent);
		registerStudent(courseHigh);
		
		//3. Course<? super class>
		//registerWorker(courseStudent);//Student는 Worker와 상속의 연관성이 없는 클래스이기 때문에 와일드 카드에 배반 되서 에러남
		registerWorker(courseWorker);
		registerWorker(coursePerson);
	}
}
