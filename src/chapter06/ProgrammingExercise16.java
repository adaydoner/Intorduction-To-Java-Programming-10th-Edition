/*
 * (Number of days in a year) Write a method that returns the number of days in a year using the following header:
 * 
 * public static int numberOfDaysInAYear(int year)
 * 
 * Write a test program that displays the number of days in year from 2000 to 2020.
 */
package chapter06;

public class ProgrammingExercise16 {

	private static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int numberOfDaysInAYear(int year) {
		if (isLeapYear(year)) {
			return 366;
		} else {
			return 365;
		}
	}

	public static void main(String[] args) {
		System.out.printf("%-4s%10s%-4s\n","Year"," ","Days");
		System.out.println("-------------------");
		for (int year = 2000; year <= 2020; year++) {
			System.out.printf("%-4d%10s%-4d\n",year," ",numberOfDaysInAYear(year));
		}
	}
}
