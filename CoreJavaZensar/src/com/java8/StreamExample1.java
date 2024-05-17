package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {	
	public static void main(String[] args) {

		/*
		 * List<Transaction> allTransactions = TransactionUtils.getAllTransactions(); Comparator<Transaction> comparator
		 * = (t1, t2) -> { if (t1.getAmount() > t2.getAmount()) return 1; else if (t1.getAmount() < t2.getAmount())
		 * return -1; else return 0; }; allTransactions.stream().filter(t -> t.getAmount() >
		 * 500).sorted(comparator).forEach(System.out::println);
		 */

		approach2();
	}
	
	static void approach2() {
		//List<Transaction> allTransactions = TransactionUtils.getAllTransactions();

		/*
		 * allTransactions.stream().filter(t -> t.getAmount() > 500).
		 * sorted(Comparator.comparing(Transaction::getAmount).reversed()).forEach(System.out::println);
		 */
		
		/*
		 * allTransactions.stream().filter(t -> t.getAmount() > 500).
		 * sorted(Comparator.comparing(Transaction::getAmount).reversed()).limit(5). forEach(System.out::println);
		 */
		
		/*
		 * allTransactions.stream().filter(t -> t.getAmount() > 500).
		 * sorted(Comparator.comparing(Transaction::getAmount).reversed()).skip(46). forEach(System.out::println);
		 */
		
		/*
		 * allTransactions.stream().filter(t -> t.getAmount() > 500).
		 * sorted(Comparator.comparing(Transaction::getAmount).reversed()).map(Transaction::getId).forEach(System.out::
		 * println);
		 */
		
		/*
		 * Function<Transaction, String> function = t -> t.getId();
		 * 
		 * allTransactions.stream().filter(t -> t.getAmount() > 500).
		 * sorted(Comparator.comparing(Transaction::getAmount).reversed()).map(function).forEach(System.out::println);
		 */
		
		
		Stream<List<Integer>> stream = Stream.of(Arrays.asList(10,3,5),Arrays.asList(20,32,52));
		List<Integer> flatMap = stream.flatMap(List::stream).collect(Collectors.toList());
		//flatMap.forEach(System.out::println);
		
		
		/*
		 * boolean allMatch = flatMap.stream().allMatch(i -> i > 1); System.out.println(allMatch);
		 */
		
		//Optional<Integer> op = flatMap.stream().filter(t -> t > 10).findAny();
		
		/*
		 * if(op.isPresent()) System.out.println(op.get());
		 */
		
		/*
		 * Optional<Integer> op = flatMap.stream().filter(t -> t > 10).findFirst(); if (op.isPresent())
		 * System.out.println(op.get());
		 */
		
		/*
		 * int result = flatMap.stream().reduce(0, Integer::sum); System.out.println(result);
		 */
		
		/*
		 * int result = flatMap.stream().reduce(0, Integer::max); System.out.println(result);
		 */
		 
		/*
		 * long result = flatMap.stream().filter(i -> i>5).count(); System.out.println(result);
		 */
		
		 Stream<Integer> result = Stream.iterate(2, n -> n*n*n).limit(3); 
		 result.forEach(System.out::println);
	}
}
