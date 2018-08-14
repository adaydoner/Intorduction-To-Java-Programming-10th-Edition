/*
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
 * Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise21 {

	private static int DayOfTheWeek(int year, int month, int dayOfTheMonth) {
		int day;
		int century = year / 100;
		int yearOfTheCentury = year % 100;
		day = (dayOfTheMonth + 26 * (month + 1) / 10 + yearOfTheCentury + yearOfTheCentury / 4 + century / 4 + 5 * century) % 7;
		return day;
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int year;
		int month;
		int dayOfTheMonth;
		int day;
		String[] daysOfWeek = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		System.out.print("Enter a year(e.g., 2012) : ");
		year = readNumber.nextInt();
		System.out.print("Enter a month(1-12) : ");
		month = readNumber.nextInt();
		if (month == 1) {
			month = 13;
			year--;
		} else if (month == 2) {
			month = 14;
			year--;
		}
		System.out.print("Enter a day of the month(1-31) : ");
		dayOfTheMonth = readNumber.nextInt();

		day = DayOfTheWeek(year, month, dayOfTheMonth);
		System.out.printf("Day of the week is %s",daysOfWeek[day]);
		readNumber.close();
	}
}
