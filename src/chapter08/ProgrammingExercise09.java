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
		printBoard(ticTacToe); // show board.
		playTicTacToe(ticTacToe); // let users play it.
	}

	public static void playTicTacToe(char[][] ticTacToe) {
		int row;
		int column;
		char player1 = 'X';
		char player2 = 'O';
		while (true) { // game can only end if isGameOver method return true , which program check it after every move. 
			do { // this do while statement will block user from enter a spot where is already used.
					row = getRowCoordinate(player1);
					column = getColumnCoordinate(player1);
			} while (!isSpotFree(ticTacToe,row,column));
			
			putOnBoard(ticTacToe, row, column, player1); // after we got valid row and column we put this on board by player symbol
			printBoard(ticTacToe); // print board to user after put symbol.
			if(isGameOver(ticTacToe, player1)) System.exit(0); // check if game is over
			
			do {
				row = getRowCoordinate(player2);
				column = getColumnCoordinate(player2);
			} while (!isSpotFree(ticTacToe,row,column));
			
			putOnBoard(ticTacToe, row, column, player2);
			printBoard(ticTacToe);
			if(isGameOver(ticTacToe, player2)) System.exit(0);
		}
	}

	public static int getColumnCoordinate(char playerType) {
		int column;
		do {
			System.out.print("Enter a column (1, 2, or 3) for player " + playerType + " : ");
			column = input.nextInt();
		} while (column != 1 && column != 2 && column != 3); // this do while statement will block user enter something else from 0,1 or 2
		return column;
	}

	public static int getRowCoordinate(char playerType) {
		int row;
		do {
			System.out.print("Enter a row (1, 2, or 3) for player " + playerType + " : ");
			row = input.nextInt();
		} while (row != 1 && row != 2 && row != 3); // this do while statement will block user enter something else from 0,1 or 2
		return row;
	}

	public static boolean isSpotFree(char[][] ticTacToe, int row, int column) {
		// before we do any process on board that we made with multi-dimensional char array , we need to convert coordinate to corresponding index in array
		int rowIndexForArray;
		int columnIndexForArray;
		rowIndexForArray = convertCoordinateToValueThatAlghoritmWouldUnderstand(row);
		columnIndexForArray = convertCoordinateToValueThatAlghoritmWouldUnderstand(column);
		if(ticTacToe[rowIndexForArray][columnIndexForArray] == ' ') {
			return true;
		}
		return false;
	}

	public static void putOnBoard(char[][] ticTacToe, int row, int column, char player) {
		int rowIndexForArray;
		int columnIndexForArray;
		rowIndexForArray = convertCoordinateToValueThatAlghoritmWouldUnderstand(row);
		columnIndexForArray = convertCoordinateToValueThatAlghoritmWouldUnderstand(column);
		// we put the player's symbol on valid spot.
		if (player == 'X') {
			ticTacToe[rowIndexForArray][columnIndexForArray] = 'X';
		} else {
			ticTacToe[rowIndexForArray][columnIndexForArray] = 'O';
		}
	}

	public static int convertCoordinateToValueThatAlghoritmWouldUnderstand(int coordinate) {
		int correspondingIndexValue;
		if (coordinate == 1) {
			correspondingIndexValue = 1;
		} else if (coordinate == 2) {
			correspondingIndexValue = 3;
		} else {
			correspondingIndexValue = 5;
		}
		return correspondingIndexValue;
	}

	public static boolean isGameOver(char[][] ticTacToe, char player) {
		if (isAnyRowSame(ticTacToe, player)) { 
			System.out.println(player + " is won");
			return true;
		} else if (isAnyColumnSame(ticTacToe, player)) {
			System.out.println(player + " is won");
			return true;
		} else if (isAnyDiagonalSame(ticTacToe, player)) {
			System.out.println(player + " is won");
			return true;
		} else if (isBoardFull(ticTacToe)) {
			System.out.println("Draw..");
			return true;
		}
		return false;
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
