package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Data sorted?) Write a program that reads the strings from file SortedStrings.txt and reports whether the strings in the files are stored in increasing order.
 * If the strings are not sorted in the file, displays the first two strings that are out of the order.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise21 {
	public static void main(String[] args) {
		if(args[0] == null || args[0] == ""){
			System.out.println("Invalid input. Usage : java Exercise12_20 SortedStrings.txt");
			System.exit(0);
		}
		File file = new File(args[0]);
		if(!file.exists() || !file.canRead() || !file.isFile()){
			System.out.println(file + " does not exists or cant readed");
			System.exit(1);
		}
		ArrayList<String> fileContent = new ArrayList<>();
		fileContent = getFileContent(file);
		processContent(fileContent);
	}

	private static void processContent(ArrayList<String> fileContent) {
		for (int i = 0; i < fileContent.size() - 1; i++) {
			if(!isStringIncreased(fileContent.get(i), fileContent.get(i + 1))){
				return;
			}
		}
		System.out.println("Strings are sorted in the file.");
	}

	private static boolean isStringIncreased(String string, String string2) {
		int length = string.length() < string2.length() ? string.length() : string2.length();
		for (int i = 0; i < length; i++) {
			if(string.toLowerCase().charAt(i) > string2.toLowerCase().charAt(i)){
				System.out.println(string + " and " + string2 + " are out of order.");
				return false;
			} else if (string.toLowerCase().charAt(i) < string2.toLowerCase().charAt(i)) {
				return true;
			}
		}
		return true;
	}

	private static ArrayList<String> getFileContent(File file) {
		Scanner input = null;
		ArrayList<String> fileContent = new ArrayList<>();
		try {
			input = new Scanner(file);
			while(true){
				String readedLine;
				try {
					readedLine = input.next();
				} catch (Exception e){
					break;
				}
				fileContent.add(readedLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		return fileContent;
	}
}
