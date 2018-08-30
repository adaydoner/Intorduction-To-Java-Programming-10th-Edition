/*
 * (Computer architecture: bit-level operations) A short value is stored in 16 bits.
 * Write a program that prompts the user to enter a short integer and displays the 16 bits for the integer
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise44 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		System.out.print("The 16 bits are : ");

		for (int i = 15; i >= 0; i--) {

			System.out.print((number >> i) & 1);
		}
		input.close();
	}
}
