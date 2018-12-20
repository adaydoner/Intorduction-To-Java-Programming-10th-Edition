package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Combine two lists) Write a method that returns the union of two array lists of integers using the following header:
 * 		public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
 * 
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is {2, 3, 1, 5, 3, 4, 6}. 
 * Write a test program that prompts the user to enter two lists, each with five integers, and displays their union. 
 * The numbers are separated by exactly one space in the output
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> union = new ArrayList<>();
		
		System.out.print("Enter five integers for list1 :");
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}
		
		System.out.print("Enter five integers for list2 :");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
		
		
		union = union(list1, list2);
		System.out.println(union);
	}
	
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> unionList = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			unionList.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			unionList.add(list2.get(i));
		}
		
		return unionList;
	}
}
