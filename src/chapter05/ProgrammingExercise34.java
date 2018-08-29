/*
 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
 * plays the scissor-rock-paper game. Revise the program to let the user continuously
 * play until either the user or the computer wins more than two times than its opponent.
 */
package chapter05;

import java.util.Scanner;

public class ProgrammingExercise34 {

	public static void main(String[] args) {
		System.out.println("\t\t\t- ROCK - PAPER - SCISSORS -");
		int usersChoose;
		int computerChoose;
		int computerWins = 0;
		int userWins = 0;
		String[] options = { "scissor", "rock", "paper" };
		Scanner input = new Scanner(System.in);
		while (userWins != 3 && computerWins != 3 || (userWins == 0 && computerWins == 0)) {
			computerChoose = (int) (Math.random() * 10) % 3;
				System.out.print("scissor (0), rock (1), paper (2) : ");
				usersChoose = input.nextInt();
			if (computerChoose == 0 && usersChoose == 0 || computerChoose == 1 && usersChoose == 1 || computerChoose == 2 && usersChoose == 2) {
				System.out.println("The computer is " + options[computerChoose] + "." + " You are " + options[usersChoose] + ". " + "DRAW !." + "\n");
			} else if (computerChoose == 0 && usersChoose == 2 || computerChoose == 1 && usersChoose == 0 || computerChoose == 2 && usersChoose == 1) {
				computerWins++;
				System.out.println("The computer is " + options[computerChoose] + "." + " You are " + options[usersChoose] + ". " + "COMPUTER WON !." + "\n");
			} else {
				userWins++;
				System.out.println("The computer is " + options[computerChoose] + "." + " You are " + options[usersChoose] + ". " + "YOU WON !." + "\n");
			}
		}
		System.out.println("\t\t     GAME OVER");
		if (computerWins > userWins) {
			System.out.println("\t\tYou lost the game :(\n" + "\tComputer Wins : " + computerWins + "   User Wins : " + userWins);
		} else {
			System.out.println("\t\tYou win the game :)\n" + "\tComputer Wins : " + computerWins + "   User Wins : " + userWins);
		}
		input.close();
	}
}
