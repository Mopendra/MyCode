package com.java8.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		IntConsumer consumer = x -> System.out.println(x);
		
		printList(Arrays.asList(10,30,40,50,60), consumer);

	}

	private static void printList(List<Integer> asList, IntConsumer consumer) {		
		for (Integer i : asList) {
			consumer.accept(i);
		}
	}

}
