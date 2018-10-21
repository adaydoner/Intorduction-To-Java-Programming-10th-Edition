/*
 * (Shuffle rows) Write a method that shuffles the rows in a two-dimensional int array using the following header:
 * 		public static void shuffle(int[][] m)
 * Write a test program that shuffles the following matrix:
 * 		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 */
package chapter08;

public class ProgrammingExercise18 {

	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
		printArray(m);
		shuffle(m);
		System.out.println("--- After shuffled ---");
		printArray(m);
		
		
	}
	public static void shuffle(int[][] m) {
		int[] temp = new int[m[0].length];
		for (int i = 0; i < m.length; i++) {
			int randomRow = (int) (Math.random() * m.length);
			temp = m[i];
			m[i] = m[randomRow];
			m[randomRow] = temp;
		}
	}

	private static void printArray(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2d ",m[i][j]);
			}
			System.out.println();
		}
	}
}
