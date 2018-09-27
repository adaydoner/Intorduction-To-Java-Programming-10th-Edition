/*
 * (Reverse an array) The reverse method in Section 7.7 reverses an array by 
 * copying it to a new array. Rewrite the method that reverses the array passed in 
 * the argument and returns this array.
 * Write a test program that prompts the user to enter ten numbers, invokes the method to reverse the numbers, and displays the numbers.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_SIZE = 10;
		double[] array = new double[ARRAY_SIZE];
		
		System.out.println("Enter " + ARRAY_SIZE + " numbers.");
		for (int i = 0; i < ARRAY_SIZE; i++) {
			array[i] = input.nextDouble();
		}
		
		reverseArray(array);
		printMethod(array);
		
		
		input.close();
	}

	public static void printMethod(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("array[%d] = %2.2f\n",i,array[i]);
		}
	}

	public static void reverseArray(double[] array) {
		double temp;
		for (int i = 0,j = array.length - 1; i < array.length / 2; i++,j--) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
