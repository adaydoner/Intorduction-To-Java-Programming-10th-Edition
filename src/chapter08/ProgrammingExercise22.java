/*
 * (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional 
 * matrix filled with 0s and 1s, displays the matrix, and checks if every row and every column have an even number of 1s.
 */
package chapter08;

public class ProgrammingExercise22 {

	public static void main(String[] args) {
		int[][] array = new int[6][6];
		fillArrayWith1sAnd0sRandomly(array);
		printArray(array);
		checkRowsIfHasEven1s(array);
		checkColumnsIfHasEven1s(array);
	}

	public static void fillArrayWith1sAnd0sRandomly(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int j = 0; j < array[row].length; j++) {
				array[row][j] = (int) (Math.random() * 10) % 2;
			}
		}
	}

	public static void printArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				System.out.printf("%2d",array[row][column]);
			}
			System.out.println();
		}
	}

	public static void checkRowsIfHasEven1s(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			int counter = 0;
			for (int j = 0; j < array[row].length; j++) {
				if (array[row][j] == 1) {
					counter++;
				}
			}
			if (counter % 2 == 0) {
				System.out.printf("%d%s", row, ". row has even number of 1s.\n");
			}
		}
	}

	public static void checkColumnsIfHasEven1s(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			int counter = 0;
			for (int column = 0; column < array[row].length; column++) {
				if (array[column][row] == 1) {
					counter++;
				}
			}
			if (counter % 2 == 0) {
				System.out.printf("%d%s", row, ". column has even number of 1s.\n");
			}
		}
	}

}
