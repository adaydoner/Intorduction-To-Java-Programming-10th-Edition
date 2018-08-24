/*
 * (Find the two highest scores) Write a program that prompts the user to enter the
 * number of students and each student’s name and score, and finally displays the
 * student with the highest score and the student with the second-highest score.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfStudents;
		String highestScoreOwner = "";
		double highestScore = 0;
		String secondHighestScoreOwner = "";
		double secondHighestScore = 0;

		System.out.print("Enter the number of students : ");
		numberOfStudents = input.nextInt();

		String[] nameOfStudent = new String[numberOfStudents];
		double[] scoreOfStudent = new double[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print((i + 1) + ". Student's name and score : ");
			nameOfStudent[i] = input.next();
			scoreOfStudent[i] = input.nextDouble();
			if (scoreOfStudent[i] > highestScore) {
				secondHighestScoreOwner = highestScoreOwner;
				secondHighestScore = highestScore;
				highestScoreOwner = nameOfStudent[i];
				highestScore = scoreOfStudent[i];
			} else if (secondHighestScore < scoreOfStudent[i] && scoreOfStudent[i] < highestScore) {
				secondHighestScoreOwner = nameOfStudent[i];
				secondHighestScore = scoreOfStudent[i];
			} else if (scoreOfStudent[i] == highestScore) {
				highestScoreOwner += " and " + nameOfStudent[i];
			} else if (scoreOfStudent[i] == secondHighestScore) {
				secondHighestScoreOwner = secondHighestScoreOwner + " and " + nameOfStudent[i];
			}
		}
		System.out.println(highestScoreOwner + " has the highest score with " + highestScore + " points.");
		System.out.println(secondHighestScoreOwner + " has the highest second score with " + secondHighestScore + " points.");
		input.close();
	}
}
