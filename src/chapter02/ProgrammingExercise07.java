/*
 * Chapter 2 Exercise 7:
 *
 *      (Find the number of years) Write a program that prompts the user to enter
 *      the minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 *      For simplicity, assume a year has 365 days.
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise07 {


	private static void howManyYearsAndDays(long minutes) {
		long years;
		long leftMinutes;
		int days;
		years = minutes / (60 * 24 * 365) ;
		leftMinutes = minutes % (60 * 24 * 365) ;
		days = (int)(leftMinutes / ( 60 * 24));
		System.out.printf("%d minutes is approximately %d years and %d days.",minutes,years,days);
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		long minutes;
		System.out.print("Enter the number of minutes : ");
		minutes = readNumber.nextLong();
		
		howManyYearsAndDays(minutes);
		
		if(readNumber != null) {
			readNumber.close();
		}

	}

}
