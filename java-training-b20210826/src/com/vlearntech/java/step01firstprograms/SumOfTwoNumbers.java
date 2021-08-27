package com.vlearntech.java.step01firstprograms;

public class SumOfTwoNumbers {
	public static void main(String[] args) {

		int c = 10;
		int d = 20;

		int sum = Calculator.sum(c, d);
		System.out.println(sum);
		// The sum of 10 and 20 is 30

		sum = Calculator.sum(1000, 2000);
		System.out.println(sum);

		sum = Calculator.product(25, d);
		System.out.println(sum);
		// The product of 25 and 20 is 500

		sum = Calculator.minus(25, 10);
		System.out.println(sum);

	}
}
