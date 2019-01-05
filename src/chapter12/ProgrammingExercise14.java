package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * (Process scores in a text file) Suppose that a text file contains an unspecified number of scores separated by blanks. 
 * Write a program that prompts the user to enter the file, reads the scores from the file, and displays their total and average.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise14 {
	public static void main(String[] args) {
		Scanner input = null;
		File file = new File(args[0]);
		int countOfNumbers = 0;
		double sum = 0;
		
		if(args[0] == ""){
			System.out.println("Invalid input");
			System.out.println("Usage : java Chapter_10.Exercise_12 C:\\Users\\Ali\\Desktop\\javaRem.txt");
		}
		if(!file.exists()){
			System.out.println(file + " does not exists.");
		}
		
		try{
			input = new Scanner(file);
			while(input.hasNextInt()){
				sum += input.nextInt();
				countOfNumbers++;
			}
			System.out.println("Total is " + sum + "\nAverage is " + sum / countOfNumbers);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		
		
	}
}
