/*
 * (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
 * subtraction questions. Revise the program to generate ten random addition questions
 * for two integers between 1 and 15. Display the correct count and test time.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise02 {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);
		while (count < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (Math.random() * 15) + 1;
			int number2 = (int) (Math.random() * 15) + 1;

			System.out.print("What is " + number1 + " + " + number2 + "= ? ");
			int answer = input.nextInt();

			if (number1 + number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			}

			else {
				System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
			}
			count++;
			output += "\n" + number1 + " + " + number2 + " = " + answer + ((number1 + number2 == answer) ? " correct" : " wrong");
		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;

		System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
		input.close();
	}
}