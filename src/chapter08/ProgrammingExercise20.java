/*
 * (Game: connect four) Connect four is a two-player board game in which the
 * players alternately drop colored disks into a seven-column, six-row vertically suspended grid.
 * 
 * The objective of the game is to connect four same-colored disks in a row, a column, or a diagonal before your opponent can do likewise. 
 * The program prompts two players to drop a red or yellow disk alternately. 
 * In the preceding figure, the red disk is shown in a dark color and the yellow in a light color. 
 * Whenever a disk is dropped, the program redisplays the board on the console and determines the status of the game (win, draw, or continue).
 * 
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise20 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] board = new char[7][15];
		makeBoard(board);
		printBoard(board);
		playGame(board);
	}

	public static void makeBoard(char[][] board) {
		for (int i = 0; i < board.length - 1; i++) { // zero to < length - 1 because last index would be full with ---- as a floor
			for (int j = 0; j < board[i].length - 1; j += 2) { // for columns each of row
				board[i][j] = '|';
				board[i][j + 1] = ' ';
			}
		}
		for (int i = 0; i < board[0].length; i++) {
			board[board.length - 1][i] = '-';
		}
		for (int i = 0; i < board.length - 1; i++) {
			board[i][board[i].length - 1] = '|';
		}
	}

	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	public static void playGame(char[][] board) {
		boolean gameOver = false;
		int columnIndex;
		char player1 = 'R';
		char player2 = 'Y';
		while (gameOver == false) {
			do {
				System.out.print("Drop a " + player1 + " disk at column (0–6) : "); // 0 1 2 3 4 5 6__ 1 3 5 7 9 11 13 15 ==>> 2x + 1 for corresponding index
				columnIndex = input.nextInt() * 2 + 1;
			} while (columnIndex < 0 || 13 < columnIndex);
			putSymbolOnBoard(board, player1, columnIndex);
			printBoard(board);
			if (isGameOver(board, player1, columnIndex)) {
				break;
			}
			do {
				System.out.print("Drop a " + player2 + " disk at column (0–6) : ");
				columnIndex = input.nextInt() * 2 + 1;
			} while (columnIndex < 0 || 13 < columnIndex);
			putSymbolOnBoard(board, player2, columnIndex);
			printBoard(board);
			if (isGameOver(board, player2, columnIndex)) {
				break;
			}

		}
	}

	public static void putSymbolOnBoard(char[][] board, char player1, int column) {
		for (int i = board.length - 2; i >= 0; i--) { // board.length - 2. index is where our playground start from bottom. Checking
														// every area if its empty from bottom to top.
			if (board[i][column] == ' ') {
				board[i][column] = player1; // if any index is would be empty , we would print player's symbol
				break;
			}
		}
	}

	public static boolean isGameOver(char[][] board, char player, int columnIndex) {

		if (isConsecutiveFour(board, player, columnIndex)) {
			return true;
		} else if (areSlotsFull(board)) {
			System.out.print("Draw.");
			return true;
		}

		return false;
	}

	public static boolean isConsecutiveFour(char[][] board, char player, int columnIndex) {

		if (isRowHasConsecutiveFour(board, player, columnIndex)) {
			System.out.println(player + " is won.");
			return true;
		} else if (isColumnHasConsecutiveFour(board, player, columnIndex)) {
			System.out.println(player + " is won.");
			return true;
		} else if (isAnyDiagonalHasConsecutiveFour(board, player, columnIndex)) {
			System.out.println(player + " is won.");
			return true;
		}
		return false;
	}

	public static boolean isRowHasConsecutiveFour(char[][] board, char player, int columnIndex) {
		int rowIndex = 0;
		// this loop will give us what row user enter symbol last. so we have location.
		for (int row = 0; row <= board.length - 2; row++) {
			if (board[row][columnIndex] == player) {
				rowIndex = row;
				break;
			}
		}

		int symbolCounter = 0;
		for (int column = 1; column < board[0].length; column += 2) {
			if (board[rowIndex][column] == player) {
				symbolCounter++;
				if (symbolCounter == 4) {
					return true;
				}
			} else {
				symbolCounter = 0;
			}
		}

		return false;
	}

	private static boolean isColumnHasConsecutiveFour(char[][] board, char player, int columnIndex) {
		int rowIndex = 0;
		// this loop will give us what row user enter symbol last. so we have location.
		for (int row = 0; row <= board.length - 2; row++) {
			if (board[row][columnIndex] == player) {
				rowIndex = row;
				break;
			}
		}

		int symbolCounter = 0;
		for (int row = rowIndex; row <= board.length - 2; row++) {
			if (board[row][columnIndex] == player) {
				symbolCounter++;
				if (symbolCounter == 4) {
					return true;
				}
			} else {
				symbolCounter = 0;
			}
		}

		return false;
	}

	private static boolean isAnyDiagonalHasConsecutiveFour(char[][] board, char player, int columnIndex) {
		int rowIndex = 0;
		// this loop will give us what row user enter symbol last. so we have location.
		for (int row = 0; row <= board.length - 2; row++) {
			if (board[row][columnIndex] == player) {
				rowIndex = row;
				break;
			}
		}

		int symbolCounter = 0;
		for (int row = rowIndex, column = columnIndex; row <= board.length - 2 && column < board[0].length; row++, column += 2) {
			if (board[row][column] == player) {
				symbolCounter++;
				if (symbolCounter == 4) {
					return true;
				}
			} else {
				symbolCounter = 0;
			}
		}

		symbolCounter = 0;
		for (int row = rowIndex, column = columnIndex; row <= board.length - 2 && column >= 1; row++, column -= 2) {
			if (board[row][column] == player) {
				symbolCounter++;
				if (symbolCounter == 4) {
					return true;
				}
			} else {
				symbolCounter = 0;
			}
		}

		symbolCounter = 0;
		for (int row = rowIndex, column = columnIndex; row >= 0 && column < board[0].length; row--, column += 2) {
			if (board[row][column] == player) {
				symbolCounter++;
				if (symbolCounter == 4) {
					return true;
				}
			} else {
				symbolCounter = 0;
			}
		}

		symbolCounter = 0;
		for (int row = rowIndex, column = columnIndex; row >= 0 && column >= 1; row--, column -= 2) {
			if (board[row][column] == player) {
				symbolCounter++;
				if (symbolCounter == 4) {
					return true;
				}
			} else {
				symbolCounter = 0;
			}
		}

		return false;
	}

	public static boolean areSlotsFull(char[][] board) {
		int emptySlot = 0;
		for (int i = 0; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length; j += 2) { // we will check slots that was empty at the beggining.
				if (board[i][j] == ' ') {
					emptySlot++;
				}
			}
		}

		if (emptySlot != 0) { // this mean all slots are full so there is no slot left to put symbol on.
			return false;
		}
		return true;
	}
}
