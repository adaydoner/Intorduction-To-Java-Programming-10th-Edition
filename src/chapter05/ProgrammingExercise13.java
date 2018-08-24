/*
 * (Find the largest n such that n3 6 12,000) Use a while loop to find the largest
 * integer n such that n3 is less than 12,000.
 */
package chapter05;

public class ProgrammingExercise13 {

	public static void main(String[] args) {
		int n = 0;
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		System.out.println("Largest n (  n ^3 < 12000 ) : " + (n -1));
		System.out.println((n - 1) + "^3 = " + (int) Math.pow(n - 1, 3));
		System.out.println((n) + "^3 = " + (int) Math.pow(n, 3));
	}

}
