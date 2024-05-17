package com.java8.functional.interfaces;

import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, String> function = (Integer marks) -> marks > 40? "Pass" : "Failed";
		
		System.out.println("Result = " + function.apply(45));
		System.out.println("Result = " + function.apply(35));
		
		
		IntFunction<String> functionInt = marks -> marks > 40? "Pass" : "Failed";
		
		System.out.println("Result by IntFunction = " + functionInt.apply(45));
		System.out.println("Result by IntFunction = " + functionInt.apply(35));
	}

}
