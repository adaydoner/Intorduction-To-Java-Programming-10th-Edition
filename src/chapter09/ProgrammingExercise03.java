/*
 * (Use the Date class ) Write a program that creates a Date object, 
 * sets its elapsed time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, and 100000000000, and displays the date and time using the toString() method, respectively.
 */
package chapter09;

import java.util.Date;

public class ProgrammingExercise03 {

	public static void main(String[] args) {
		Date[] dateArray = new Date[8];
		for (int i = 0; i < 8; i++) {
			dateArray[i] = new Date();
			dateArray[i].setTime((long) (1000 * Math.pow(10, i + 1)));
		}

		for (int i = 0; i < 8; i++) {
			System.out.println(dateArray[i].toString());
		}
	}

}
