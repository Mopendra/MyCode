package com.java8.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment5 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "kiwi", "pineapple"));

		UnaryOperator<String> toUpperCase = str -> str.toUpperCase();
		
		System.out.println("-------->" + toUpperCase.apply("abc"));

		words.replaceAll(toUpperCase);

		System.out.println("Uppercase words: " + words);
	}
}
