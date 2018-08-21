/*
 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of three
 * uppercase(65-90) letters followed by four digits. Write a program to generate a plate number.
 */
package chapter04;

public class ProgrammingExercise25 {

	public static void main(String[] args) {
		char[] platesLetters = new char[3];
		int[] platesNumbers = new int[4];
		for (int i = 0; i < platesNumbers.length; i++) {
			platesNumbers[i] = (int)(Math.random() * 10);
		}
		for (int i = 0; i < platesLetters.length; i++) {
			platesLetters[i] = (char)((int)(Math.random() * 26) + 65);
		}
		for (int i = 0; i < platesLetters.length; i++) {
			System.out.print(platesLetters[i]);
		}
		System.out.print(" ");
		for (int i = 0; i < platesNumbers.length; i++) {
			System.out.print(platesNumbers[i]);
		}
	}
}
