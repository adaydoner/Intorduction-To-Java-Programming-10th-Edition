/*
 * (Display numbers in a pyramid pattern)
 */
package chapter05;

public class ProgrammingExercise19 {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8 - i; j++) {
				System.out.printf("%6s","");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("%-6d", (int) (Math.pow(2, j - 1)));
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.printf("%-6d ", (int) Math.pow(2, j - 1));
			}
			System.out.println();
		}
	}
}
