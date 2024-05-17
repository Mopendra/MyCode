package com.java8.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;

public class Assignment7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        IntConsumer numberPrinter = num -> System.out.println(Thread.currentThread().getName() + ": " + num);
        
        Runnable runnable = () -> {
            for (Integer number : numbers) {
                numberPrinter.accept(number);
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();
    }
}


