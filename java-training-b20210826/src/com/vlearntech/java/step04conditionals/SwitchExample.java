package com.vlearntech.java.step04conditionals;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {

		System.out.println("Enter the character : ");
		Scanner scanner = new Scanner(System.in);
		Character c = scanner.nextLine().charAt(0); // Take the 1st character of the string
		scanner.close();

		validateUsingLadderIfElse(c);
		validateUsingSwitch(c);
		validateUsingCompactSwitch(c);

	}

	private static void validateUsingCompactSwitch(Character c) {
		System.out.print("========= COMPACT SWITCH >>>>>> ");
		// equivalent switch statement
		switch (c) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}

	private static void validateUsingSwitch(Character c) {
		System.out.print("========= NORMAL SWITCH >>>>>>> ");
		// equivalent switch statement
		switch (c) {
		case 'A':
			System.out.println("Vowel");
			break;
		case 'E':
			System.out.println("Vowel");
			break;
		case 'I':
			System.out.println("Vowel");
			break;
		case 'O':
			System.out.println("Vowel");
			break;
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}

	private static void validateUsingLadderIfElse(Character c) {
		System.out.print("========= IF ELSE >>>>>>>>>>>>> ");
		// Equivalent ladder if
		if (c == 'A') {
			System.out.println("Vowel");
		} else if (c == 'E') {
			System.out.println("Vowel");
		} else if (c == 'I') {
			System.out.println("Vowel");
		} else if (c == 'O') {
			System.out.println("Vowel");
		} else if (c == 'U') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
	}
}
