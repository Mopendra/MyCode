package com.java8.functional.interfaces;

import java.util.Random;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

import com.java8.Transaction;

public class SupplierDemo {

	public static void main(String[] args) {
		IntSupplier supplier = () -> new Random().nextInt(1000);
		
		System.out.println(supplier.getAsInt());
		
		Supplier<Transaction> supplier2 = () -> new Transaction();
		Function<Integer, Transaction> function = (i) ->new Transaction(i);
		
		Supplier<Transaction> supplier3 = Transaction::new;
		Function<Integer, Transaction> function2 = Transaction::new;
		Transaction t = function2.apply(1001);

	}

}
