/*
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two digit
 * number. The two digits in the number are distinct. (Hint: Generate the first
 * digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise32 {

	public static void main(String[] args) {
		int lotteryNumberFirstDigit = (int)(Math.random() * 10);
		int lotteryNumberSecondDigit = (int)(Math.random() * 10);
		while (lotteryNumberSecondDigit == lotteryNumberFirstDigit) {
			lotteryNumberSecondDigit = (int) (Math.random() * 10);
		}
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();

		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lotteryNumberSecondDigit + "" + lotteryNumberFirstDigit);

		if (guess == lotteryNumberFirstDigit)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryNumberFirstDigit && guessDigit1 == lotteryNumberSecondDigit)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryNumberFirstDigit || guessDigit1 == lotteryNumberSecondDigit || guessDigit2 == lotteryNumberFirstDigit || guessDigit2 == lotteryNumberSecondDigit)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");

		input.close();
	}
}
