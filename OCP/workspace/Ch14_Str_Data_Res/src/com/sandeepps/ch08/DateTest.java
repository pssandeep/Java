package com.sandeepps.ch08;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest {
	public static void main(String[] args) {
		Date d1 = new Date(1_000_000_000_000L); // a trillion, Java 7 style
		System.out.println("1st date " + d1.toString());
		d1.setTime(d1.getTime() + 3_600_000); // 3_600_000 millis / hour
		System.out.println("new time " + d1.toString());
		Date now = new Date();
		System.out.println("The Time Now is " + now.toString());

		// Calendar
		System.out.println("-----Calendar-----");
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar - The current time is " + c.getTime());
		System.out.println("c is of type  " + c.getClass());

		c.setTime(d1); // #1
		if (Calendar.MONDAY == c.getFirstDayOfWeek()) // #2
			System.out.println("Sunday is the first day of the week");
		System.out.println(c.getFirstDayOfWeek());
		System.out.println("trillionth milli day of week is "
				+ c.get(Calendar.DAY_OF_YEAR)); // #3
		c.add(Calendar.MONTH, 2); // #4
		Date d2 = c.getTime(); // #5
		System.out.println("new date " + d2.toString());
		// System.out.println(c.get);

		c.roll(Calendar.MINUTE, 19); // notice the year in the output
		Date d4 = c.getTime();
		System.out.println("new date " + d4.toString());

		System.out.println("-----DateFormat-----");
		Date d5 = new Date(1_000_000_000_000L); // project Coin at work!
		Locale l = new Locale("ja");
		DateFormat[] dfa = new DateFormat[7];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL,l);
		dfa[6] = DateFormat.getTimeInstance();

		for (DateFormat df : dfa)
			System.out.println(df.format(df));

//		Parse Function
		System.out.println("-----Parse Func-----");
		Date d6 = new Date(1000000000000L);
		System.out.println("d6 = " + d6.toString());
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT, 0);
		String s = df.format(d6);
		System.out.println(s);
		try {
			Date d7 = df.parse(s);
			System.out.println("parsed = " + d7.toString());
		} catch (ParseException pe) {
			System.out.println("parse exc");
		}
	}
}