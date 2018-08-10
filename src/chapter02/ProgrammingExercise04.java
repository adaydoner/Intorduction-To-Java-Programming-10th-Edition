/*
 * Chapter 2 Exercise 4:
 *
 *      (Convert pounds into kilograms) Write a program that converts pounds into kilo- grams.
 *      The program prompts the user to enter a number in pounds, converts it to kilograms,
 *      and displays the result. One pound is 0.454 kilograms.
 */

package chapter02;

import java.util.Scanner;

public class ProgrammingExercise04 {
	public static void poundsIntoKilogram(double pounds) {
		double kilogram;
		kilogram = pounds * 0.454;
		System.out.printf("%.2f pounds is %.3f kilograms",pounds,kilogram);
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		double pounds;
		System.out.print("Enter a number in pounds : ");
		pounds = readNumber.nextDouble();
		poundsIntoKilogram(pounds);
		
		if(readNumber != null) {
			readNumber.close();
		}

	}

}
