/*
 * (Pattern recognition: consecutive four equal numbers) Write the following 
 * method that tests whether the array has four consecutive numbers with the same value.
 * 		
 * 		public static boolean isConsecutiveFour(int[] values)
 * 
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. 
 * Your program should first prompt the user to enter the input size—i.e., the number of values in the series.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfValues;
		System.out.print("Enter the number of values : ");
		numberOfValues = input.nextInt();
		int[] specifiedNumbers = new int[numberOfValues];

		System.out.print("Enter the values : ");
		for (int i = 0; i < numberOfValues; i++) {
			specifiedNumbers[i] = input.nextInt();
		}

		if (isConsecutiveFour(specifiedNumbers)) {
			System.out.println("The list has consecutive fours");
		} else {
			System.out.println("The list has no consecutive fours");
		}

		input.close();
	}

	public static boolean isConsecutiveFour(int[] values) {
		int consecutiveSameNumbersCounter = 0;
		int lastCheckedNumber = values[0];
		for (int i = 0; i < values.length; i++) {
			if(lastCheckedNumber == values[i]) {
				consecutiveSameNumbersCounter++;
			} else {
				consecutiveSameNumbersCounter = 1;
				lastCheckedNumber = values[i];
			}
			if (consecutiveSameNumbersCounter == 4) {
				return true;
			}
		}
		return false;
	}
}
