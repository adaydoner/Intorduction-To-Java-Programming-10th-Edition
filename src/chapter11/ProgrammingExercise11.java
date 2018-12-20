package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers: 
 * public static void sort(ArrayList<Integer> list) 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays them in increasing order.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five numbers : ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
		
		sort(list);
		
		System.out.println(list);
		
		input.close();
	}
	
	public static void sort(ArrayList<Integer> list){
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if(list.get(j) < list.get(i)){
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
