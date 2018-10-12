/*
 * (Identical arrays) The arrays list1 and list2 are identical if they have the
 * same contents. Write a method that returns true if list1 and list2 are identical, using the following header:
 * 
 * public static boolean equals(int[] list1, int[] list2)
 * 
 * Write a test program that prompts the user to enter two lists of integers and displays
 * whether the two are identical. Here are the sample runs. Note that the first
 * number in the input indicates the number of the elements in the list. This number is not part of the list.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfElementsInList1 ;
		int numberOfElementsInList2;
		System.out.print("Enter list1 : ");
		numberOfElementsInList1 = input.nextInt();
		int[] list1 = new int[numberOfElementsInList1];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		
		System.out.print("Enter list2 : ");
		numberOfElementsInList2 = input.nextInt();
		int[] list2 = new int[numberOfElementsInList2];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		
		if(equals(list1,list2)) {
			System.out.print("Two lists are identical.");
		} else {
			System.out.print("Two lists are not identical.");
		}
		
		input.close();
	}
	public static boolean equals(int[] list1, int[] list2) {
		if(list1.length != list2.length) {
			return false;
		} else {
			for (int i = 0; i < list1.length; i++) {
				for (int j = 0; j < list2.length; j++) {
					if(list1[i] == list2[j]) {
						list2[j] = 0;
						break;
					} else if(j == list2.length - 1) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
