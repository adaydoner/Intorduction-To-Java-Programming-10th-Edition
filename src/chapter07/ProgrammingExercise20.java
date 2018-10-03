/*
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 * The selection-sort method repeatedly finds the smallest number in the current
 * array and swaps it with the first. Rewrite this program by finding the largest number
 * and swapping it with the last. 
 * Write a test program that reads in ten double
 * numbers, invokes the method, and displays the sorted numbers.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise20 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 10;
		Scanner input = new Scanner(System.in);
		double[] specifiedNumbers = new double[ARRAY_SIZE];
		System.out.print("Enter ten number : ");
		for (int i = 0; i < ARRAY_SIZE; i++) {
			specifiedNumbers[i] = input.nextDouble();
		}
		
		sortArrayByLargestNumber(specifiedNumbers);
		
		for (int i = 0; i < specifiedNumbers.length; i++) {
			System.out.printf("%2.2f\n",specifiedNumbers[i]);
		}
		
		input.close();
	}

	public static void sortArrayByLargestNumber(double[] specifiedNumbers) {
		double max = 0;
		double temp;
		for (int i = specifiedNumbers.length - 1; i >= 0 ; i--) {
			max = 0;
			for (int j = i ; j >= 0; j--) {
				if(specifiedNumbers[j] > max) {
					max = specifiedNumbers[j];

					temp = specifiedNumbers[i];
					specifiedNumbers[i] = specifiedNumbers[j];
					specifiedNumbers[j] = temp;
				}
			}
		}
	}
}
