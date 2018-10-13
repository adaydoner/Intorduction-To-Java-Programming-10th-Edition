/*
 * (Culture:Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store the animal names.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] zodiacSigns = { "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep" };
		System.out.print("Enter a year : ");
		int year = input.nextInt();
		System.out.printf("%s", zodiacSigns[year % 12]);
		input.close();
	}

}
