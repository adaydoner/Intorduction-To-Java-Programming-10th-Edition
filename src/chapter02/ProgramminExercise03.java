/*
 * Chapter 2 Exercise 3:
 *
 *      (Convert feet into meters) Write a program that reads a number in feet,
 *      converts it to meters, and displays the result. One foot is 0.305 meter.
 *
 */
package chapter02;

import java.util.Scanner;

public class ProgramminExercise03 {

	public static double FeetIntoMeters (double givenFeet) {
		double meters;
		meters = givenFeet * 0.305;
		return meters;
	}
	public static void main(String[] args) {
		double feet;
		double meters;
		Scanner readNumber = new Scanner(System.in);

		System.out.printf("Enter a value for feet : ");
		feet = readNumber.nextDouble();
		meters = FeetIntoMeters(feet);
		System.out.printf("%.2f feet is %.4f meters.",feet,meters);
		
		if(readNumber!=null) {readNumber.close();}
		
	}

}
