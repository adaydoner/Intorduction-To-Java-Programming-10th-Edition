/*
 * (Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards. 
 * Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) 
 * and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 */
package chapter03;

import java.util.Scanner;

public class ProgrammingExercise24 {

	private static String[] PickCard() {
		int number;
		String[] card = new String[2];
		String[] rankOfCard = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] suitOfCard = { "Clubs", "Diamonds", "Hearts", "Spades" };
		number = (int) (Math.random() * 100) % 53;
		if (number == 0) {
			number += 1;
		}
		if (number < 14) {
			card[0] = rankOfCard[number];
			card[1] = suitOfCard[0];
		} 
		else if (number < 27) {
			card[0] = rankOfCard[number % 14];
			card[1] = suitOfCard[1];
		} 
		else if (number < 40) {
			card[0] = rankOfCard[number % 14];
			card[1] = suitOfCard[2];
		} 
		else {
			card[0] = rankOfCard[number % 14];
			card[1] = suitOfCard[3];
		}
		return card;
	}

	public static void main(String[] args) {
		Scanner readNumber = new Scanner(System.in);
		int wantedCard;
		String[] card = new String[2];
		System.out.print("How many card you want ? : ");
		wantedCard = readNumber.nextInt();
		if(wantedCard == 1) {
			card = PickCard();
			System.out.println("Your card is " + card[0] + " of " + card[1]);
		}
		else if (wantedCard == 0 || wantedCard < 0) {
			System.out.println("Invalid...");
		}
		else {
			System.out.println("Your cards are :");
			for (int i = 0; i < wantedCard ; i++) {
				card = PickCard();
				System.out.println("\t" + card[0] + " of " + card[1]);
			}
		}
		readNumber.close();
	}
}
