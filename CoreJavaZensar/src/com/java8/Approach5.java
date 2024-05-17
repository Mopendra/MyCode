package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Approach5 {
	
	public static void main(String[] args) {
		List<Transaction> allTransactions = TransactionUtils.getAllTransactions();
		
		Predicate<Transaction> transactionPredicateLoc = t -> "Bhilai".equals(t.getLocation());
		
		Predicate<Transaction> transactionPredicateAmt = t -> t.getAmount() > 500;
		
		
		List<Transaction> filterTransactions = filterTransactionByLocation(allTransactions,transactionPredicateLoc);
		
		TransactionUtils.printTransactions(filterTransactions);
		
		System.out.println("\n\n");
		
		filterTransactions = filterTransactionsByAmount(allTransactions, transactionPredicateAmt);
		TransactionUtils.printTransactions(filterTransactions);
	}
	
	private static List<Transaction> filterTransactionByLocation(List<Transaction> allTransactions, Predicate<Transaction> predicate) {
		 List<Transaction> bhilaiTransaction = new ArrayList<>();
		 for(Transaction transaction : allTransactions) {
			 if(predicate.test(transaction)) {
				 bhilaiTransaction.add(transaction);
			 }
		 }
		return bhilaiTransaction;
	}
	
	private static List<Transaction> filterTransactionsByAmount(List<Transaction> allTransactions, Predicate<Transaction> predicate) {
		 List<Transaction> amountTransaction = new ArrayList<>();
		 for(Transaction transaction : allTransactions) {
			 if(predicate.test(transaction)) {
				 amountTransaction.add(transaction);
			 }
		 }
		return amountTransaction;
	}

	

}
