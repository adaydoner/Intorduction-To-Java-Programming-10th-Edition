/*
 * (Random number chooser) Write a method that returns a random number between 
 * 1 and 54, excluding the numbers passed in the argument. The method header is specified as follows:
 * 
 * 			public static int getRandom(int... numbers)
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int EXCLUDED_NUMBERS_ARRAYS_SIZE = 10; // if you set this to 53 and write all numbers between 1 to 53 you'll see generated number is 54.
		int[] excludedNumbers = new int[EXCLUDED_NUMBERS_ARRAYS_SIZE];
		int randomNumber;
		
		System.out.print("Enter " + EXCLUDED_NUMBERS_ARRAYS_SIZE + " integer numbers that you want to exclude from generating random number : ");
		for (int i = 0; i < EXCLUDED_NUMBERS_ARRAYS_SIZE; i++) {
			excludedNumbers[i] = input.nextInt();
		}
		
		randomNumber = getRandom(excludedNumbers);
		
		System.out.println("Generated number is : " + randomNumber);
		
	}
	public static int getRandom(int... numbers) {
		int number;
		while(true) {
			int counter = 0; // to find how many number for loop would check on array.
			number = (int)(Math.random() * 54) + 1; // for avoid generating zero.
			for (int i = 0; i < numbers.length; i++) {
				if(number != numbers[i]) {
					counter++;
				}
			}
			if(counter == numbers.length) { // mean that any of numbers on array doesnt match with generated number. 
				break;
			}
		}
		return number;
	}

}
