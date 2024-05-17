package com.java8.functional.interfaces;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		
		
		for(int i = 1; i < 10; i++) {
			String evenOdd = predicate.test(i)?"Even":"Odd";
			System.out.println(i + " is " + evenOdd);
		}
		
		System.out.println(" ------------------- ");
		
		IntPredicate intPredicate = i -> i % 2 == 0;
		
		for(int i = 1; i < 10; i++) {
			String evenOdd = intPredicate.test(i)?"Even":"Odd";
			System.out.println(i + " is " + evenOdd);
		}			

	}

}
