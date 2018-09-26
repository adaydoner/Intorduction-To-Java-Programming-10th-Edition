/*
 * (Find the index of the smallest element) Write a method that returns the index of
 * the smallest element in an array of integers. If the number of such elements is
 * greater than 1, return the smallest index. Use the following header:
 * 
 * 			public static int indexOfSmallestElement(double[] array)
 * 
 * Write a test program that prompts the user to enter ten numbers, invokes this 
 * method to return the index of the smallest element, and displays the index.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_SIZE = 10;
		double[] numbers = new double[10];
		int minimumValuesIndex;
		
		System.out.print("Enter "+ ARRAY_SIZE + " numbers : ");
		for (int i = 0; i < ARRAY_SIZE; i++) {
			numbers[i] = input.nextDouble();
		}
		minimumValuesIndex = indexOfSmallestElement(numbers);
		System.out.printf("%s%3d","Minimum numbers index is ",minimumValuesIndex);
	}
	public static int indexOfSmallestElement(double[] array) {
		int minValuesIndex = -1;
		double minValue = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i] < minValue) {
				minValue = array[i];
				minValuesIndex = i;
			}
		}
		return minValuesIndex;
	}
}
