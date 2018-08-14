/*
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number. A number is palindrome
 * if it reads the same from right to left and from left to right.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise12 {

	public static void main(String[] args) {
		int usersNumber;
		int workNumber;
		int[] seperateNumber = new int[3];
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter a three-digit integer : ");
		usersNumber = readNumber.nextInt();
		seperateNumber[2] = usersNumber % 10;
		workNumber = usersNumber / 10;
		seperateNumber[1] = workNumber % 10;
		workNumber /= 10;
		seperateNumber[0] = workNumber;
		if(seperateNumber[2] == seperateNumber[0]) {
			System.out.println(usersNumber + " is a palindrome.");
		}
		else {
			System.out.println(usersNumber + " is not a palindrome.");
		}
		readNumber.close();
	}
}
