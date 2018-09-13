/*
 * (Occurrences of a specified character) Write a method that finds the number of
 * occurrences of a specified character in a string using the following header:
 * 
 * 		public static int count(String str, char a)
 * 
 * For example, count("Welcome", 'e') returns 2. Write a test program that
 * prompts the user to enter a string followed by a character and displays the number
 * of occurrences of the character in the string.
 */
package chapter06;

import java.util.Scanner;

public class ProgrammingExercise23 {

	public static int count(String specifiedString, char specifiedChar) {
		int counterForOccurrence = 0;
		specifiedString = specifiedString.toUpperCase();	// make string uppercase 
		if('a' <= specifiedChar && specifiedChar <= 'z') {	// if specifiedChar is a lowercase letter we would make it uppercase for ignoring wrong work because of case sensitive   
			specifiedChar = (char)('A' + (specifiedChar - 'a'));
		}
		for (int i = 0; i < specifiedString.length(); i++) {
			if (specifiedChar == specifiedString.charAt(i)) {
				counterForOccurrence++;
			}
		}
		return counterForOccurrence;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String specifiedString;
		char specifiedChar;
		int countOfSpecifiedChar;
		System.out.print("Enter a string : ");
		specifiedString = input.nextLine();

		System.out.print("Enter a letter you want to see its occurrences in string : ");
		specifiedChar = input.nextLine().charAt(0);
		
		
		countOfSpecifiedChar = count(specifiedString, specifiedChar);
		System.out.println(countOfSpecifiedChar);
		input.close();
	}
}
