package com.yedam.classes;

import com.yedam.classes.inherit.Parent;

public class ParentEx {
	public static void main(String[] args) {
		Parent parent = new Parent("","","");
		parent.getLastName();//default 접근 불가 확인 가능
		parent.getFirstName();//protected 접근 불가 확인 가능
		parent.getTelNumber();//public
	}
}
