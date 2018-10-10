/*
 * (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
 * on a chessboard such that no two queens can attack each other (i.e., no two queens
 * are on the same row, same column, or same diagonal). There are many possible solutions.
 */
package chapter07;

public class ProgrammingExercise22 {

	public static void main(String[] args) {
		String[][] chessBoard = new String[8][17];
		doChessBoard(chessBoard);
		if(putQueensOnChessBoard(chessBoard)) {
			printChessBoard(chessBoard);
		}
		//printMultidimensionalArray(chessBoard);
	}

	private static void printChessBoard(String[][] chessBoard) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 17; j++) {
				System.out.print(chessBoard[i][j]);
			}
			System.out.println();
		}
	}

	public static boolean putQueensOnChessBoard(String[][] chessBoard) {
		long startTime;
		long endTime;
		int numberOfQueen = 0;
		boolean queenPlaced;
		for (int i = 0; i < 8; i++) {
			System.out.println("Trying to locate queen's locations..");
			startTime = System.currentTimeMillis(); // we hold the start time to calculate process time.
			queenPlaced = false;
			while (!queenPlaced) {
				int j = giveIndexForQueen();
				if (isLineFree(chessBoard, i) && isRowFree(chessBoard, j) && isDiagonalLinesFree(chessBoard, i, j)) {
					chessBoard[i][j] = "Q";
					numberOfQueen++;
					if(numberOfQueen == 8) { // if alghoritm can put 8 queen on chessboard with question's conditions. Than we can print it 
						return true;
					}
					queenPlaced = true;
				} 
				endTime = System.currentTimeMillis();
				if((endTime - startTime)/1000.0 > 0.5) { // if after 1 second it still couldnt find the all queen's location, this would be mean , with first queen index this puzzle cant solved.
													// we need to start again.
					clearChessBoard(chessBoard);	// clear all counters and board.
					numberOfQueen = 0;
					break;
				}
			}
		}
		putQueensOnChessBoard(chessBoard); // this will help to call this method over and over again untill we got 8 queen's location.
		return true;
	}

	public static void clearChessBoard(String[][] chessBoard) {
		doChessBoard(chessBoard);
	}

	public static boolean isDiagonalLinesFree(String[][] chessBoard, int lineNumber, int rowNumber) {
		// first for loop will check from checking index to (0,1)- up-left point.
		for (int i = lineNumber - 1, j = rowNumber - 2; i >= 0 && j >= 1; i--, j -= 2) {
			if (chessBoard[i][j] == "Q") {
				return false;
			}
		}
		// second for loop will check from checking index to (8,17) down-right point
		for (int i = lineNumber + 1, j = rowNumber + 2; i < 8 && j < 17; i++, j += 2) {
			if (chessBoard[i][j] == "Q") {
				return false;
			}
		}
		// up - right
		for (int i = lineNumber - 1, j = rowNumber + 2; i >= 0 && j < 17; i--, j += 2) {
			if (chessBoard[i][j] == "Q") {
				return false;
			}
		}
		// down-left
		for (int i = lineNumber + 1, j = rowNumber - 2; i < 8 && j >= 1; i++, j -= 2) {
			if (chessBoard[i][j] == "Q") {
				return false;
			}
		}
		return true;
	}

	public static boolean isRowFree(String[][] chessBoard, int rowNumber) {
		for (int i = 0; i < 8; i++) {
			if (chessBoard[i][rowNumber] == "Q") {
				return false;
			}
		}

		return true;
	}

	public static boolean isLineFree(String[][] chessBoard, int lineNumber) {
		for (int j = 1; j < 17; j += 2) {
			if (chessBoard[lineNumber][j] == "Q") {
				return false;
			}
		}
		return true;
	}

	public static int giveIndexForQueen() {
		// this will return 1-3-5-7-9-11-13-15 ,same with empty indexes
		int firstQueensIndex = 0;
		while (firstQueensIndex % 2 == 0) {
			firstQueensIndex = ((int) (Math.random() * 29) / 2) + 1;
		}
		return firstQueensIndex;
	}

	public static void doChessBoard(String[][] chessBoard) {
		for (int i = 0; i < 8; i++) { // we have empty spaces in indexes , [0][1],3,5,7,9,11,13,15 -
										// [1][1],3,5,7,9,11,13,15... where we put queen on.
			for (int j = 0; j < 17; j += 2) {
				chessBoard[i][j] = "|";
				if ((j + 1) == 17) {
					continue;
				}
				chessBoard[i][j + 1] = " ";
			}
		}
	}

	public static void printMultidimensionalArray(String[][] chessBoard) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 17; j++) {
				System.out.print(chessBoard[i][j]);
			}
			System.out.println();
		}
	}
}
