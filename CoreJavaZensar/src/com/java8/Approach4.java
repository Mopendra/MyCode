package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Approach4 {
	
	public static void main(String[] args) {
		List<Transaction> allTransactions = TransactionUtils.getAllTransactions();
		
		TransactionPredicate transactionPredicateLoc = t -> "Bhilai".equals(t.getLocation());
		
		TransactionPredicate transactionPredicateAmt = t -> t.getAmount() > 500;
		
		
		List<Transaction> filterTransactions = filterTransactionByLocation(allTransactions,transactionPredicateLoc);
		
		TransactionUtils.printTransactions(filterTransactions);
		
		System.out.println("\n\n");
		
		filterTransactions = filterTransactionsByAmount(allTransactions, transactionPredicateAmt);
		TransactionUtils.printTransactions(filterTransactions);
	}
	
	private static List<Transaction> filterTransactionByLocation(List<Transaction> allTransactions, TransactionPredicate predicate) {
		 List<Transaction> bhilaiTransaction = new ArrayList<>();
		 for(Transaction transaction : allTransactions) {
			 if(predicate.test(transaction)) {
				 bhilaiTransaction.add(transaction);
			 }
		 }
		return bhilaiTransaction;
	}
	
	private static List<Transaction> filterTransactionsByAmount(List<Transaction> allTransactions, TransactionPredicate predicate) {
		 List<Transaction> amountTransaction = new ArrayList<>();
		 for(Transaction transaction : allTransactions) {
			 if(predicate.test(transaction)) {
				 amountTransaction.add(transaction);
			 }
		 }
		return amountTransaction;
	}

	

}
