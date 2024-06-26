package com.java8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TransactionUtils {
	
	public static List<Transaction> getAllTransactions(){
		List<Transaction> transactions = new ArrayList<>();
		Random random = new Random();
		for(int i=0; i<100; i++) {
			long time = new Date().getTime();
			int amount = random.nextInt(1000);
			String location = i%2 == 0? "Pune" : "Bhilai";
			transactions.add(new Transaction(new Date(time + i*1000000), amount, location));
		}
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		for(Transaction transaction : transactions) {
			System.out.println(transaction);
		}
	}

}
