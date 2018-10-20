/*
 * (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some 
 * face up and some face down. You can represent the state of the coins using a 
 * 3-by-3 matrix with values 0 (heads) and 1 (tails).
 * 
 * Each state can also be represented using a binary number. For example, the preceding matrices correspond to the numbers
 * There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
 * . . . , and 511 to represent all states of the matrix. Write a program that prompts
 * the user to enter a number between 0 and 511 and displays the corresponding matrix with the characters H and T.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] statesOfCoins = new int[3][3];
		int specifiedNumber;
		specifiedNumber = getNumberFromUser(input);
		statesOfCoins = numbersBinaryEquivalent(specifiedNumber);
		printCorrespondingCoinsStates(statesOfCoins);

		input.close();
	}

	public static void printCorrespondingCoinsStates(int[][] statesOfCoins) {
		for (int i = 0; i < statesOfCoins.length; i++) {
			for (int j = 0; j < statesOfCoins.length; j++) {
				if(statesOfCoins[i][j] == 0) {
					System.out.printf("%2s","H");
				} else {
					System.out.printf("%2s","T");
				}
			}
			System.out.println();
		}
	}

	public static int[][] numbersBinaryEquivalent(int specifiedNumber) {
		int[][] states = new int[3][3];
		int bitValue;
		int remainValue = specifiedNumber;
		
			for (int i = states.length - 1; i >= 0; i--) {
				for (int j = states[i].length - 1; j >= 0 ; j--) {
					bitValue = remainValue % 2;
					states[i][j] = bitValue;
					remainValue = remainValue / 2;
				}
			}
		
		return states;
	}

	public static int getNumberFromUser(Scanner input) {
		int specifiedNumber;
		do {
			System.out.print("Enter a number between 0 and 511 : ");
			specifiedNumber = input.nextInt();
		} while (specifiedNumber < 0 || 511 < specifiedNumber);
		return specifiedNumber;
	}

}
