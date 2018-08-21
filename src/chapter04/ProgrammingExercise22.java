/*
 * (Check substring) Write a program that prompts the user to enter two strings and
 * reports whether the second string is a substring of the first string.
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstString;
		String secondString;
		System.out.print("Enter string s1 : ");
		firstString = input.nextLine();
		System.out.print("Enter string s2 : ");
		secondString = input.nextLine();
		if (firstString.contains(secondString)) {
			System.out.printf("\"%s\" is a substring of \"%s\"", secondString, firstString);
		} else {
			System.out.printf("\"%s\" isn't a substring of \"%s\"", secondString, firstString);
		}
		input.close();
	}
}
