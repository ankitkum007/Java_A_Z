package com.Annotaion;

public class Cat extends Animals {
	@Override
	public void sound() {
		System.out.println("cat sound: meaau");

	}
	public static void main(String[] args) {
		Animals c = new Cat();
		c.sound();
		
	}
}
