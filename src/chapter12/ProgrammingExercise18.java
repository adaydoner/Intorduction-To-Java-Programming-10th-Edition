package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Add package statement) Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. 
 * Write a program to insert the statement package chapteri; as the first line for each Java source file under the directory chapteri. 
 * Suppose chapter1, chapter2, . . . , chapter34 are under the root directory srcRootDirectory. 
 * The root directory and chapteri directory may contain other folders and files. 
 * Use the following command to run the program:
 * 			java Exercise12_18 srcRootDirectory
 * @author Ali Dogan Aydoner
 *
 */

public class ProgrammingExercise18 {
	public static void main(String[] args) {
		if(args[0] == ""){
			System.out.println("Invalid input. Usage  java chapter12.ProgrammingExercise18 srcMainFile");
			System.exit(0);
		}
		File srcMainFile = new File(args[0]);

		if(!srcMainFile.isDirectory()){
			System.out.println(srcMainFile + " does not a valid directory");
		}
		if(!srcMainFile.exists()){
			System.out.println(srcMainFile  + " does not exists");
		}
		if(srcMainFile.listFiles() == null){
			System.out.println("no files found in " + srcMainFile);
		}
		
		File[] chapters = srcMainFile.listFiles();
		ArrayList<File[]> javaFiles = new ArrayList<>();
		for (int i = 0; i < chapters.length; i++) {
			javaFiles.add(chapters[i].listFiles());
		}
		
		for (int i = 0; i < javaFiles.size(); i++) {
			for (int j = 0; j < javaFiles.get(i).length; j++) {
				String chapterNo;
				if(i < 10){
					chapterNo = "0" + (i + 1);
				} else {
					chapterNo = "" + (i + 1);
				}
				updateFile(javaFiles.get(i)[j],chapters[i].getAbsolutePath(),chapterNo);
			}
		}
		System.out.println("packages definitions added.");
	}

	private static void updateFile(File file, String tempFilePath, String chapterNo) {
		boolean flag = false;
		Scanner input = null;
		PrintStream output = null;
		int lineCounter = 0;
		String addedString = "package chapter" + chapterNo + ";";
		File tempFile = new File(tempFilePath + "\\temp.txt");
		try {
			input = new Scanner(file);
			output = new PrintStream(tempFile);
			while(input.hasNextLine()){
				String s = input.nextLine();
				if(s.contains(addedString.substring(8, 17)) && lineCounter < 3){
					flag = true;
					break;
				}
				if(lineCounter == 0){
					output.println(addedString + System.lineSeparator() + s);
				} else {
					output.println(s);
				}
				lineCounter++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			input.close();
			output.close();
		}
		if(flag){
			tempFile.delete();
		} else {
			String oldFileAbsolutePath = file.getAbsolutePath();
			file.delete();
			tempFile.renameTo(new File(oldFileAbsolutePath));
		}
	}
}
