/*
 * (Game: lottery) Generate a lottery of a three digit
 * number. The program prompts the user to enter a three-digit number and
 * determines whether the user wins according to the following rules:
 * 	1. If the user input matches the lottery number in the exact order, the award is $10,000.
 * 	2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise15 {

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int usersNumber = 0;
		int[] usersNumbersDigits = new int[3];
		int lotteryNumber = (int)(Math.random() * 900) + 100;
		int[] lotteryNumbersDigits = new int[3];
		while (usersNumber < 100 || usersNumber > 999) {
			System.out.print("Enter your number : ");
			usersNumber = readNumber.nextInt();
		}
		for (int i = 2; i >= 0; i--) {
			usersNumbersDigits[i] = usersNumber % 10;
			usersNumber /= 10;
		}
		for (int i = 2; i >= 0; i--) {
			lotteryNumbersDigits[i] = lotteryNumber % 10;
			lotteryNumber /= 10;
		}
		if(lotteryNumbersDigits[0] == usersNumbersDigits[0] &&
		   lotteryNumbersDigits[1] == usersNumbersDigits[1] &&
		   lotteryNumbersDigits[2] == usersNumbersDigits[2]) {
			System.out.println("You won $10");
			System.out.println("Lottery number was " + lotteryNumbersDigits[0] + lotteryNumbersDigits[1] + lotteryNumbersDigits[2]);
		}
		else if(usersNumbersDigits[0] == lotteryNumbersDigits[0] &&
			    usersNumbersDigits[1] == lotteryNumbersDigits[2] &&
			    usersNumbersDigits[2] == lotteryNumbersDigits[1] || 
			    usersNumbersDigits[1] == lotteryNumbersDigits[1] && 
			    usersNumbersDigits[0] == lotteryNumbersDigits[2] && 
			    usersNumbersDigits[2] == lotteryNumbersDigits[0] ||
			    usersNumbersDigits[2] == lotteryNumbersDigits[2] &&
			    usersNumbersDigits[0] == lotteryNumbersDigits[1] &&
			    usersNumbersDigits[1] == lotteryNumbersDigits[0]) {
				System.out.println("You won $3");
				System.out.println("Lottery number was " + lotteryNumbersDigits[0] + lotteryNumbersDigits[1] + lotteryNumbersDigits[2]);
			}
		else if (usersNumbersDigits[0] == lotteryNumbersDigits[0] ||
				 usersNumbersDigits[0] == lotteryNumbersDigits[1] ||
				 usersNumbersDigits[0] == lotteryNumbersDigits[2] ||
				 usersNumbersDigits[1] == lotteryNumbersDigits[0] ||
				 usersNumbersDigits[1] == lotteryNumbersDigits[1] ||
				 usersNumbersDigits[1] == lotteryNumbersDigits[2] ||
				 usersNumbersDigits[2] == lotteryNumbersDigits[0] ||
				 usersNumbersDigits[2] == lotteryNumbersDigits[1] ||
				 usersNumbersDigits[2] == lotteryNumbersDigits[2]) {
			System.out.println("You won $1");
			System.out.println("Lottery number was " + lotteryNumbersDigits[0] + lotteryNumbersDigits[1] + lotteryNumbersDigits[2]);
		}
		else {
			System.out.println("Lottery number was " + lotteryNumbersDigits[0] + lotteryNumbersDigits[1] + lotteryNumbersDigits[2]);
			System.out.println("You couldnt win any price. Try Again !");
		}
		readNumber.close();
	}
}




