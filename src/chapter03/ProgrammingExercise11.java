/*
 * (Find the number of days in a month) Write a program that prompts the user
 * to enter the month and year and displays the number of days in the month. For
 * example, if the user entered month 2 and year 2012, the program should display
 * that February 2012 had 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 had 31 days.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise11 {

	private static int HowManyDays(int month, int year) {
		int days = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} 
		else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days = 29;
			} 
			else {
				days = 28;
			}
		}
		else {
			days = 30;
		}
		return days;
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int month;
		int year;
		int daysOfEnteredDate;
		System.out.print("Month and Year (Example : 4 2016) : ");
		month = readNumber.nextInt();
		year = readNumber.nextInt();
		daysOfEnteredDate = HowManyDays(month, year);
		System.out.println(month + "/" + year + " has " + daysOfEnteredDate + " days.");
		readNumber.close();
	}
}
