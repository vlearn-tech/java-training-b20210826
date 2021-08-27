package com.vlearntech.java.step02stringformattingandprinting;

public class PrintTable {
	public static void main(String[] args) {

		int whichTableToPrint = 234;

		System.out.println(whichTableToPrint + " x 1 = " + whichTableToPrint * 1);
		System.out.println(String.format("%d x 2 = %d", whichTableToPrint, whichTableToPrint * 2));
		System.out.println();

	}
}
