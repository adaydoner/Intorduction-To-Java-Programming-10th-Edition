/*
 * (Use the Random class) Write a program that creates a Random object with seed 1000 and displays 
 * the first 50 random integers between 0 and 100 using the nextInt(100) method.
 */
package chapter09;

import java.util.Random;

public class ProgrammingExercise04 {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 50;
		int[] randomNumbersArray = new int[ARRAY_SIZE];
		
		Random randomNumberGenerator = new Random(1000);
		
		for (int i = 0; i < ARRAY_SIZE; i++) {
			randomNumbersArray[i] = randomNumberGenerator.nextInt(100);
		}
		
		printArray(randomNumbersArray);
	}

	public static void printArray(int[] randomNumbers) {
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.printf("%3d",randomNumbers[i]);
			if((i + 1) % 10 == 0){
				System.out.println();
			}
		}
	}

}
