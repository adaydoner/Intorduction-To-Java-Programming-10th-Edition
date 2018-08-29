/*
 * (Display calendars) Write a program that prompts the user to enter the year and
 * first day of the year and displays the calendar table for the year on the console. For
 * example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 * your program should display the calendar for each month in the year
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise29 {
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
		days = firstDayOfYear;
		// we get both year and first day of that year.
		System.out.println("\n\n");
		
		for (int month = 1; month <= 12; month++) {
			System.out.printf("%20s%s %d", "", Month(month), year);
			System.out.print("\n------------------------------------------------------------\n");
			System.out.printf("%6s %6s %6s %6s %6s %6s %6s\n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
			days += NumbersOfDaysInMonth(month - 1, year);
			int howManyDays = NumbersOfDaysInMonth(month, year);
			switch (days % 7) { // for starting on right position for each different first day of months and make new line correctly , we will separate every print methods by first days.
			case 0:							  // If (days % 7 == 0 ) this mean it will start from MONDAY.
				for (int i = 1; i <= howManyDays; i++) {
					System.out.printf("%6d ", i);
					if (i % 7 == 0) {	// start from MONDAY and in every 7 days new line.
						System.out.println();
					}
				}System.out.println();break;
			case 1:
				System.out.printf("%6s ", "");	// If (days % 7 == 1 ) this mean it will start from TUESDAY so it need this much space.
				for (int i = 1; i <= howManyDays; i++) {
					System.out.printf("%6d ", i);
					if ((i - 6 ) % 7 == 0) {	// Sunday column would be 6 - 13 - 20 - ... so we need new line each i - 6 % 7 == 0
						System.out.println();
					}
				}System.out.println();break;
			case 2:
				System.out.printf("%13s ", ""); // If (days % 7 == 2 ) this mean it will start from WEDNESDAY so it need this much space.
				for (int i = 1; i <= howManyDays; i++) {
					System.out.printf("%6d ", i);
					if ((i - 5) % 7 == 0){ // Sunday column would be 5 - 12 - 19 - ... so we need new line each i - 5 % 7 == 0
						System.out.println();
					}
				}System.out.println();break;
			case 3:
				System.out.printf("%20s ",""); // If (days % 7 == 3 ) this mean it will start from THURSDAY so it need this much space.
				for (int i = 1; i <= howManyDays; i++) {
					System.out.printf("%6d ", i);
					if ((i - 4) % 7 == 0){ // Sunday column would be 4 - 11 - 18 - ... so we need new line each i - 4 % 7 == 0
						System.out.println();
					}
				}System.out.println();break;
			case 4:
				System.out.printf("%27s ",""); // If (days % 7 == 4 ) this mean it will start from FRIDAY so it need this much space.
				for (int i = 1; i <= howManyDays; i++) {
					System.out.printf("%6d ", i);
					if ((i - 3) % 7 == 0){ // Sunday column would be 3 - 10 - 17 -... so we need new line each i - 3 % 7 == 0
						System.out.println();
					}
				}System.out.println();break;
			case 5:
				System.out.printf("%34s ",""); // If (days % 7 == 5 ) this mean it will start from SATURDAY so it need this much space.
				for (int i = 1; i <= howManyDays; i++) {
					System.out.printf("%6d ", i);
					if ((i - 2) % 7 == 0){ // Sunday column would be 2 - 9 - 16 - ... so we need new line each i - 2 % 7 == 0
						System.out.println();
					}
				}System.out.println();break;
			case 6:
				System.out.printf("%41s ",""); // If (days % 7 == 6 ) this mean it will start from SUNDAY so it need this much space.
				for (int i = 1; i <= howManyDays; i++) {
					System.out.printf("%6d ", i);
					if ((i - 1) % 7 == 0){ // Sunday column would be 1 - 8 - 15 - ... so we need new line each i - 1 % 7 == 0
						System.out.println();
					}
				}System.out.println();break;
			}
			System.out.print("\n");
		}
		input.close();
	}
}
