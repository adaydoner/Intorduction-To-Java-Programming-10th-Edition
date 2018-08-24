/*
 * (Count positive and negative numbers and compute the average of numbers) Write
 * a program that reads an unspecified number of integers, determines how many
 * positive and negative values have been read, and computes the total and average of
 * the input values (not counting zeros). Your program ends with the input 0. Display
 * the average as a floating-point number.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] intArray = new int[1000];
		int i = 0;
		int positiveNumberCounter = 0;
		int negativeNumberCounter = 0;
		double sumOfNumbers = 0;
		System.out.println("Enter an integer, the input ends if it is 0 :");
		do {
			intArray[i] = input.nextInt();
			if (intArray[i] > 0) {
				positiveNumberCounter++;
			} else if (intArray[i] < 0) {
				negativeNumberCounter++;
			}
			sumOfNumbers += intArray[i];
			i++;
		} while (intArray[i - 1] != 0);

		System.out.println("The number of positives is : " + positiveNumberCounter);
		System.out.println("The number of negatives is : " + negativeNumberCounter);
		System.out.println("The total is : " + sumOfNumbers);
		System.out.println("The average is : " + (sumOfNumbers / (i - 1)));
		input.close();
	}
}
