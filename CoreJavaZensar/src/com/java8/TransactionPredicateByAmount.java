package com.java8;

public class TransactionPredicateByAmount implements TransactionPredicate {

	@Override
	public boolean test(Transaction t) {
		return t.getAmount() > 500;
	}

}
