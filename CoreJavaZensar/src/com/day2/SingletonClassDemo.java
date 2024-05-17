package com.day2;

class SingletonClass{
	private static SingletonClass ref = null;
	
	// No public constructor
	private SingletonClass() {		
	}
	
	public static SingletonClass getInstance() {
		if(ref == null)
			ref = new SingletonClass();
		return ref;
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		System.out.println(obj1.equals(obj2));		
	}

}
