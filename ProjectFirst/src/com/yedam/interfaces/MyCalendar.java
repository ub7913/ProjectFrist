package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance(); //오늘 날짜 현재 시간 기준 , Calendar 클래스 활성화 하기 위해서 import해주기
//		System.out.println(cal);
//		cal.set(2020, 5, 1); //월은 0부터 시작, 3이 바로 4월을 의미함
//		System.out.println("년도: "+ cal.get(Calendar.YEAR));
//		System.out.println("월: "+ cal.get(Calendar.MONTH));
//		System.out.println("일: "+ cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println("요일: "+ cal.get(Calendar.DAY_OF_WEEK));
		showCal(1988, 10);
	}
	
	public static void showCal(int year, int month) {
		//year, month 달력출력.
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		System.out.println("         ["+year+"년"+month+"월"+"]");
		String[] week = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		for (int i=0; i<week.length; i++) {
			System.out.print(" "+week[i]);
		}
		System.out.println();
		for(int i=1;i<dayOfWeek;i++) {
			System.out.printf("%4s", "");
		}
		for (int i=0; i<lastDay; i++) {
			System.out.printf("%4d",today); // 공란 세개를 만들고 today를 받는다.(LPAD,RPAD같은 역할) ex)%3d = 공란(---), today=3 --3d으로 출력 됨, d=int, s=String 
			if ((today + dayOfWeek-1) % 7 == 0)
				System.out.println();
			today++;
		}
	}
	
	public static int getDayOfWeek(int year, int month) {//현재 5월과 6월만 표현 했다.
		int dayOfWeek = 0;
		//일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
//		if(month == 5) {
//			dayOfWeek = 6; //금
//		} else if (month == 6) {
//			dayOfWeek = 2; //월
//		}
		Calendar cal = Calendar.getInstance();
		cal.set(year,month-1,1); //
		dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
	
	public static int getLastDay(int year, int month) {
		
		int lastDay = 0;
		if (month  <=7 && month % 2 == 1 || month >= 8 && month % 2 == 0) {
			lastDay = 31;
		} else if (month == 2) { //윤년규칙 : 년도가 4로 나누어 지면서 100으로 안나누어 지는 해, 400으로 나누어 지는 해.
			if((year%4==0 && year%100!=0)||(year%400==0)) 
				lastDay = 29;
			else
				lastDay = 28;
		} else {
			lastDay = 30;
		}
		return lastDay;
	}
}
