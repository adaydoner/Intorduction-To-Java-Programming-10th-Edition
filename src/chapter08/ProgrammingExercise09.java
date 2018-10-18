/*
 * (Game: play a tic-tac-toe game) 
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise09 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] ticTacToe = new char[7][7];
		makeTicTacToeBoard(ticTacToe); // create schema of sample board.
		printBoard(ticTacToe); 
		playTicTacToe(ticTacToe);
	}

	public static void playTicTacToe(char[][] ticTacToe) {
		int row;
		int column;
		char player1 = 'X';
		char player2 = 'O';
		while (true) { // game can only end at isGameOver method
			do { // this do while statement will block user from enter a spot where is already used by someone.
				do { // this do while statement will block user enter something else from 0,1 or 2
					System.out.println("Enter a row (0, 1, or 2) for player X : ");
					row = input.nextInt();
				} while (row != 0 && row != 1 && row != 2);
				do {
					System.out.println("Enter a column (0, 1, or 2) for player X : ");
					column = input.nextInt();
				} while (column != 0 && column != 1 && column != 2);
			} while (!isSpotFree(ticTacToe,row,column));
			putOnBoard(ticTacToe, row, column, player1); // after we got valid row and column we put this on board by player symbol
			printBoard(ticTacToe); // print board to user after put symbol.
			isGameOver(ticTacToe, player1); // check if game is over
			do {
				do {
					System.out.println("Enter a row (0, 1, or 2) for player O : ");
					row = input.nextInt();
				} while (row != 0 && row != 1 && row != 2);
				do {
					System.out.println("Enter a column (0, 1, or 2) for player O : ");
					column = input.nextInt();
				} while (column != 0 && column != 1 && column != 2);
			} while (!isSpotFree(ticTacToe,row,column));
			putOnBoard(ticTacToe, row, column, player2);
			printBoard(ticTacToe);
			isGameOver(ticTacToe, player2);
		}
	}

	public static boolean isSpotFree(char[][] ticTacToe, int row, int column) {
		int rowForBoard;
		int columnForBoard;
		if (row == 0) {
			rowForBoard = 1;
		} else if (row == 1) {
			rowForBoard = 3;
		} else {
			rowForBoard = 5;
		}
		if (column == 0) {
			columnForBoard = 1;
		} else if (column == 1) {
			columnForBoard = 3;
		} else {
			columnForBoard = 5;
		}
		if(ticTacToe[rowForBoard][columnForBoard] == ' ') {
			return true;
		}
		return false;
	}

	public static void isGameOver(char[][] ticTacToe, char player) {
		if (isAnyRowSame(ticTacToe, player)) { 
			System.out.println(player + " is won");
			System.exit(0);
		} else if (isAnyColumnSame(ticTacToe, player)) {
			System.out.println(player + " is won");
			System.exit(0);
		} else if (isAnyDiagonalSame(ticTacToe, player)) {
			System.out.println(player + " is won");
			System.exit(0);
		} else if (isBoardFull(ticTacToe)) {
			System.out.println("Draw..");
			System.exit(0);
		}
	}

	public static boolean isBoardFull(char[][] ticTacToe) {
		for (int i = 1; i < ticTacToe.length; i += 2) {
			for (int j = 1; j < ticTacToe.length; j += 2) {
				if (ticTacToe[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isAnyDiagonalSame(char[][] ticTacToe, char player) {
		if (ticTacToe[1][1] == player && ticTacToe[3][3] == player && ticTacToe[5][5] == player) {
			return true;
		}
		if (ticTacToe[5][1] == player && ticTacToe[3][3] == player && ticTacToe[1][5] == player) {
			return true;
		}
		return false;
	}

	public static boolean isAnyColumnSame(char[][] ticTacToe, char player) {
		for (int i = 1; i < ticTacToe.length; i += 2) {
			if (ticTacToe[1][i] == player && ticTacToe[3][i] == player && ticTacToe[5][i] == player) {
				return true;
			}
		}
		return false;
	}

	public static boolean isAnyRowSame(char[][] ticTacToe, char player) {
		for (int i = 1; i < ticTacToe.length; i += 2) {
			if (ticTacToe[i][1] == player && ticTacToe[i][3] == player && ticTacToe[i][5] == player) {
				return true;
			}
		}
		return false;
	}

	public static void putOnBoard(char[][] ticTacToe, int row, int column, char player) {
		int rowForBoard;
		int columnForBoard;
		/*
		 *  these convertion is necessary since our board is [7][7] char array that has game spots on its
		 *   1,1 1,3 1,5
		 *   3,1 3,3 3,5
		 *   5,1 5,3 5,5
		 *   indices.
		 */
				
		if (row == 0) {
			rowForBoard = 1;
		} else if (row == 1) {
			rowForBoard = 3;
		} else {
			rowForBoard = 5;
		}
		if (column == 0) {
			columnForBoard = 1;
		} else if (column == 1) {
			columnForBoard = 3;
		} else {
			columnForBoard = 5;
		}
		// we put the player's symbol on valid spot.
		if (player == 'X') {
			ticTacToe[rowForBoard][columnForBoard] = 'X';
		} else {
			ticTacToe[rowForBoard][columnForBoard] = 'O';
		}
	}

	public static void printBoard(char[][] ticTacToe) {
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j = 0; j < ticTacToe[i].length; j++) {
				System.out.print(ticTacToe[i][j]);
			}
			System.out.println();
		}
	}

	public static void makeTicTacToeBoard(char[][] ticTacToeBoard) {
		for (int i = 0; i < ticTacToeBoard.length; i++) {
			for (int j = 0; j < ticTacToeBoard[i].length; j++) {
				if ((i + 1) % 2 == 1) {
					ticTacToeBoard[i][j] = '-';
				} else {
					if ((j + 1) % 2 == 1) {
						ticTacToeBoard[i][j] = '|';
					} else {
						ticTacToeBoard[i][j] = ' ';
					}
				}
			}
		}
	}
}
