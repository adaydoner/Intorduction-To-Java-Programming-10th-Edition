/*
 * (Days of a month) Write a program that prompts the user to enter a year and the
 * first three letters of a month name (with the first letter in uppercase) and displays
 * the number of days in the month.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise17 {

	public static int WhichMonth(String firstThreeLetterOfMonth) {
		int month;
		switch(firstThreeLetterOfMonth) {
		case "Jan" : month = 1; break;
		case "Feb" : month = 2; break;
		case "Mar" : month = 3; break;
		case "Apr" : month = 4; break;
		case "May" : month = 5; break;
		case "Jun" : month = 6; break;
		case "Jul" : month = 7; break;
		case "Aug" : month = 8; break;
		case "Sep" : month = 9; break;
		case "Oct" : month = 10; break;
		case "Nov" : month = 11; break;
		case "Dec" : month = 12; break;
		default : month = -1; break;
		}
		return month;
	}

	public static int HowManyDays(int month, int year) {
		int days = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				days = 29;
			} else {
				days = 28;
			}
		} else {
			days = 30;
		}
		return days;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		String firstThreeLetterOfMonth;
		int month;
		int days;
		System.out.print("Enter a year : ");
		year = input.nextInt();
		System.out.print("Enter a month : ");
		firstThreeLetterOfMonth = input.next();
		month = WhichMonth(firstThreeLetterOfMonth);
		days = HowManyDays(month, year);
		if(month == -1) {
			System.out.printf("%s is an invalid input.",firstThreeLetterOfMonth);
		} else {
			System.out.printf("%s %d has %d days",firstThreeLetterOfMonth,year,days);
		}
	}
}
