/*
 * (Merge two sorted lists) Write the following method that merges two sorted lists into a new sorted list.
 * 		public static int[] merge(int[] list1, int[] list2)
 * Implement the method in a way that takes at most list1.length + list2.
 * length comparisons. Write a test program that prompts the user to enter two
 * sorted lists and displays the merged list. Here is a sample run. 
 * 
 * 
 * 
 * *********************Note that the first number in the input indicates the number of the elements in the list. This number is not part of the list.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise31 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int lengthOfList1;
		System.out.print("Enter list1 : ");
		lengthOfList1 = input.nextInt();
		int[] list1 = new int[lengthOfList1];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		int lengthOfList2;
		System.out.print("Enter list2 : ");
		lengthOfList2 = input.nextInt();
		int[] list2 = new int[lengthOfList2];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		int[] mergedList = new int[lengthOfList1 + lengthOfList2];
		mergedList = merge(list1, list2);

		printList(mergedList);

	}

	public static void printList(int[] mergedList) {
		for (int i = 0; i < mergedList.length; i++) {
			System.out.printf("%4d", mergedList[i]);
		}
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] mergedList = new int[list1.length + list2.length];
		int list1Counter = 0;
		int list2Counter = 0;
		int lastWrittenIndex = 0;
		boolean list1Smaller = false;
		boolean list2Smaller = false;
		for (int writer = 0; writer < mergedList.length; writer++) {
			lastWrittenIndex = writer;
			if (list1[list1Counter] <= list2[list2Counter]) {
				mergedList[writer] = list1[list1Counter];
				list1Counter++;
				if(list1Counter == list1.length) { // if next step would be give an ArrayIndexOutOfBoundsException
					list1Smaller = true;
					break;
				}
			} else {
				mergedList[writer] = list2[list2Counter];
				list2Counter++;
				if(list2Counter == list2.length) { // if next step would be give an ArrayIndexOutOfBoundsException
					list2Smaller = true;
					break;
				}
			}
		}
		
		if(list1Smaller) {
			for (int i = list2Counter; i < list2.length; i++,lastWrittenIndex++) {
				mergedList[lastWrittenIndex] = list2[i];
			}
		} else if(list2Smaller) {
			for (int i = list1Counter; i < list1.length; i++,lastWrittenIndex++) {
				mergedList[lastWrittenIndex + 1] = list1[i];
			}
		}

		return mergedList;
	}
}
