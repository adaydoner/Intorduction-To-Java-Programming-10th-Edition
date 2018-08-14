/*
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 * 	(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * 
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise09 {


	private static int CheckSum(int[] isbn) {
		int d10 = 0;
		for (int i = 0; i <= 8; i++) {
			d10 += (isbn[i] * (i+1));
		}
		return d10 % 11;
	}

	public static void main(String[] args) {
		int enteredNumber;
		int[] isbn = new int[10];
		Scanner readNumber = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN as integer : ");
		enteredNumber = readNumber.nextInt();
		
		for (int i = 8; i >= 0; i--) {
			isbn[i] = enteredNumber % 10;
			enteredNumber = enteredNumber / 10;
		}
		isbn[9] = CheckSum(isbn);
		
		System.out.print("The ISBN-10 number is ");
		for (int i = 0; i <=8; i++) {
			System.out.print(isbn[i]);
		}
		if(isbn[9] == 10) {
			System.out.print("X");
		}
		else {
			System.out.print(isbn[9]);
		}
		readNumber.close();
	}
}
