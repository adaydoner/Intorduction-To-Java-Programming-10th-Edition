/*
 * (Reverse the numbers entered) Write a program that reads ten integers and displays them in the reverse of the order in which they were read.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise02 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int NUMBER_OF_INTEGERS = 10;
		int[] integersArray = new int[NUMBER_OF_INTEGERS];
		integersArray = getNumbers(NUMBER_OF_INTEGERS,integersArray);
		reverseOfNumbersInArray(integersArray);
		printArray(integersArray);
	}

	public static void printArray(int[] integersArray) {
		for (int i = 0; i < integersArray.length; i++) {
			System.out.printf("%4d",integersArray[i]);
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
	}

	public static void reverseOfNumbersInArray(int[] integersArray) {
	int temp;
		for (int i = 0; i < integersArray.length / 2; i++) {
			temp = integersArray[i];
			integersArray[i] = integersArray[integersArray.length - (i + 1)];
			integersArray[integersArray.length - (i + 1)] = temp;
		}
	}

	public static int[] getNumbers(int numberOfIntegers, int[] array) {
		System.out.print("Enter " + numberOfIntegers + " integer : ");
		
		for (int i = 0; i < numberOfIntegers; i++) {
			array[i] = input.nextInt();
		}
		return array;
	}
}
