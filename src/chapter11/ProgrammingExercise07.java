package chapter11;

import java.util.ArrayList;

/**
 * (Shuffle ArrayList) Write the following method that shuffles the elements in an ArrayList of integers. public static void shuffle(ArrayList<Integer> list)
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise07 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			intList.add(i);
		}
		printList(intList);
		
		shuffle(intList);
		System.out.println("shuffled");
		
		printList(intList);
		
		
	}

	private static void printList(ArrayList<Integer> intList) {
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}
	
	public static void shuffle(ArrayList<Integer> list){
		for (int i = 0; i < list.size(); i++) {
			int randomIndex = (int)(Math.random() * list.size());
			int temp = list.get(i);
			list.set(i, list.get(randomIndex));
			list.set(randomIndex, temp);
		}
	}
}
