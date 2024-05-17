package com.java8.assignments;

@FunctionalInterface
public interface ArithmeticFunctionalInterface {
	public double operation(int a, int b);
	
	default void defaultFunction() {
		System.out.println("this is default function demo");
	}
}
