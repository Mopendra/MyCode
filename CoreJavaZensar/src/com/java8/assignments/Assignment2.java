package com.java8.assignments;

import java.util.function.Predicate;

public class Assignment2 {

	public static void main(String[] args) {
		Predicate<Order> predicate = (order) -> order.getOrderAmt() > 10000 && order.getStatus().equals("ACCEPTED");
		
		System.out.println("Order Status -> " + predicate.test(new Order(9000,"ACCEPTED")));
		System.out.println("Order Status -> " + predicate.test(new Order(11000,"ACCEPTED")));
		System.out.println("Order Status -> " + predicate.test(new Order(11000,"REJECTED")));
		
	}

}

class Order{
	int orderAmt;
	String status;
	
	public Order() {
	}
	
	public Order(int orderAmt, String status) {
		this.orderAmt = orderAmt;
		this.status = status;
	}

	public int getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(int orderAmt) {
		this.orderAmt = orderAmt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}