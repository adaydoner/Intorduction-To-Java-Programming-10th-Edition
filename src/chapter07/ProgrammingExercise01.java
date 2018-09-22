/*
 * (Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades based on the following scheme:
 * 	Grade is A if score is Ú best - 10
 * Grade is B if score is Ú best - 20;
 * Grade is C if score is Ú best - 30;
 * Grade is D if score is Ú best - 40;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then prompts
 * the user to enter all of the scores, and concludes by displaying the grades.
 */

package chapter07;

import java.util.Scanner;

public class ProgrammingExercise01 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numberOfStudents;
		numberOfStudents = getNumberOfStudents();
		int[] scoresOfStudents = new int[numberOfStudents];
		char[] gradesOfStudents = new char[numberOfStudents];
		scoresOfStudents = getScores(numberOfStudents);
		gradesOfStudents = getGrades(scoresOfStudents);
		printStudentsWithGrades(scoresOfStudents,gradesOfStudents);

	}

	public static void printStudentsWithGrades(int[] scoresOfStudents, char[] gradesOfStudents) {
		for (int i = 0; i < scoresOfStudents.length; i++) {
			System.out.println("Student " + (i + 1) + " score is " + scoresOfStudents[i] + " and grade is " + gradesOfStudents[i]);
		}
	}

	public static char[] getGrades(int[] scoresOfStudents) {
		int bestScore;
		bestScore = getBestScore(scoresOfStudents);
		char[] grades = new char[scoresOfStudents.length];
		for (int i = 0; i < scoresOfStudents.length; i++) {
			if(scoresOfStudents[i]  >= bestScore - 10) {
				grades[i] = 'A';
			} else if (scoresOfStudents[i]  >= bestScore - 20) {
				grades[i] = 'B';
			} else if (scoresOfStudents[i]  >= bestScore - 30) {
				grades[i] = 'C';
			} else if (scoresOfStudents[i]  >= bestScore - 40) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}
		}
		return grades;
	}

	public static int getBestScore(int[] scoresOfStudents) {
		int bestScore = -1;
		for (int i = 0; i < scoresOfStudents.length; i++) {
			if (scoresOfStudents[i] > bestScore) {
				bestScore = scoresOfStudents[i];
			}
		}
		return bestScore;
	}

	public static int[] getScores(int numberOfStudents) {
		int[] scores = new int[numberOfStudents];
		System.out.print("Enter " + numberOfStudents + " scores :");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		return scores;
	}

	public static int getNumberOfStudents() {
		int numberOfStudents;
		System.out.print("Enter the number of students :");
		numberOfStudents = input.nextInt();
		return numberOfStudents;
	}
}
