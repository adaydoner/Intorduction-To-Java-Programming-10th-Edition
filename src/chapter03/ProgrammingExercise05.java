/*
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today�s day of the week (Sunday is 0, Monday is 1, �, and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise05 {

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int todaysDay;
		int elapsedDay;
		String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println("0 : Sunday \n1 : Monday \n2 : Tuesday \n3 : Wednesday \n4 : Thursday \n5 : Friday \n6 : Saturday\n");
		System.out.print("Enter today's day : ");
		todaysDay = readNumber.nextInt();
		System.out.print("Enter the number of days elapsed since today : ");
		elapsedDay = readNumber.nextInt();
		System.out.println("Today is " + daysOfWeek[todaysDay] + " and the future day is " + daysOfWeek[(todaysDay + elapsedDay) % 7] );
		readNumber.close();
	}

}
