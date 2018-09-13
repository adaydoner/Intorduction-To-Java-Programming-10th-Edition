/*
 * (Math: approximate the square root by Babylonian method) There are several techniques for implementing
 * the sqrt method in the Math class. One such technique is known as the
 * Babylonian method. It approximates the square root of a number, n, by repeatedly
 * performing a calculation using the following formula:
 * 
 * 		nextGuess = (lastGuess + n / lastGuess) / 2
 * 
 * When nextGuess and lastGuess are almost identical, nextGuess is the
 * approximated square root. The initial guess can be any positive value (e.g., 1).
 * This value will be the starting value for lastGuess. If the difference between
 * nextGuess and lastGuess is less than a very small number, such as 0.0001,
 * you can claim that nextGuess is the approximated square root of n. If not, next-
 * Guess becomes lastGuess and the approximation process continues. Implement
 * the following method that returns the square root of n.
 * 
 * 		public static double sqrt(long n)
 */

package chapter06;

import java.util.Scanner;

public class ProgrammingExercise22 {

	public static double sqrt(long number) {
		double nextGuess = 0;
		double lastGuess = 1;
		while(0.0001 < Math.sqrt(number) - nextGuess || Math.sqrt(number) - nextGuess < 0) { // if (exact square root - nextGuess) will be between 0 and 0.0001 method will return nextGuess 
			lastGuess = (lastGuess + (number / lastGuess)) / 2 ;
			nextGuess = lastGuess ;
		}
		return nextGuess;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number;
		double sqrtValue ;
		System.out.print("Enter an integer you would like to see its square root : ");
		number = input.nextLong();
		sqrtValue = sqrt(number);
		System.out.println(sqrtValue);
		input.close();
	}
}
