package com.java8.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "pineapple");

		StringBuilder firstLetters = new StringBuilder();
		Consumer<String> extractFirstLetter = word -> {
			if (!word.isEmpty()) {
				firstLetters.append(word.charAt(0)); // Append the first character of each word
			}
		};

		words.forEach(extractFirstLetter);

		String result = firstLetters.toString();

		System.out.println("First letters: " + result);
	}
}
