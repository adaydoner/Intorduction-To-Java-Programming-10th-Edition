/*
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program to play a variation of the game, as follows:
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose; 
 * if the sum is 7 or 11 (called natural), you win; 
 * if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. 
 * Continue to roll the dice until either a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
 * Your program acts as a single player. Here are some sample runs.
 * 		You rolled 5 + 6 = 11 You win
 * 		You rolled 1 + 2 = 3 You lose
 * 		You rolled 4 + 4 = 8 point is 8 __ You rolled 6 + 2 = 8 You win
 * 		You rolled 3 + 2 = 5 point is 5 __ You rolled 2 + 5 = 7 You lose
 */

package chapter06;

public class ProgrammingExercise30 {

	public static int rollDice() {
		int diceValue;
		diceValue = (int) (Math.random() * 6) + 1; // random method give between 0-0.99 so we have to multiple by 6 and then add 1 to ignore 0 value
		return diceValue;
	}

	public static int resultOfCraps(int dice1, int dice2) {
		int sumOfDices = dice1 + dice2;
		if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12) {
			return -1;
		} else if(sumOfDices == 7 || sumOfDices == 11) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int dice1;
		int dice2;
		dice1 = rollDice(); // we get our first dice value
		dice2 = rollDice(); // we get our second dice value
		int establishedPoint;
		establishedPoint = dice1 + dice2;
		if (resultOfCraps(dice1, dice2) == 1) {
			System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You win");
		} else if (resultOfCraps(dice1, dice2) == -1) {
			System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You lose");
		} else {
			System.out.printf("You rolled %d + %d = %2d %s %d\n", dice1, dice2, dice1 + dice2, "point is", dice1 + dice2); // game on.
			while(true) {
				establishedPoint = dice1 + dice2; // we get point on a new variable to compare with new.
				// roll dices.
				dice1 = rollDice();
				dice2 = rollDice();
				if(dice1 + dice2 == 7) {
					System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You lose");
					System.exit(0); // if new rolled rices would be 7 then we lose.
				} else if (dice1 + dice2 == establishedPoint) {
					System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You win");
					System.exit(0); // if new rolled rices summarize equal to last dices summarize then we win.
				} else {
					System.out.printf("You rolled %d + %d = %2d %s %d\n", dice1, dice2, dice1 + dice2, "point is", dice1 + dice2); // game on.
				}
			}
		}
	}
}
