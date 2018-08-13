/*
 * generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise02 {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;
		int sumOfNumbers;
		Scanner readNumber = new Scanner(System.in);
		number1 = (int)(Math.random() * 10);
		number2 = (int)(Math.random() * 10);
		number3 = (int)(Math.random() * 10);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " = ");
		sumOfNumbers = readNumber.nextInt();
		
		if(sumOfNumbers == number1 + number2 + number3) {
			System.out.println("TRUE !");
		}
		else {
			System.out.print("WRONG ! ");
			System.out.println("Answer is : " + (number1 + number2 + number3));
		}

	}

}
