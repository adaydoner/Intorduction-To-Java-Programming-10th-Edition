/*
 * Chapter 2 Exercise 3:
 *
 *      (Convert feet into meters) Write a program that reads a number in feet,
 *      converts it to meters, and displays the result. One foot is 0.305 meter.
 *
 */
package chapter02;

import java.util.Scanner;

public class ProgrammingExercise03 {

	public static void feetIntoMeters(double feet) {
		double meters;
		meters = feet * 0.305;
		System.out.printf("%.2f feet is %.4f meters.", feet, meters);
	}

	public static void main(String[] args) {
		double feet;
		Scanner readNumber = new Scanner(System.in);
		System.out.printf("Enter a value for feet : ");
		feet = readNumber.nextDouble();
		feetIntoMeters(feet);

		if (readNumber != null) {
			readNumber.close();
		}

	}

}
