/*
 * (Math: combinations) Write a program that prompts the user to enter 10 integers and displays all combinations of picking two numbers from the 10.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] specifiedNumbers = new int[10];
		System.out.print("Enter " + specifiedNumbers.length  + " integers : ");
		
		for (int i = 0; i < specifiedNumbers.length; i++) {
			specifiedNumbers[i] = input.nextInt();
		}
		
		combinationsOfPickingTwoNumbers(specifiedNumbers);
		
		input.close();
	}

	public static void combinationsOfPickingTwoNumbers(int[] specifiedNumbers) {
		int counter = 1;
		for (int i = 0; i < specifiedNumbers.length; i++) {
			for (int j = i + 1; j < specifiedNumbers.length; j++) {
				System.out.printf("%d -> (%d, %d)\n",counter,specifiedNumbers[i],specifiedNumbers[j]);
				counter++;
			}
		}
	}
}
