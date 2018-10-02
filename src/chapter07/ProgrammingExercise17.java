/*
 * (Sort students) Write a program that prompts the user to enter the number of students,
 * the students’ names, and their scores, and prints student names in decreasing order of their scores.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfStudents;
		System.out.print("Enter number of students : ");
		numberOfStudents = input.nextInt();
		
		String[] namesOfStudents = new String[numberOfStudents];
		int[] scoresOfStudents = new int[numberOfStudents];
		
		System.out.print("Enter "+ numberOfStudents +" students names and scores (e.g ali 70) : ");
		for (int i = 0; i < numberOfStudents; i++) {
			namesOfStudents[i] = input.next();
			scoresOfStudents[i] = input.nextInt();
		}
		orderByScoresDescending(namesOfStudents,scoresOfStudents);
		printArray(namesOfStudents,scoresOfStudents);
		
		input.close();
	}

	public static void printArray(String[] namesOfStudents, int[] scoresOfStudents) {
		for (int i = 0; i < scoresOfStudents.length; i++) {
			System.out.printf("%s%4d\n",namesOfStudents[i],scoresOfStudents[i]);
		}
	}

	public static void orderByScoresDescending(String[] namesOfStudents, int[] scoresOfStudents) {
		int tempScore;
		String tempName;
		for (int i = 0; i < scoresOfStudents.length; i++) {
			for (int j = i + 1; j < scoresOfStudents.length; j++) {
				if(scoresOfStudents[i] < scoresOfStudents[j]) {
					//swap students
					tempScore = scoresOfStudents[i];
					scoresOfStudents[i] = scoresOfStudents[j];
					scoresOfStudents[j] = tempScore;
					
					tempName = namesOfStudents[i];
					namesOfStudents[i] = namesOfStudents[j];
					namesOfStudents[j] = tempName;
					
				}
			}
		}
	}
}
