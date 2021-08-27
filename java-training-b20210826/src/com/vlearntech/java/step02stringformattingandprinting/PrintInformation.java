package com.vlearntech.java.step02stringformattingandprinting;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrintInformation {
	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("Hello to all of you");
		System.out.println(2021);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());

		// Two ways of printing information
		// System.out.print(); // no extra line at end of the printed info
		// System.out.println(); // a line carriage at the end of the printed info

	}
}
