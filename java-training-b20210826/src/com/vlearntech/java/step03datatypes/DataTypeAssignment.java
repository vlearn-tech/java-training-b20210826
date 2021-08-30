package com.vlearntech.java.step03datatypes;

public class DataTypeAssignment {
	public static void main(String[] args) {

		int i = 100;

//		short s = i; // not allowed
		short s = (short) i; // allowed with type-casting (down-casting)

		short s2 = 100;
		int i2 = s2; // allowed - implicit up-casting

		byte b = (byte) i;
		long l = i;

		int i3 = (int) l;

	}
}
