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
		// two counter initialization to get lists element individually and mergedList index holder.
		int list1Counter = 0;
		int list2Counter = 0;
		int lastWrittenIndex = 0;
		// two boolean initialization for using to detect which list is smaller so we can print the larger list's element after loop. 
		boolean list1Smaller = false;
		boolean list2Smaller = false;
		
		for (int writer = 0; writer < mergedList.length; writer++) {
			lastWrittenIndex = writer;
			if (list1[list1Counter] <= list2[list2Counter]) { // if its true we get next list1 element to our mergedlist
				mergedList[writer] = list1[list1Counter]; 
				list1Counter++;
				if(list1Counter == list1.length) { // if next step would be give an ArrayIndexOutOfBoundsException
					list1Smaller = true; // set list1smaller flag true and break the loop.
					break;
				}
			} else { // else we get next list2 element to our mergedList
				mergedList[writer] = list2[list2Counter];
				list2Counter++;
				if(list2Counter == list2.length) { // if next step would be give an ArrayIndexOutOfBoundsException
					list2Smaller = true; // set list2smaller flag true and break the loop.
					break;
				}
			}
		}
		
		if(list1Smaller) { // if list1 is smaller , we will print rest of LIST2 element to our mergedlist , since lists supposed to be sorted no need to check any element.
			for (int i = list2Counter; i < list2.length; i++,lastWrittenIndex++) { // from list2Counter which is index of list2 that doesn't written to list2's last element. 
				mergedList[lastWrittenIndex] = list2[i];
			}
		} else if(list2Smaller) { //  we will print rest of LIST1 element to our mergedlist , since lists supposed to be sorted no need to check any element.
			for (int i = list1Counter; i < list1.length; i++,lastWrittenIndex++) {
				mergedList[lastWrittenIndex + 1] = list1[i]; // from list1Counter which is index of list1 that doesn't written to list1's last element.
			}
		}

		return mergedList;
	}
}
