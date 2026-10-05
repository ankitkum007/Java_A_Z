package com.basicCustomeannotaion;

public class Service {
	public static void main(String[] args) {
		printInfo();
	
	}
	@LogExecute(value = "print")
	public static void printInfo() {
//		System.out.println("print the message");      
	}
}
