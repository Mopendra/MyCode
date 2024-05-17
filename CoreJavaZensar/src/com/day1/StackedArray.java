package com.day1;

public class StackedArray {
	int[] ary;
	int index = -1;
	int maxArraySize;
	
	public StackedArray(int size) {		
		this.maxArraySize = size;
		ary = new int[maxArraySize];
	}
	
	public void push(int element) {
		if (index == maxArraySize - 1) {
			System.out.println("Stack overflow! Cannot push element " + element);
		} else {
			ary[++index] = element;
			System.out.println("Pushed element " + element + " onto the stack");
		}
	}
	
	public int pop() {
		if (index == -1) {
            System.out.println("Stack underflow ! it is empty");
            return -1;
        } else {
        	int element = ary[index--];
            System.out.println("element Popped " + element + " from the stack");
            return element;
        }
	}


	 public void printStack() {
	        if (index == -1) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println("Elements of the stack:");
	            for (int i = index; i >= 0; i--) {
	                System.out.println(ary[i]);
	            }
	        }
	    }

		public static void main(String[] args) {
			StackedArray stack = new StackedArray(6); // Create a stack with maximum size 5

			stack.push(100);
			stack.push(200);
			stack.push(300);
			stack.push(400);
			stack.push(500);
			stack.push(600); 
			stack.push(700);// stack overflow

			stack.printStack();

			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop(); 
			stack.pop(); // stack underflow

			stack.printStack();
	}

}


