package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *(Remove package statement) Suppose you have Java source files under the directories chapter1, chapter2, . . . , chapter34. 
 *Write a program to remove the statement package chapteri; in the first line for each Java source file under the directory chapteri. 
 *Suppose chapter1, chapter2, . . . , chapter34 are under the root directory srcRootDirectory. 
 *The root directory and chapteri directory may contain other folders and files. 
 *Use the following command to run the program:
 *		java Exercise12_20 srcRootDirectory
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise20 {
	public static void main(String[] args) {
		//String filePath = "C:\\Users\\Ali\\Desktop\\src";
		if(args[0] == ""){
			System.out.println("Invalid input. Usage : java Exercise12_20 srcRootDirectory");
			System.exit(0);
		}
		File file = new File(args[0]);
		removePackage(file);
		System.out.println("packages definitions removed.");
	}

	private static void removePackage(File file) {
		boolean dir = false;
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				removePackage(files[i]);
				dir = true;
			}
		}
		if (dir == false) {
			Scanner input = null;
			PrintStream output = null;
			File tempFile = new File("C:\\Users\\Ali\\temp.txt");
			try {
				input = new Scanner(file);
				output = new PrintStream(tempFile);
				while (input.hasNextLine()) {
					String readedLine = input.nextLine();
					if (readedLine.contains("package")) {
						continue;
					}
					output.println(readedLine);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				input.close();
				output.close();
			}
			file.delete();
			tempFile.renameTo(file);
		}
	}
}
