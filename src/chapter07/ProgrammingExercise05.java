/*
 * (Print distinct numbers) Write a program that reads in ten numbers and displays
 * the number of distinct numbers and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once). 
 * (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise05 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int ARRAY_SIZE = 10;
		int[] numbers = new int[ARRAY_SIZE];
		int numberOfDistinctNumbers;
		getNumbers(numbers);
		int[] arrayWithOnlyDistinctNumbers = new int[ARRAY_SIZE];
		numberOfDistinctNumbers = distinctNumbersArray(arrayWithOnlyDistinctNumbers,numbers);
		printArrayThatHasOnlyDistinctNumbers(arrayWithOnlyDistinctNumbers,numberOfDistinctNumbers);
		
	}

	public static void printArrayThatHasOnlyDistinctNumbers(int[] arrayWithOnlyDistinctNumbers, int numberOfDistinctNumbers) {
		System.out.println("The number of distinct number is :" + numberOfDistinctNumbers);
		for (int i = 0; i < arrayWithOnlyDistinctNumbers.length; i++) {
			if(arrayWithOnlyDistinctNumbers[i] != 0) {
				System.out.print(arrayWithOnlyDistinctNumbers[i]+ " ");
			}
		}
	}

	public static int distinctNumbersArray(int[] arrayWithOnlyDistinctNumbers, int[] numbers) {
		int uniqueNumberWriter = 0;
		boolean flag;
		for (int i = 0; i < numbers.length; i++) {
			flag = false;
			for (int j = 0; j < arrayWithOnlyDistinctNumbers.length; j++) {
				if (numbers[i] == arrayWithOnlyDistinctNumbers[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				arrayWithOnlyDistinctNumbers[uniqueNumberWriter] = numbers[i];
				uniqueNumberWriter++;
			}
		}		
		return uniqueNumberWriter;
	}

	public static void getNumbers(int[] numbers) {
		System.out.print("Enter ten numbers : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
	}

}
