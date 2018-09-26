/*
 * (Count single digits) Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. 
 * (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 * 
 */
package chapter07;

public class ProgrammingExercise07 {

	public static void main(String[] args) {
		int number;
		int[] numbers = new int[100];
		getNumbers(numbers);
		countNumbers(numbers);
	}

	public static void countNumbers(int[] numbers) {
		int[] counts = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			counts[numbers[i]]++; // numbers[i] would get each of number in loop , count[] array's digits would increase according to numbers value.
		}
		printCounts(counts);
	}

	public static void printCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%2ds : %2d\n",i,counts[i]);
		}
	}

	public static void getNumbers(int[] numbers) {
		for (int i = 0; i < 100; i++) {
			numbers[i] = (int)(Math.random() * 10); // it will give number between 0-9
		}
	}
}
