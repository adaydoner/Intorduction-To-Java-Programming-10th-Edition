package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Maximum element in ArrayList) Write the following method that returns the maximum value in an ArrayList of integers. 
 * The method returns null if the list is null or the list size is 0.
 * 
 * 		public static Integer max(ArrayList<Integer> list)
 * 
 * Write a test program that prompts the user to enter a sequence of numbers ending with 0, and invokes this method to return the largest number in the input.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<>();
		
		System.out.println("Enter a sequence of numbers ending with 0");
		
		while(true) {
			intList.add(input.nextInt());
			if(intList.get(intList.size() - 1) == 0){
				break;
			}
		}
		if(max(intList) == null){
			System.out.println("list is empty.");
		} else {
			System.out.println("Largest number in list is " + max(intList));
		}
		input.close();
	}
	
	public static Integer max(ArrayList<Integer> list){
		int max = 0;
		if(list.get(0) == 0){
			return null;
		}
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) > max){
				max = list.get(i); 
			}
		}
		return max;
	}
}
