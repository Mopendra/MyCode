package com.java8;

@FunctionalInterface
public interface TransactionPredicate {
	boolean test(Transaction t);
}
