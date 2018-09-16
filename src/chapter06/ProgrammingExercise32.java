/*
 * (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times and display the number of winning games.
 */
package chapter06;

public class ProgrammingExercise32 {

	public static int rollDice() {
		int diceValue;
		diceValue = (int) (Math.random() * 6) + 1; // random method give between 0-0.99 so we have to multiple by 6 and then add 1 to ignore 0 value
		return diceValue;
	}

	public static int resultOfCraps(int dice1, int dice2) {
		int sumOfDices = dice1 + dice2;
		if (sumOfDices == 2 || sumOfDices == 3 || sumOfDices == 12) {
			return -1;
		} else if (sumOfDices == 7 || sumOfDices == 11) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int numberOfWinnings = 0;
		int gameNumber = 1;

		while (gameNumber < 100_000) {
			boolean establishedPointStatement = true;
			int dice1;
			int dice2;
			dice1 = rollDice(); // we get our first dice value
			dice2 = rollDice(); // we get our second dice value
			int establishedPoint;
			establishedPoint = dice1 + dice2;
			if (resultOfCraps(dice1, dice2) == 1) {
				System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You win");
				numberOfWinnings++;
			} else if (resultOfCraps(dice1, dice2) == -1) {
				System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You lose");
			} else {
				System.out.printf("You rolled %d + %d = %2d %s %d\n", dice1, dice2, dice1 + dice2, "point is", dice1 + dice2); // game on.
				while (establishedPointStatement) {
					establishedPoint = dice1 + dice2; // we get point on a new variable to compare with new.
					// roll dices.
					dice1 = rollDice();
					dice2 = rollDice();
					if (dice1 + dice2 == 7) {
						System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You lose");
						establishedPointStatement = false;
					} else if (dice1 + dice2 == establishedPoint) {
						System.out.printf("You rolled %d + %d = %2d %s\n", dice1, dice2, dice1 + dice2, "You win");
						numberOfWinnings++;
						establishedPointStatement = false;
					} else {
						System.out.printf("You rolled %d + %d = %2d %s %d\n", dice1, dice2, dice1 + dice2, "point is", dice1 + dice2); // game on.
					}
				}
			}
			gameNumber++;
		}
		System.out.printf("\n\n%s%d\n%s%d","Game : ",gameNumber,"Number of winnings : ",numberOfWinnings);
	}
}
