/*
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the 
 * duplicate values in the array using the following method header:
 * 		public static int[] eliminateDuplicates(int[] list)
 * Write a test program that reads in ten integers, invokes the method, and displays 
 * the result. Here is the sample run of the program:
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise15 {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 10;
		Scanner input = new Scanner(System.in);
		int[] specifiedNumbers = new int[ARRAY_SIZE];
		int[] eliminatedDuplicateValues = new int[ARRAY_SIZE];
		System.out.print("Enter " + ARRAY_SIZE + " numbers : ");
		for (int i = 0; i < ARRAY_SIZE; i++) {
			specifiedNumbers[i] = input.nextInt();
		}
		eliminatedDuplicateValues = eliminateDuplicates(specifiedNumbers);
		
		System.out.print("The distinct numbers are : ");
		for (int i = 0; i < eliminatedDuplicateValues.length; i++) {
			if(eliminatedDuplicateValues[i] != 0) { // avoid zeros that comes from default arrays values that cant fill with new values.
				System.out.print(eliminatedDuplicateValues[i] + " ");
			}
		}
		input.close();
	}
	public static int[] eliminateDuplicates(int[] list) {
		boolean duplicateValue;
		int[] eliminated = new int[list.length];
		int newArrayMemberCounter = 0;
		
		for (int i = 0; i < list.length; i++) {
			duplicateValue = false;
			for (int j = 0; j < eliminated.length; j++) {
				if(list[i] == eliminated[j]) {
					duplicateValue = true; // new array has the same value so its a duplicate value;
				}
			}
			if(duplicateValue == false) { // if value is unique for new array , then we can write it.
				eliminated[newArrayMemberCounter] = list[i];
				newArrayMemberCounter++;
			}
		}
		
		return eliminated;
	}
}
