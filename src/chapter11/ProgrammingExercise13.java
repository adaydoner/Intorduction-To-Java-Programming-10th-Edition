package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Remove duplicates) Write a method that removes the duplicate elements from an array list of integers using the following header:
 * 		public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers separated by exactly one space.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Enter ten integers : ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		
		removeDuplicate(list);
		System.out.println("The distinct integers are " + list);
		
		input.close();
	}
	
	public static void removeDuplicate(ArrayList<Integer> list){
		for (int i = 0; i < list.size() -1 ; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(j) == list.get(i)){
					list.remove(j);
				}
			}
		}
	}
}
