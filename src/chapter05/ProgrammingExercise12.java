/*
 * (Find the smallest n such that n pow 2 > 12,000) Use a while loop to find the smallest
 * integer n such that n pow 2 is greater than 12,000
 */
package chapter05;

public class ProgrammingExercise12 {

	public static void main(String[] args) {
		int n = 0;
		while(Math.pow(n, 2) < 12000) {
			n++;
		}
		System.out.println("Smallest n ( Pow of n > 12000 ) : " + n);
		System.out.println("Power of " + n + " : " + (int)Math.pow(n, 2));
		System.out.println("Power of " + (n - 1) + " : " + (int)Math.pow(n -1 , 2));
	}

}
