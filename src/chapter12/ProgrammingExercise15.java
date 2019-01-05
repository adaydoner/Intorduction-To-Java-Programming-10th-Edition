package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * (Write/read data) Write a program to create a file named Exercise12_15.txt if it does not exist. 
 * Write 100 integers created randomly into the file using text I/O. Integers are separated by spaces in the file. 
 * Read the data back from the file and display the data in increasing order.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise15 {
	public static void main(String[] args) {
		Scanner input = null;
		File file = new File("C:\\Users\\Ali\\Desktop\\numbers.txt");
		PrintStream output = null;
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			output = new PrintStream(file);
			putRandomNumbersInTxtFile(file,output);
			output.close();
			input = new Scanner(file);
			readIntegerIncreasingOrder(input,file);
			input.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			output.close();
			input.close();
		}
		
	}

	private static void readIntegerIncreasingOrder(Scanner input, File file) {
		ArrayList<Integer> numbers = new ArrayList<>();
		while(input.hasNextInt()){
			numbers.add(input.nextInt());
		}
		Collections.sort(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			System.out.printf("%4d", numbers.get(i));
			if((i + 1) % 10 == 0){
				System.out.println();
			}
		}
	}

	private static void putRandomNumbersInTxtFile(File file, PrintStream output) {
		int count = 0;
		while(count < 100) {
			output.print((int)(Math.random() * 1000) + " ");
			count++;
		}
	}
}
