package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Approach1 {
	
	public static void main(String[] args) {
		List<Transaction> allTransactions = TransactionUtils.getAllTransactions();
		
		List<Transaction> filterTransactions = filterTransactionByLocation(allTransactions,"Bhilai");
		TransactionUtils.printTransactions(filterTransactions);
		
		System.out.println("\n\n");
		
		filterTransactions = filterTransactionsByAmount(allTransactions, 500);
		TransactionUtils.printTransactions(filterTransactions);
	}
	
	private static List<Transaction> filterTransactionByLocation(List<Transaction> allTransactions, String location) {
		 List<Transaction> bhilaiTransaction = new ArrayList<>();
		 for(Transaction transaction : allTransactions) {
			 if(location.equals(transaction.getLocation())) {
				 bhilaiTransaction.add(transaction);
			 }
		 }
		return bhilaiTransaction;
	}
	
	private static List<Transaction> filterTransactionsByAmount(List<Transaction> allTransactions, int amount) {
		 List<Transaction> amountTransaction = new ArrayList<>();
		 for(Transaction transaction : allTransactions) {
			 if(amount < transaction.getAmount()) {
				 amountTransaction.add(transaction);
			 }
		 }
		return amountTransaction;
	}

	

}
