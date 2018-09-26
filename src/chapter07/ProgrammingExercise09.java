/*
 * (Find the smallest element) Write a method that finds the smallest element in an array of double values using the following header:
 * 
 * 		public static double min(double[] array)
 * 
 * Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise09 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_SIZE = 10;
		double[] numbers = new double[10];
		double minimumValue;
		
		System.out.print("Enter "+ ARRAY_SIZE + " numbers : ");
		for (int i = 0; i < ARRAY_SIZE; i++) {
			numbers[i] = input.nextDouble();
		}
		
		minimumValue = min(numbers);
		System.out.printf("%s%3f","Minimum number is ",minimumValue);
		
	}
	public static double min(double[] array) {
		double minNumber = Double.MAX_VALUE; // we want to get smallest number , this first assignment will help us to get first element as a minimum value after comparison
		for (int i = 0; i < array.length; i++) {
			if(array[i] < minNumber) {
				minNumber = array[i];
			}
		}
		return minNumber;
	}
}
