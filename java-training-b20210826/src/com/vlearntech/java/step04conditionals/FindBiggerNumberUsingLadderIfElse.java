package com.vlearntech.java.step04conditionals;

import java.util.Scanner;

public class FindBiggerNumberUsingLadderIfElse {
	public static void main(String[] args) {

		System.out.println("Enter two numbers, one by one, and press enter after each : ");

		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.valueOf(scanner.nextLine());
		int num2 = Integer.valueOf(scanner.nextLine());
		scanner.close();

		// Ladder If Else
		if (num1 > num2) {
			System.out.println("First Number is greater");
		} else if (num2 > num1) {
			System.out.println("Second Number is greater");
		} else {
			System.out.println("Both numbers are equal");
		}

	}

}
