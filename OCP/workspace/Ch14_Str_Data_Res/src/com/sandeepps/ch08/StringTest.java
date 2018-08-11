package com.sandeepps.ch08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {

	public static void main(String[] args) {
		String pattern = "\\d";
		String searchString = "proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(searchString); // string to search
		System.out.println("\nsource: " + searchString);
		System.out.println(" index: 01234567890123456\n"); // the index
		System.out.println("expression: " + m.pattern()); // the search
															// expression
		System.out.println("match positions: "); // matches positions
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
		System.out.println("");

	}

}
