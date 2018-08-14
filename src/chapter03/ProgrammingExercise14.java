/*
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess and
 * reports whether the guess is correct or incorrect.
 */
package chapter03;

import java.util.Objects;
import java.util.Scanner;

public class ProgrammingExercise14 {

	public static void main(String[] args) {
		Scanner readAnswer = new Scanner(System.in);
		String answer;
		while (true) {
			int binaryNumber = (int) (Math.random() * 10) % 2;
			System.out.print("Head (h) or tail (t) ? ");
			answer = readAnswer.nextLine();
			if (Objects.equals(answer, "h") && binaryNumber == 0 || Objects.equals(answer, "t") && binaryNumber == 1) {
				System.out.println("Correct !");
			} else {
				System.out.println("Nope !");
			}
			System.out.println("\n");
		}

	}

}
