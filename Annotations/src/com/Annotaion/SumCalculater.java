package com.Annotaion;

public class SumCalculater extends Calculater {
	public int display(int a, int b) {
		return a + b;
	}
	@SuppressWarnings(value = {"deprecation" })
	public static void main(String[] args) {
		
		SumCalculater operation = new SumCalculater();
		System.out.println(operation.sum(100, 150));
		System.out.println(operation.sub(100, 150));
		System.out.println(operation.sum(100, 150));
		System.out.println(operation.sum(100, 150));
		
		
		
		
		
	}

}
