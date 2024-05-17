package com.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
	    // Comparator<Transaction> comparator = (t1, t2) -> t1.getLocation().compareTo(t2.getLocation());
		
		//approach 2
		Comparator<Transaction> comparator = Comparator.comparing(Transaction::getLocation);
		
		List<Transaction> allTransactions = TransactionUtils.getAllTransactions();
		TransactionUtils.printTransactions(allTransactions);
		System.out.println("\n\n");
		
		Collections.sort(allTransactions,comparator);
		TransactionUtils.printTransactions(allTransactions);
		
		//approach 2
		
		
		
	}
	
	

}
