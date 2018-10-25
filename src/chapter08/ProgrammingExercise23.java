/*
 * (Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with 0s and 1s. 
 * All rows and all columns have an even number of 1s. Let the user flip one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which cell was flipped. 
 * Your program should prompt the user to enter a 6-by-6 array with 0s and 1s and find the first row r and first column c where the even number 
 * of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell is at (r, c).
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise23 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array = new int[6][6];
		getNumbersFromUser(array);
		findFlippedCoin(array);
		
	}

	public static void getNumbersFromUser(int[][] array) {
		System.out.println("Enter a 6-by-6 matrix row by row : ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = input.nextInt();
			}
		}
	}

	private static void findFlippedCoin(int[][] array) {
		int flippedCoinsRowIndex = 0;
		int flippedCoinsColumnIndex = 0;
		for (int row = 0; row < array.length; row++) {
			int counter = 0;
			for (int column = 0; column < array[0].length; column++) {
				if(array[row][column] == 1) {
					counter++;
				}
			}
			if(counter == 5) {
				flippedCoinsRowIndex = row;
			}
		}
		
		for (int column = 0; column < array.length; column++) {
			int counter = 0;
			for (int row = 0; row < array[0].length; row++) {
				if(array[row][column] == 1) {
					counter++;
				}
			}
			if(counter == 5) {
				flippedCoinsColumnIndex = column;
			}
		}
		System.out.printf("The flipped cell is at ( %d , %d )",flippedCoinsRowIndex,flippedCoinsColumnIndex);
		
	}

}
