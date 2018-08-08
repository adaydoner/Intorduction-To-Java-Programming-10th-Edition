/*
 * (Print a table) Write a program that displays the following table:
 * a a^2 a^3
 * 1 1 1
 * 2 4 8
 * 3 9 27
 * 4 16 64
 */
package chapter01;

public class ProgrammingExercise04 {

	public static void main(String[] args) {
		System.out.println("a     a^2   a^3");
		int[][] array = new int[5][4];
		for(int i =1; i<=4; i++) {
			for(int k = 1; k<=3; k++) {
				System.out.print((array[i][k] = (int)Math.pow(i, k))+"     ");
			}
			System.out.print("\n");
		}
		
	}

}
