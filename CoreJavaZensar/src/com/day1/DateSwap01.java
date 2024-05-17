package com.day1;



class Date{
	
	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 10;
		this.month = 5;
		this.year = 2020;
	}
	

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public static void swape(Date[] d) {
		Date temp;
		temp = d[0];
		d[0] = d[1];
		d[1] = temp;		
	}

	public void print() {
		System.out.println("[" + day + ", /" + month + ", /" + year + "]");
		
	}
	
}

public class DateSwap01 {
	
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(15,8,1997);
		Date[] d = new Date[2];
		d[0] = d1;
		d[1] = d2;
		Date.swape(d);
		d[0].print();
		d[1].print();
	}

}
