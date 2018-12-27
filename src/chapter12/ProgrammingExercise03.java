package chapter12;

import java.util.Scanner;

/**
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * 		Creates an array with 100 randomly chosen integers.
 * 		Prompts the user to enter the index of the array, then displays the corresponding element value. 
 * If the specified index is out of bounds, display the message Out of Bounds.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int ARRAY_SIZE = 100;
		int index;
		int[] numArray;
		
		numArray = createAnArrayWithRandomNumbers(ARRAY_SIZE);
		try{
			System.out.print("Enter an index : ");
			index = input.nextInt();
			System.out.println(index + ". index is : " + numArray[index]);
		} catch (ArrayIndexOutOfBoundsException be){
			System.out.println("Out of Bounds.");
		} catch (Exception e){
			System.out.println("Invalid Input.");
		}
		input.close();
	}

	private static int[] createAnArrayWithRandomNumbers(int size) {
		int[] array = new int[size];
		
		for (int i = 0; i < size; i++) {
			array[i] = (int)(Math.random() * 101);
		}
		return array;
	}
}
