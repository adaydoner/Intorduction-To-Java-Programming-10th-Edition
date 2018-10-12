/*
 * (Game: pick four cards) Write a program that picks four cards from a deck of 52
 * cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively. 
 * Your program should display the number of picks that yields the sum of 24.
 */
package chapter07;

public class ProgrammingExercise29 {

	public static void main(String[] args) {
		int pickThatYieldsTheSumOf24;
		
		sampleFourCards();
		
		pickThatYieldsTheSumOf24 = pickThatYieldsSumOf24();
		System.out.println("number of possible picks to get sum of 24 : " + pickThatYieldsTheSumOf24);
		
	}

	public static void sampleFourCards() {
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs", };
		int card;
		int sumOfCards = 0;
		for (int i = 0; i < 4; i++) {
			card = (int)(Math.random() * 53);
			sumOfCards += (card % 13) + 1;
			System.out.println(ranks[(card % 13)] + " of " + suit[(card / 13)]);
		}
		System.out.println("Sum of 4 card is : " + sumOfCards);
	}

	public static int pickThatYieldsSumOf24() {
		int pickThatYieldsTheSumOf24 = 0;
		for (int i = 0; i < 53; i++) {
			for (int j = i + 1; j < 53; j++) {
				for (int j2 = j + 1; j2 < 53; j2++) {
					for (int k = j2 + 1; k < 53; k++) {
						if(((i % 13) + 1) + ((j % 13) + 1) + ((j2 % 13) + 1) + ((k % 13) + 1) == 24 ) {
							pickThatYieldsTheSumOf24++;
						}
					}
				}
			}
		}
		return pickThatYieldsTheSumOf24;
	}
}
