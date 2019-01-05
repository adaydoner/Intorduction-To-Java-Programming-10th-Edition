package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * (Count characters, words, and lines in a file) Write a program that will count the number of characters, words, and lines in a file. 
 * Words are separated by whitespace characters.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise13 {
	public static void main(String[] args) {
		Scanner input = null;
		File file = new File(args[0]);
		
		if(args[0] == ""){
			System.out.println("Invalid input.");
			System.out.println("Usage: java Chapter_10.Exercise_12 C:\\Users\\Ali\\Desktop\\javaRem.txt");
			System.exit(0);
		}
		
		if(!file.exists()){
			System.out.println(file + "does not exists.");
			System.exit(0);
		}
		
		try {
			input = new Scanner(file);
			System.out.println("Characters : " + countOfCharacters(input,file));
			
			input = new Scanner(file);
			System.out.println("Words : " + countOfWords(input,file));
			
			input = new Scanner(file);
			System.out.println("Lines : " + countOfLines(input,file));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		
		
		
	}

	private static int countOfLines(Scanner input, File file) {
		int lines = 0;
		while(input.hasNextLine()){
			input.nextLine();
			lines++;
		}
		return lines;
	}

	private static int countOfWords(Scanner input, File file) {
		int words = 0;
		while(input.hasNext()){
			input.next();
			words++;
		}
		return words;
	}

	private static int countOfCharacters(Scanner input, File file) {
		int characters = 0;
		while(input.hasNext()){
			String word = input.next();
			int index = 0;
			while(index <= word.length()){
				index++;
				characters++;
			}
		}
		return characters;
	}
}
