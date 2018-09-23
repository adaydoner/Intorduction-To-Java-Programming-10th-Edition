/*
 * (Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
 * Note that if a number occurs more than one time, the plural word “times” is used in the output.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise03 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int lastIndex;
		int[] integersSpecified = new int[500];

		getNumbers(integersSpecified); // we will have the numbers that user would specified.
		lastIndex = getLastIndex(integersSpecified); // end number is zero , we will have the index where first zero is located.
		int[] finalArrayThatHasOnlyNumbersSpecified = new int[lastIndex]; // final array has only numbers , not zeros that comes from integersSpecified array's left empty element.
		System.arraycopy(integersSpecified, 0, finalArrayThatHasOnlyNumbersSpecified, 0, finalArrayThatHasOnlyNumbersSpecified.length); // copied the numbers into finalArrayThatHasOnlyNumbersSpecified .
		// WARNING : program wont count numbers after zero
		printOccurrencesOfNumbersThatUserSpecified(finalArrayThatHasOnlyNumbersSpecified);

	}

	public static void printOccurrencesOfNumbersThatUserSpecified(int[] finalArrayThatHasOnlyNumbersSpecified) {
		int occurrences;
		int[] distinctNumbersArray = new int[finalArrayThatHasOnlyNumbersSpecified.length]; // make new array to work on it.
		distinctNumbersArray(finalArrayThatHasOnlyNumbersSpecified,distinctNumbersArray); // numbers that exist more than once written only one time into new array. 
		sortArrayElementsAscendingOrder(distinctNumbersArray); // sort the distinct numbers to print easier according to exercise.
		for (int i = 0; i < distinctNumbersArray.length; i++) {
			occurrences = 0;
			// we dont want to print occurrences of zeros.
			if (distinctNumbersArray[i] == 0) {
				continue;
			}
			// count occurrences of each element except zero.
			for (int j = 0; j < distinctNumbersArray.length; j++) {
				if (distinctNumbersArray[i] == finalArrayThatHasOnlyNumbersSpecified[j]) {
					occurrences++;
				}
			}
			if(occurrences > 1) {
				System.out.printf("%2d occurs %2d times\n", distinctNumbersArray[i], occurrences);
			} else {
				System.out.printf("%2d occurs %2d time\n", distinctNumbersArray[i], occurrences);
			}
		}
	}

	public static void sortArrayElementsAscendingOrder(int[] distinctNumbers) {
		int temp;
		for (int i = 0; i < distinctNumbers.length; i++) {
			if(distinctNumbers[i] == 0) {
				continue;
			}
			for (int j = (i + 1); j < distinctNumbers.length; j++) {
				if(distinctNumbers[j] < distinctNumbers[i]) {
					temp = distinctNumbers[i];
					distinctNumbers[i] = distinctNumbers[j];
					distinctNumbers[j] = temp;
				}
			}
		}
	}

	public static void distinctNumbersArray(int[] finalArrayThatHasOnlyNumbersSpecified, int[] distinctNumbers) {
		int distinctNumberWriter = 0;
		boolean flag;
		for (int i = 0; i < finalArrayThatHasOnlyNumbersSpecified.length; i++) {
			flag = false;
			for (int j = 0; j < distinctNumbers.length; j++) {
				if (finalArrayThatHasOnlyNumbersSpecified[i] == distinctNumbers[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				distinctNumbers[distinctNumberWriter] = finalArrayThatHasOnlyNumbersSpecified[i];
				distinctNumberWriter++;
			}
		}
	}

	public static int getLastIndex(int[] integersSpecified) {
		for (int i = 0; i < integersSpecified.length; i++) {
			if (integersSpecified[i] == 0) {
				return i;
			}
		}
		return 0;
	}

	public static void getNumbers(int[] integersArray) {
		System.out.print("Enter the integers between 1 and 100 (ends with 0) : ");
		for (int i = 0; i < integersArray.length; i++) {
			integersArray[i] = input.nextInt();
			if (integersArray[i] == 0) {
				break;
			}
		}
	}
}
