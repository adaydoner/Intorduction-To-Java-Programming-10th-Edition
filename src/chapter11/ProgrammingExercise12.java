package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
 * 	public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.print("Enter 5 numbers : ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
		double sum = sum(list);
		System.out.println("sum of 5 number is " + sum);
		
	}
	
	public static double sum(ArrayList<Double> list){
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
}
