/*
 * (Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings. Here are some sample runs:
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a sentence : ");
		String sentence1 = input.nextLine();

		System.out.print("Enter another sentence : ");
		String sentence2 = input.nextLine();

		String commonPrefix = "";
		
		int smallerSentencesLength = sentence1.length() < sentence2.length() ? sentence1.length() : sentence2.length();
		
		String forCompareSentence1 = sentence1.toUpperCase();
		String forCompareSentence2 = sentence2.toUpperCase();

		for (int i = 0; i < smallerSentencesLength; i++) {
			if (forCompareSentence1.charAt(i) == forCompareSentence2.charAt(i)) {
				commonPrefix += sentence1.charAt(i);
			} else { // at any index, if common prefixes row would break
				break;
			}
		}
		if (commonPrefix == "") {
			System.out.println(sentence1 + " and " + sentence2 + " have no common prefixes.");
		} else {
			System.out.println("Common prefix is " + commonPrefix);
		}
		input.close();
	}
}
