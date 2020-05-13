package com.yedam.classes.inherit;

import java.util.Scanner;

public class AddressBookApplication {
	private Scanner scn = new Scanner(System.in);
	private Friends[] frns = new Friends[100];
	
	private void addList() {
		System.out.println("주소록 생성");
		System.out.println("친구:1, 학교:2, 직장:3");
		int sel = scn.nextInt();
		scn.nextLine();

		if (sel == 1) {
			System.out.println("친구의 이름을 입력하세요");
			String name = scn.nextLine();
			System.out.println("전화번호를 입력하세요");
			String tel = scn.nextLine();
			Friends F = new Friends(name, tel);
			for (int i = 0; i < frns.length; i++) {
				if (frns[i] == null) {
					frns[i] = F;
					break;
				}
			}
		} else if (sel == 2) {
			System.out.println("친구의 이름을 입력하세요");
			String name = scn.nextLine();
			System.out.println("전화번호를 입력하세요");
			String tel = scn.nextLine();
			System.out.println("전공을 입력하세요");
			String major = scn.nextLine();
			Friends U = new University(name, tel, major);
			for (int i = 0; i < frns.length; i++) {
				if (frns[i] == null) {
					frns[i] = U;
					break;
				}
			}
		} else if (sel == 3) {
			System.out.println("친구의 이름을 입력하세요");
			String name = scn.nextLine();
			System.out.println("전화번호를 입력하세요");
			String tel = scn.nextLine();
			System.out.println("부서를 입력하세요");
			String dept = scn.nextLine();
			Friends C = new Company(name, tel, dept);
			for (int i = 0; i < frns.length; i++) {
				if (frns[i] == null) {
					frns[i] = C;
					break;
				}
			}
		}
	}
	
	private void friendsList() {
		System.out.println("주소록 리스트");
		for (int i = 0; i < frns.length; i++) {
			if (frns[i] != null) {
				frns[i].ShowInfo();
				System.out.println("-----------------");
			}
		}
	}
	
	private void searchFriends() {
		System.out.println("이름조회");
		System.out.println("이름을 입력하세요");
		String name = scn.nextLine();
		for (Friends search : frns) {
			if (search != null && search.getName().equals(name)) {
				search.ShowInfo();
			} 
		}
		System.out.println("리스트에 없습니다");
	}
	
	public void execute() {
		while (true) {
			System.out.println("-----------------------------------");
			System.out.println("1.주소록추가   2.주소록리스트   3.이름 조회   4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				addList();
			} else if (menu == 2) {
				friendsList();
			} else if (menu == 3) {
				searchFriends();
			} else if (menu == 4) {
				System.out.println("종료선택");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
