/*
 * (Analyze scores) Write a program that reads an unspecified number of scores and
 * determines how many scores are above or equal to the average and how many
 * scores are below the average. Enter a negative number to signify the end of the input. 
 * Assume that the maximum number of scores is 100.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise04 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int[] defaultArray = new int[50];
		int lastItemIndex;
		double averageOfNumbersSpecified;
		lastItemIndex = getNumbers(defaultArray);
		int[] integerSpecified = new int[lastItemIndex]; // we dont want to get (-) values that point the end of input.
		System.arraycopy(defaultArray, 0, integerSpecified, 0, lastItemIndex); // copied the numbers into new array.
		averageOfNumbersSpecified = getAverage(integerSpecified);
		printArrayAccordingToExercise(integerSpecified,averageOfNumbersSpecified);
	}

	public static double getAverage(int[] integerSpecified) {
		int sum = 0;
		double average;
		for (int i = 0; i < integerSpecified.length; i++) {
			sum += integerSpecified[i];
		}
		average = sum / integerSpecified.length;
		return average;
	}

	public static void printArrayAccordingToExercise(int[] integersSpecified, double average) {
		int counterForNumbersAboveOrEqualTheAverage = 0;
		int counterForNumbersBelowTheAverage = 0;
		for (int i = 0; i < integersSpecified.length; i++) {
			if(integersSpecified[i] >= average) {
				counterForNumbersAboveOrEqualTheAverage++;
			}else {
				counterForNumbersBelowTheAverage++;
			}
		}
		System.out.println("Average is : " + average);
		System.out.printf("%3d number is above or equal to the average.\n", counterForNumbersAboveOrEqualTheAverage );
		System.out.printf("%3d number is below the average.\n", counterForNumbersBelowTheAverage );
	}

	public static int getNumbers(int[] integersArray) {
		for (int i = 0; i < integersArray.length; i++) {
			integersArray[i] = input.nextInt();
			if (integersArray[i] < 0) {
				return i;
			}
		}
		return 0;
	}
}
