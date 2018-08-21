/*
 * (Random character) Write a program that displays a random uppercase letter using the Math.random() method.
 * ascii : 65 <= x <= 90
 */
package chapter04;

public class ProgrammingExercise16 {

	public static void main(String[] args) {
		int number ;
		
		for (int i = 0; i <= 50 ; i++) {
			number = (int)(Math.random() * 26 ) + 65;
			System.out.printf("%3c",(char)number);
			if((i+1) % 17 == 0) {
				System.out.println("\n");
			}
		}
	}
}
