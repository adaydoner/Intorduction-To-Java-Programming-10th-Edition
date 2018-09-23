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

		integersSpecified = getNumbers(integersSpecified); // we will have the numbers that user would specified.
		lastIndex = getLastIndex(integersSpecified); // end number is zero , we will have the index where first zero is located.
		int[] finalArrayThatHasOnlyNumbersSpecified = new int[lastIndex]; // final array has only numbers , not zeros that comes from integersSpecified array's left empty element.
		System.arraycopy(integersSpecified, 0, finalArrayThatHasOnlyNumbersSpecified, 0, finalArrayThatHasOnlyNumbersSpecified.length); // copied the numbers into finalArrayThatHasOnlyNumbersSpecified .
		// WARNING : program wont count numbers after zero
		printOccurrencesOfNumbersThatUserSpecified(finalArrayThatHasOnlyNumbersSpecified);

	}

	public static void printOccurrencesOfNumbersThatUserSpecified(int[] finalArrayThatHasOnlyNumbersSpecified) {
		int occurrences;
		int[] uniqueNumbers = new int[finalArrayThatHasOnlyNumbersSpecified.length]; // make new array to work on it.
		uniqueNumbers = uniqueNumbersArray(finalArrayThatHasOnlyNumbersSpecified); // numbers that exist more than once written only one time into new array. 
		uniqueNumbers = sortArrayElementsAscendingOrder(uniqueNumbers); // sort the unique numbers to print easier according to exercise.
		for (int i = 0; i < uniqueNumbers.length; i++) {
			occurrences = 0;
			// we dont want to print occurrences of zeros.
			if (uniqueNumbers[i] == 0) {
				continue;
			}
			// count occurrences of each element except zero.
			for (int j = 0; j < uniqueNumbers.length; j++) {
				if (uniqueNumbers[i] == finalArrayThatHasOnlyNumbersSpecified[j]) {
					occurrences++;
				}
			}
			if(occurrences > 1) {
				System.out.printf("%2d occurs %2d times\n", uniqueNumbers[i], occurrences);
			} else {
				System.out.printf("%2d occurs %2d time\n", uniqueNumbers[i], occurrences);
			}
		}
	}

	public static int[] sortArrayElementsAscendingOrder(int[] uniqueNumbers) {
		int temp;
		for (int i = 0; i < uniqueNumbers.length; i++) {
			if(uniqueNumbers[i] == 0) {
				continue;
			}
			for (int j = (i + 1); j < uniqueNumbers.length; j++) {
				if(uniqueNumbers[j] < uniqueNumbers[i]) {
					temp = uniqueNumbers[i];
					uniqueNumbers[i] = uniqueNumbers[j];
					uniqueNumbers[j] = temp;
				}
			}
		}
		return uniqueNumbers;
	}

	public static int[] uniqueNumbersArray(int[] finalArrayThatHasOnlyNumbersSpecified) {
		int uniqueNumberWriter = 0;
		boolean flag;
		int[] uniqueNumbers = new int[finalArrayThatHasOnlyNumbersSpecified.length];
		for (int i = 0; i < finalArrayThatHasOnlyNumbersSpecified.length; i++) {
			flag = false;
			for (int j = 0; j < uniqueNumbers.length; j++) {
				if (finalArrayThatHasOnlyNumbersSpecified[i] == uniqueNumbers[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				uniqueNumbers[uniqueNumberWriter] = finalArrayThatHasOnlyNumbersSpecified[i];
				uniqueNumberWriter++;
			}
		}
		return uniqueNumbers;
	}

	public static int getLastIndex(int[] integersSpecified) {
		for (int i = 0; i < integersSpecified.length; i++) {
			if (integersSpecified[i] == 0) {
				return i;
			}
		}
		return 0;
	}

	public static int[] getNumbers(int[] integersArray) {
		System.out.print("Enter the integers between 1 and 100 (ends with 0) : ");
		for (int i = 0; i < integersArray.length; i++) {
			integersArray[i] = input.nextInt();
			if (integersArray[i] == 0) {
				break;
			}
		}
		return integersArray;
	}
}
