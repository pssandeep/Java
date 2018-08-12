package com.sandeepps.ch08;

import java.util.Scanner;

class ScanNext {
	public static void main(String[] args) {
		boolean b2, b;
		int i;
		String input = " a true , 4";
		String s, hits = " ";
		Scanner s1 = new Scanner(input);
		Scanner s2 = new Scanner(input);
		s2.useDelimiter(",");
		while (b = s1.hasNext()) {
			s = s1.next();
			hits += "s";
		}
		while (b = s2.hasNext()) {
			if (s2.hasNextInt()) {
				i = s2.nextInt();
				hits += "i";
			} else if (s2.hasNextBoolean()) {
				b2 = s2.nextBoolean();
				hits += "b";
			} else {
				s2.next();
				hits += "s2";
			}
		}
		System.out.println("hits " + hits);
		
		
		
		int i1 = -123;
		int i2 = 12345;
		double f = 1112332.324234;
		System.out.printf(">%1$(7d< \n", i1);
		System.out.printf(">%0,7d< \n", i2);
		System.out.format(">%+-7d< \n", i2);
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
		System.out.format(">%1$0,15.4f<", f);
	}
}