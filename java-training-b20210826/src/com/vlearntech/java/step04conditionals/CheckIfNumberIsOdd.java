package com.vlearntech.java.step04conditionals;

public class CheckIfNumberIsOdd {
	public static void main(String[] args) {

		Integer i = null;

		boolean isOdd = validateIfOdd(i);

		System.out.println(String.format("%d is an odd number. This statement is '%b'", i, isOdd));

	}

	private static boolean validateIfOdd(Integer i) {

		// If statement without an else block
		if (i == null) {
			System.out.println("No value entered. Returning false as default");
			return false;
		}

//		if the number is divisible by 2 then it is even else it is odd

		if (i % 2 == 0) {
			return false; // remainder was 0, hence even.
		} else {
			return true; // remainder was not 0, hence odd.
		}

//		if (condition) {
//			// what is to be done if condition is satisfied
//		} else {
//			// what is to be done if condition is NOT satisfied
//		}

	}
}
