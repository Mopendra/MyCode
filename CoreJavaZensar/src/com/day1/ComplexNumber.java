package com.day1;

public class ComplexNumber {
    private double real;
    private double imaginary;

   public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        double realSum = c1.real + c2.real;
        double imaginarySum = c1.imaginary + c2.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
    	double realDiff = c1.real - c2.real;
        double imaginaryDiff = c1.imaginary - c2.imaginary;
        return new ComplexNumber(realDiff, imaginaryDiff);
    }

   public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        double realProduct = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imaginaryProduct = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

   public static void swap(ComplexNumber c1, ComplexNumber c2) {
        double tempReal = c1.real;
        double tempImaginary = c1.imaginary;
        c1.real = c2.real;
        c1.imaginary = c2.imaginary;
        c2.real = tempReal;
        c2.imaginary = tempImaginary;
    }

   @Override
	public String toString() {
		if (imaginary >= 0) {
			return real + " + " + imaginary + "i";
		} else {
			return real + " - " + Math.abs(imaginary) + "i";
		}
	}

    // Example usage
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, -5);
        
        
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        System.out.println("Addition: " + add(c1,c2));
        System.out.println("Subtraction: " + subtract(c1,c2));
        System.out.println("Multiplication: " + multiply(c1,c2));

        swap(c1,c2);
        System.out.println("After swapping:");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
    }
}
