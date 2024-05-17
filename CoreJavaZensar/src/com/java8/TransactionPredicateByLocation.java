package com.java8;

public class TransactionPredicateByLocation implements TransactionPredicate{

	@Override
	public boolean test(Transaction t) {
		return "Bhilai".equals(t.getLocation());
	}

}
