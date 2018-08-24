/*
 * (Conversion from kilograms to pounds) Write a program that displays the following
 * table (note that 1 kilogram is 2.2 pounds):
 * 	    Kilograms 	Pounds
 * 		1 	 	  	   2.2
 * 		3 	 	  	   6.6
 * 		...
 * 		197 		 433.4
 * 		199 		 437.8
 */
package chapter05;

public class ProgrammingExercise03 {

	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds");
		for (int i = 1; i <= 199; i += 2) {
			System.out.printf("%-9d\t %5.1f\n",i,(i * 2.2));
		}
	}
}
