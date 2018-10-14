/*
 * (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the students in increasing order of the number of correct answers.
 */
package chapter08;

public class ProgrammingExercise03 {

	public static void main(String[] args) {
		char[][] answers = {
				 {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				 {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				 {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				 {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				 {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				 {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				 {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				 {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		int[] numberOfCorrectAnswerPerStudents = new int[answers.length];
		for (int i = 0; i < answers.length; i++) {
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j]) {
					correctCount++;
				}
			}
			numberOfCorrectAnswerPerStudents[i] = correctCount;
		}
		sortArrayElementsDecreasingOrder(numberOfCorrectAnswerPerStudents);
		printArray(numberOfCorrectAnswerPerStudents);
	}

	public static void printArray(int[] numberOfCorrectAnswerPerStudents) {
		for (int i = 0; i < numberOfCorrectAnswerPerStudents.length; i++) {
			System.out.printf("%s%d%s%d\n" ,"Student ",i,"\'s correct count is ",numberOfCorrectAnswerPerStudents[i]);
		}
	}

	public static void sortArrayElementsDecreasingOrder(int[] numberOfCorrectAnswerPerStudents) {
		for (int i = 0; i < numberOfCorrectAnswerPerStudents.length; i++) {
			for (int j = i + 1; j < numberOfCorrectAnswerPerStudents.length; j++) {
				if(numberOfCorrectAnswerPerStudents[j] > numberOfCorrectAnswerPerStudents[i]) {
					int temp = numberOfCorrectAnswerPerStudents[i];
					numberOfCorrectAnswerPerStudents[i] = numberOfCorrectAnswerPerStudents[j];
					numberOfCorrectAnswerPerStudents[j] = temp;
				}
			}
		}
	}
}
