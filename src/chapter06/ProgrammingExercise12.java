/*
 * (Display characters) Write a method that prints characters using the following header:
 * 		public static void printChars(char ch1, char ch2, int numberPerLine)
 * 
 * This method prints the characters between ch1 and ch2 with the specified numbers per line. 
 * Write a test program that prints ten characters per line from 1 to Z.
 * Characters are separated by exactly one space.
 */
package chapter06;

public class ProgrammingExercise12 {

	private static void printChars(char ch1, char ch2, int numberPerLine) {
		int lineCounter = 0;
		for (char i = ch1 ; i <= ch2 ; i++) {
			System.out.printf("%-2c",i);
			lineCounter++;
			if(lineCounter % numberPerLine == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		printChars('1','Z',10);
	}
}
