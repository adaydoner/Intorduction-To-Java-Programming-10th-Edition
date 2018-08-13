/*
 * (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition question
 * with two integers less than 100.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise10 {

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int number1;
		int number2;
		double usersAnswer;
		number1 = (int) (Math.random() * 100);
		number2 = (int) (Math.random() * 100);
		
		if (number1 < number2) {
			int temp;
			temp = number2;
			number2 = number1;
			number1 = number2;
		}
		
		System.out.println(number1 + "-" + number2 + " = ?");
		usersAnswer = readNumber.nextDouble();
		
		if (usersAnswer == (number1 - number2)) {
			System.out.println("TRUE !");
		} else {
			System.out.println("WRONG !" + " The answer is : " + (number1 - number2));
		}
	}
}