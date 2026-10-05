package com.Annotaion;

import java.util.ArrayList;

public class SuppressWarningCheck {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		System.out.println(list.get(0));
		
	}

}
