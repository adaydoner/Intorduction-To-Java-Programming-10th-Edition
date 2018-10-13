/*
 * (Sort characters in a string) Write a method that returns a sorted string using the following header:
 * 		public static String sort(String s)
 * For example, sort("acb") returns abc. Write a test program that prompts the user to enter a string and displays the sorted string.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String specifiedString;
		String sortedString;
		System.out.print("Enter a string you wish to sort its characters : ");
		specifiedString = input.nextLine();
		sortedString = sort(specifiedString);

		System.out.print(sortedString);
		input.close();
	}
	public static String sort(String s) {
		String sortedString = "";
		char[] charArray = s.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(i + 1 == charArray.length) break; // to avoid ArrayIndexOutOfBoundsException at inner loop. 
			for (int j = i + 1; j < charArray.length; j++) {
				if(charArray[j] <= charArray[i]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		int spaceCounter = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ' ') {
				spaceCounter++;
			}
		}
		
		sortedString = String.valueOf(charArray);
		sortedString = sortedString.substring(spaceCounter, sortedString.length()); // to avoid spaces
		return sortedString;
	}
}
