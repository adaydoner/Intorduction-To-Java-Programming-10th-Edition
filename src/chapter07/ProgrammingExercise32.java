/*
 * (Partition of a list) Write the following method that partitions the list using the first element, called a pivot.
 * 			
 * 		public static int partition(int[] list)
 * 
 * After the partition, the elements in the list are rearranged so that all the elements
 * before the pivot are less than or equal to the pivot and the elements after the pivot
 * are greater than the pivot. The method returns the index where the pivot is located
 * in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 * the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes
 * at most list.length comparisons. Write a test program that prompts the user
 * to enter a list and displays the list after the partition. Here is a sample run. Note
 * that the first number in the input indicates the number of the elements in the list. This number is not part of the list.
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfArrayElements;
		int pivotIndex;
		System.out.print("Enter list : ");
		numberOfArrayElements = input.nextInt();
		
		int[] specifiedNumbers = new int[numberOfArrayElements];
		for (int i = 0; i < specifiedNumbers.length; i++) {
			specifiedNumbers[i] = input.nextInt();
		}
		
		pivotIndex = partition(specifiedNumbers);
		
		
		input.close();
	}
	
	public static int partition(int[] list) {
		int pivotNumber = list[0];
		int pivotIndex = 0;
		int[] newList = new int[list.length];
		int newListWriter = 0;
		for (int i = 1; i < list.length; i++) { // from index 1 because index 0 is our pivot number.
			if(list[i] <= pivotNumber) {
				newList[newListWriter] = list[i];
				newListWriter++;
			}
		}
		// after all numbers that equal or smaller than pivot number written we would print our pivot number as last number for this part and break the loop.
		newList[newListWriter] = pivotNumber;
		pivotIndex = newListWriter; // hold our pivot number's index , we will return this.
		newListWriter++; // we increase it for writing rest of numbers from this index.

		// now we need to print rest of numbers that bigger than pivot number.
		for (int i = 0; i < list.length; i++) { // we can start from first index of our list and put condition
			if(list[i] > pivotNumber) {
				newList[newListWriter] = list[i];
				newListWriter++;
			}
		}
		printArray(newList);
		return pivotIndex;
	}

	public static void printArray(int[] newList) {
		for (int i = 0; i < newList.length; i++) {
			System.out.printf("%3d",newList[i]);
		}
	}
}
