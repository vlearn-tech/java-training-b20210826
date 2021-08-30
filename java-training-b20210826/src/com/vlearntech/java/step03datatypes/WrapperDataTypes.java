package com.vlearntech.java.step03datatypes;

public class WrapperDataTypes {
	public static void main(String[] args) {

		int maxVal = Integer.MAX_VALUE;

		Integer i = 100;
		short s = i.shortValue(); // conversion

//		int age = "12"; // not allowed
		Integer age = Integer.valueOf("12");

		System.out.println(age + 10);

//		boolean isMarrried = "False";
		Boolean isMarried = Boolean.valueOf("TRUE");

		System.out.println(isMarried);

		Float f = Float.valueOf("10.6");

		Double d = Double.valueOf(101.6);
		Double d2 = Double.valueOf("10540.6");

		System.out.println("d = " + d + " d2 = " + d2 / 2);

	}
}
