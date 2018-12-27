package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * (InputMismatchException) Write a program that prompts the user to read two integers and displays their sum. 
 * Your program should prompt the user to read the number again if the input is incorrect.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise02 {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				int num1;
				int num2;
				
				System.out.print("Please write two integers (eg. 3 5) : ");
				num1 = input.nextInt();
				num2 = input.nextInt();
				
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				
				input.close();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("input is incorrect...");
			} 
		}
	}
}
