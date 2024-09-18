package com.destination.javafullstack.day10;

public class Calculator {
	void add() {
		int a=100;
		int b=20;
		System.out.println(a+b);
		System.out.println("=====");
	}
	void sub() {
		int a=100;
		int b=20;
		System.out.println(a-b);
		System.out.println("=====");
	}
	void mul() {
		int a=100;
		int b=20;
		System.out.println(a*b);
		System.out.println("=====");
	}
	void div() {
		int a=100;
		int b=20;
		System.out.println(a/b);
		System.out.println("=====");
	}
   public static void main(String[] args) {
	Calculator c1 = new Calculator();
	c1.add();
	c1.sub();
	c1.mul();
	c1.div();
}
}
