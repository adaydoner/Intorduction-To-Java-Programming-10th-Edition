package chapter12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 * (Remove text) Write a program that removes all the occurrences of a specified string from a text file. 
 * For example, invoking java Exercise12_11 John filename removes the string John from the specified file. 
 * Your program should get the arguments from the command line.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise11 {
	public static void main(String[] args) {
		String removeText = args[0];
		String filePath = args[1];
		String readedLine = "";
		ArrayList<String> lines = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			while ((readedLine = br.readLine()) != null) {
				if (readedLine.contains(removeText)) {
					readedLine = removeText(readedLine, removeText);
				}
				lines.add(readedLine);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		lines.trimToSize();
		updateFile(filePath,lines);
		System.out.println("its over.");
	}

	private static void updateFile(String filePath, ArrayList<String> lines) {
		try{
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)));
		for (int i = 0; i < lines.size(); i++) {
			if(lines.get(i).isEmpty()){
				continue;
			}
			bw.append(lines.get(i) + System.lineSeparator());
		}
		bw.close();
		} catch (Exception e){
			System.out.println("error is occured.");
		}
	}

	private static String removeText(String readedLine, String removeText) {
		char[] readedCharLine = readedLine.toCharArray();
		for (int i = 0; i < readedLine.length(); i++) {
			if(readedLine.charAt(i) == removeText.charAt(0)){
				for (int j = 0; j < removeText.length(); j++) {
					readedCharLine[i + j] = ' ';
				}
				return String.valueOf(readedCharLine).trim();
			}
		}
		return readedLine;
	}
}
