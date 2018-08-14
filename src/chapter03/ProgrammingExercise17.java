/*
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
 * game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,or draws.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise17 {

	public static void main(String[] args) {
		int usersChoose;
		int computerChoose;
		String[] options = {"scissor" , "rock" , "paper"};
		Scanner readNumber = new Scanner(System.in);
		while (true) {
			computerChoose = (int) (Math.random() * 10) % 3;
			System.out.print("scissor (0), rock (1), paper (2) : ");
			usersChoose = readNumber.nextInt();
			if(computerChoose == 0 && usersChoose == 0 ||
			   computerChoose == 1 && usersChoose == 1 ||
			   computerChoose == 2 && usersChoose == 2) {
				System.out.println("The computer is " + options[computerChoose] + "." + " You are " + options[usersChoose] + ". " + "DRAW !." + "\n");
			}
			else if(computerChoose == 0 && usersChoose == 2 ||
					   computerChoose == 1 && usersChoose == 0 ||
					   computerChoose == 2 && usersChoose == 1) {
				System.out.println("The computer is " + options[computerChoose] + "." + " You are " + options[usersChoose] + ". " + "COMPUTER WON !." + "\n");
			}
			else {
				System.out.println("The computer is " + options[computerChoose] + "." + " You are " + options[usersChoose] + ". " + "YOU WON !." + "\n");
			}
		}
	}
}
