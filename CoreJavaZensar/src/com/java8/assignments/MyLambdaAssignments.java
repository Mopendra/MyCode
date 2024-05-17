package com.java8.assignments;

public class MyLambdaAssignments {

	public static void main(String[] args) {
		ArithmeticFunctionalInterface addPredicate = (a,b) -> a+b;
		ArithmeticFunctionalInterface subPredicate = (a,b) -> a-b;
		ArithmeticFunctionalInterface multiPredicate = (a,b) -> a*b;
		ArithmeticFunctionalInterface divPredicate = (a,b) -> a/b;
		
		System.out.println("sum = " + addPredicate.operation(3, 4));
		System.out.println("sub = " + subPredicate.operation(3, 4));
		System.out.println("mul = " + multiPredicate.operation(3, 4));
		System.out.println("div = " + divPredicate.operation(3, 4));
		divPredicate.defaultFunction();
	}

}


