package com.sandeepps.ch08;

import java.util.Scanner;

class ScanIn {
	public static void main(String[] args) {
		System.out.print("input: ");
		System.out.flush();
		try {
			Scanner s = new Scanner(System.in);

			String token;
			do {
				token = s.findInLine(args[0]);
				System.out.println("found " + token);
			} while (token != null);
			s.close();
		} catch (Exception e) {
			System.out.println("scan exc");
		}
	}
}