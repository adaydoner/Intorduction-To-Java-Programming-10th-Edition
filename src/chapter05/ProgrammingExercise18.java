/*
 * (Display four patterns using loops)
 */
package chapter05;

public class ProgrammingExercise18 {

	public static void main(String[] args) {
		System.out.println("Pattern A");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------- \n");
		System.out.println("Pattern B");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------- \n");
		System.out.println("Pattern C");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------- \n");
		System.out.println("Pattern D");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 7 - i; j++) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}
}
