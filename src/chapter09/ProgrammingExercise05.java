/*
 * (Use the GregorianCalendar class) Java API has the GregorianCalendar class in the java.util package, which you can use to obtain the year, month, and day of a date.
 *  The no-arg constructor constructs an instance for the current date, and the methods 
 *  		get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
 *  Write a program to perform two tasks:
 *  		Display the current year, month, and day.
 *  		The GregorianCalendar class has the setTimeInMillis(long), which can be used to set a specified elapsed time since January 1, 1970. 
 *  			Set the value to 1234567898765L and display the year, month, and day.
 */
package chapter09;

import java.util.GregorianCalendar;

public class ProgrammingExercise05 {
	public static void main(String[] args) {
		currentTime();
		specifiedTime();
	}

	private static void currentTime() {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.printf("%d/%d/%d \n",calendar.get(GregorianCalendar.YEAR), calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.DATE));
	}

	private static void specifiedTime() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(1234567898765L);
		System.out.printf("%d/%d/%d",calendar.get(GregorianCalendar.YEAR), calendar.get(GregorianCalendar.MONTH), calendar.get(GregorianCalendar.DATE));
	}
}
