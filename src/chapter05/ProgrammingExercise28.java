/*
 * (Display the first days of each month) Write a program that prompts the user to
 * enter the year and first day of the year, and displays the first day of each month
 * in the year. For example, if the user entered the year 2013, and 2 for Tuesday,January 1, 2013,
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise28 {

	public static String Month(int monthNumber) {
		// This method would return month of year from integer. If we send "3" to this method it would return "March". We need this while printing out each month in loop.
		String month = "";
		switch (monthNumber) {
		case 1:	month = "January";break;
		case 2:	month = "February";	break;
		case 3:	month = "March";break;
		case 4:	month = "April";break;
		case 5:	month = "May";break;
		case 6:	month = "June";break;
		case 7:	month = "July";break;
		case 8:	month = "August";break;
		case 9:	month = "September";break;
		case 10:month = "October";break;
		case 11:month = "November";break;
		case 12:month = "December";break;
		default:month = "Invalid month";break;
		}
		return month;
	}
	public static String FirstDay(int dayNumber) {
		// This method would return day of week from integer. If we send "3" to this method it would return "Thursday". We need this while printing out first day of each month in loop.
		String firstDay = "";
		switch(dayNumber) {
		case 0: firstDay = "Monday"; break;
		case 1: firstDay = "Tuesday"; break;
		case 2: firstDay = "Wednesday"; break;
		case 3: firstDay = "Thursday"; break;
		case 4: firstDay = "Friday"; break;
		case 5: firstDay = "Saturday"; break;
		case 6 : firstDay = "Sunday"; break;
		default : firstDay = "Invalid Day"; break;
		}
		return firstDay;
	}
	public static boolean IsLeapYear(int year) {
		// If any year that user specified would be leap year , February would have 29 days. 
		boolean isLeapYear;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}
	public static int NumbersOfDaysInMonth (int monthNumber,int year) {
		int numbersOfDays = 1;
		switch(monthNumber) {
		case 1:	numbersOfDays = 31;break;
		case 2: if (IsLeapYear(year)) {
			numbersOfDays = 29;
		}else {
			numbersOfDays = 28;
		} break;
		case 3:	numbersOfDays = 31;break;
		case 4:	numbersOfDays = 30;break;
		case 5:	numbersOfDays = 31;break;
		case 6:	numbersOfDays = 30;break;
		case 7:	numbersOfDays = 31;break;
		case 8:	numbersOfDays = 31;break;
		case 9:	numbersOfDays = 30;break;
		case 10:numbersOfDays = 31;break;
		case 11:numbersOfDays = 30;break;
		case 12:numbersOfDays = 31;break;
		default:numbersOfDays = 0;break;
		}
		return numbersOfDays;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		int firstDayOfYear;
		int days = 0;
		System.out.print("Enter the year : ");
		year = input.nextInt();
		System.out.println("0 : Monday\n1 : Tuesday\n2 : Wednesday\n3 : Thursday\n4 : Friday\n5: Saturday\n6 : Sunday");
		System.out.print("Enter first day of the year : ");
		firstDayOfYear = input.nextInt();
		// we get both year and first day of that year.
		days = firstDayOfYear;
		System.out.println("\n\n");
		System.out.printf("%-5s%s%4d%2s%-9s\n", Month(1), " 1 , ", year, " is ", FirstDay(firstDayOfYear)); // we print first day of year according to user's input.
		for (int month = 2; month <= 12; month++) {
			String monthName = Month(month);
			days += NumbersOfDaysInMonth(month - 1, year); // we add past days untill computing month.
			String firstDayOfMonth = FirstDay(days % 7); // send number of days mod 7 to the FirstDay method and get first days of computing month as a string. 
			System.out.printf("%-5s%s%4d%2s%-9s\n", monthName, " 1 , ", year, " is ", firstDayOfMonth);	// print first days of each month out.
		}
		input.close();
	}
}
