package com.day1;


public class QueuedArray {
    private int maxSize; 
    private int[] ary; 
    private int front;
    private int rear; 
    private int size; 
    
   public QueuedArray(int size) {
        maxSize = size;
        ary = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

   public void push(int element) {
        if (size == maxSize) {
            System.out.println("Queue is full. Cannot push element " + element);
        } else {
            rear = (rear + 1) % maxSize;
            ary[rear] = element;
            size++;
            System.out.println("Pushed element " + element);
        }
    }
    
	public int pop() {
		if (size == 0) {
			System.out.println("Queue is empty. Cannot pop the element.");
			return -1;
		} else {
			int popedElement = ary[front];
			front = (front + 1) % maxSize;
			size--;
			System.out.println("Poped element " + popedElement);
			return popedElement;
		}
	}
    
	 public void printQueue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Elements of the queue:");
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.println(ary[i]);
                i = (i + 1) % maxSize;
                count++;
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
    	QueuedArray queue = new QueuedArray(4); 

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);// This will cause a queue overflow

        queue.printQueue();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();// This will cause a queue underflow

        queue.printQueue();

        
    }
}

