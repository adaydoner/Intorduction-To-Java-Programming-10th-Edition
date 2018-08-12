/*
 * (Print a table) Write a program that displays the following table. Cast floatingpoint numbers into integers.
 * 	a b pow(a, b)
 * 	1 2 1
 * 	2 3 8
 *  3 4 81
 *  4 5 1024
 *  5 6 15625
 */
package chapter02;

public class ProgrammingExercise18 {

	public static void main(String[] args) {
		System.out.println("a    b    pow(a,b)");
		for(int a = 1 ; a <= 5 ; a++) {
			System.out.println(a+"    "+(a+1)+"    "+(int)(Math.pow(a, a+1)));
		}
	}

}
