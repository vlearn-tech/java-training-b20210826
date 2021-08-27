package com.vlearntech.java.step02stringformattingandprinting;

public class FormatStrings {
	public static void main(String[] args) {

		String name = "Rakesh";
		int age = 30;
		int monthlySalary = 40000;

		// "Rakesh is 30 years old, and his annual salary is 480000"

		System.out.println(name + " is " + age + " years old, and his annual salary is " + (monthlySalary * 12));

		System.out.println(
				String.format("%s is %d years old, and his annual salary is %d", name, age, monthlySalary * 12));

		System.out.printf("%s is %d years old, and his annual salary is %d", name, age, monthlySalary * 12).println();

		// Two ways of formatting information
		// Use the + operator
		// use String.format()
		// Format Specifiers
		// >>> String >> %s
		// >>> int >> %d
		// >>> boolean >> %b
		// >>> Decimal >> %f

		// Alternative to format as well as print information in one function
		// System.out.printf

	}
}
