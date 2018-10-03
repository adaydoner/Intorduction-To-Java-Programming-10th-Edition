/*
 * (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
 * algorithm makes several passes through the array. On each pass, successive
 * neighboring pairs are compared. If a pair is not in order, its values are swapped;
 * otherwise, the values remain unchanged. The technique is called a bubble sort or
 * sinking sort because the smaller values gradually “bubble” their way to the top
 * and the larger values “sink” to the bottom. Write a test program that reads in ten
 * double numbers, invokes the method, and displays the sorted numbers.
 */

package chapter07;

import java.util.Scanner;

public class ProgrammingExercise18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_SIZE = 10;
		double[] specifiedNumbers = new double[ARRAY_SIZE];
		System.out.println("Enter " + ARRAY_SIZE + " numbers : ");
		for (int i = 0; i < ARRAY_SIZE; i++) {
			specifiedNumbers[i] = input.nextDouble();
		}
		bubbleSort(specifiedNumbers);
		
		for (int i = 0; i < specifiedNumbers.length; i++) {
			System.out.printf("%2.2f\n",specifiedNumbers[i]);
		}

		input.close();
	}

	public static void bubbleSort(double[] specifiedNumbers) {
		double temp;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < specifiedNumbers.length - 1; i++) {
				if (specifiedNumbers[i] > specifiedNumbers[i + 1]) {
					temp = specifiedNumbers[i];
					specifiedNumbers[i] = specifiedNumbers[i + 1];
					specifiedNumbers[i + 1] = temp;
				}
			}
			for (int i = 1; i < specifiedNumbers.length; i++) {
				if(specifiedNumbers[0] > specifiedNumbers[i]) {
					flag = true;
					break;
				}
			}
		}
	}
}
