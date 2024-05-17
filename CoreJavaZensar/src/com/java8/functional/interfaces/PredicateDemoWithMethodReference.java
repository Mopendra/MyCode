package com.java8.functional.interfaces;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemoWithMethodReference {

	public static void main(String[] args) {
		Predicate<Integer> predicate = PredicateDemoWithMethodReference::checkOddEven;
		
		
		for(int i = 1; i < 10; i++) {
			String evenOdd = predicate.test(i)?"Even":"Odd";
			System.out.println(i + " is " + evenOdd);
		}
		
		System.out.println(" ------------------- ");
		
		IntPredicate intPredicate = PredicateDemoWithMethodReference::checkOddEven;
		
		for(int i = 1; i < 10; i++) {
			String evenOdd = intPredicate.test(i)?"Even":"Odd";
			System.out.println(i + " is " + evenOdd);
		}			

	}
	
	static boolean checkOddEven(int i) {
		 return i % 2 == 0;
	}

}
