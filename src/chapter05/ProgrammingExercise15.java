/*
 * (Display the ASCII character table) Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line. The ASCII
 * table is shown in Appendix B. Characters are separated by exactly one space.
 */
package chapter05;

public class ProgrammingExercise15 {

	public static void main(String[] args) {
		
		for (char i = '!' ; i <= '~'; i++) {
			System.out.printf("%c ",i);
			if(i % 10 == 2) System.out.println();  
		}
	}

}
