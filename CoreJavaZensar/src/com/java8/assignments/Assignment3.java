package com.java8.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment3 {
	public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "kiwi", "pineapple"));

        words.removeIf(word -> word.length() % 2 != 0); // Remove words with odd lengths

        System.out.println("Words with even lengths: " + words);
    }
}
