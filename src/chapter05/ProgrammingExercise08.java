/*
 * (Find the highest score) Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name
 * of the student with the highest score.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfStudents;
		String highestScoresOwner = "";
		double highestScore = 0;
		System.out.print("Enter the number of students : ");
		numberOfStudents = input.nextInt(); // We get how many students we'r going to consider.

		String[] nameOfStudent = new String[numberOfStudents]; // Creates arrays with size of number of students to hold name and score values.
		double[] scoreOfStudent = new double[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print((i + 1) + ". Student's name and score : ");
			nameOfStudent[i] = input.next();
			scoreOfStudent[i] = input.nextDouble();
			if (scoreOfStudent[i] > highestScore) {		// if specified score would be higher than before then it would be our newest highest score.
				highestScoresOwner = nameOfStudent[i]; // and we would change variables for newest highest score.
				highestScore = scoreOfStudent[i];
			} else if (scoreOfStudent[i] == highestScore) {	// if someone else has the same highest score we will show him/her name on output as well.
				highestScoresOwner = highestScoresOwner + " and " +nameOfStudent[i]; 
			} 
		}
		System.out.println(highestScoresOwner + " has the highest score with " + highestScore + " points.");
		input.close();
	}
}
