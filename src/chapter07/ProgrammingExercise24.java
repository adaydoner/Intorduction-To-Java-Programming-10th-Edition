/*
 * (Simulation: coupon collector’s problem) Coupon collector is a classic statistics problem with many practical applications. 
 * The problem is to pick objects from a set of objects repeatedly and find out how many picks are needed for all the objects to be picked at least once. 
 * A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly and find out how many picks are needed before you see one of each suit. 
 * Assume a picked card is placed back in the deck before picking another. 
 * Write a program to simulate the number of picks needed to get four cards from each suit and display the four cards picked (it is possible a card may be picked twice).
 */
package chapter07;

public class ProgrammingExercise24 {

	public static void main(String[] args) {
		int[] deck = new int[52];
		makeAndShuffleDeck(deck);
		pick4DifferentSuit(deck);
	}

	public static void pick4DifferentSuit(int[] deck) {
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs", };
		boolean[] suitsState = {false,false,false,false};
		String[] pickedCards = new String[4];
		int validPick = 0;
		int pickCounter = 0;
		while(validPick != 4) {
			int card = deck[(int)(Math.random() * 52)];
			pickCounter++;
			if(suitsState[(card / 13)] == false) {
				validPick++;
				suitsState[(card / 13)] = true;
				pickedCards[(card / 13)] = ranks[(card % 13)] + " of " + suit[(card / 13)];
			}
		}
		for (int i = 0; i < pickedCards.length; i++) {
			System.out.println(pickedCards[i]);
		}
		System.out.println("Number of picks : " + pickCounter);
	}

	public static void makeAndShuffleDeck(int[] deck) {
		int temp;
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		for (int i = 0; i < deck.length; i++) {
			int index = (int)(Math.random() * 52);
			temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
	}
}
