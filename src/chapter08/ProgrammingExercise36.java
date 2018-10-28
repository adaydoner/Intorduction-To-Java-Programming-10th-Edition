/*
 *(Latin square) A Latin square is an n-by-n array filled with n different Latin letters, each occurring exactly once in each row and once in each column.
 * Write a program that prompts the user to enter the number n and the array of characters, as shown in the sample output, and checks if the input array is a Latin square.
 * The characters are the first n characters starting from A.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise36 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] latinSquare;
		latinSquare = getLatinSquareElements();
	}

	public static char[][] getLatinSquareElements() {
		int sizeOfSquareArray;
		System.out.print("Enter number n : ");
		sizeOfSquareArray = input.nextInt();
		char[][] latinSquare = new char[sizeOfSquareArray][sizeOfSquareArray];
		System.out.println("Enter " + sizeOfSquareArray + " rows of letters separated by spaces:");
		for (int i = 0; i < latinSquare.length; i++) {
			for (int j = 0; j < latinSquare[i].length; j++) {
				latinSquare[i][j] = input.next().charAt(0);
			}
			if(!isLatinSquare(latinSquare[i])) {
				System.out.printf("Wrong input: the letters must be from %c to %c",'A',(char)(latinSquare.length + 'A' - 1));
			}
		}
		System.out.println("The input array is a Latin square");
		return latinSquare;
	}
	
	public static boolean isLatinSquare(char[] latinSquare) {
		char furthestChar = (char) ((latinSquare.length) + 'A' - 1); // this would be the char that matrix can have at most.
		
		for (int i = 0; i < latinSquare.length; i++) {
			if ('A' <= latinSquare[i] && latinSquare[i] <= furthestChar || 'a' <= latinSquare[i] && latinSquare[i] <= 'a' + (furthestChar - 'A')) {
				// its okey
			} else {
				return false;
			}
		}
		return true;
	}
}
