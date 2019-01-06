package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * (Replace text) Listing 12.16, ReplaceText.java, gives a program that replaces text in a source file and saves the change into a new file. 
 * Revise the program to save the change into the original file. For example, 
 * 		invoking java Exercise12_16 file oldString newString
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise16 {
	public static void main(String[] args) {
		Scanner input = null;
		PrintStream output = null;
		
		if(args[0] == "" || args.length != 3){
			System.out.println("Invalid output. Usage : java chapter12.ProgrammingExercise16 file oldString newString");
			System.exit(0);
		}
		
		File file = new File(args[0]);
		if(!file.exists()){
			System.out.println(file + " does not exists.");
			System.exit(1);
		}
		
		try {
			input = new Scanner(file);
			output = new PrintStream(new File("C:\\Users\\Ali\\Desktop\\temp.txt"));
			while(input.hasNextLine()){
				String line = input.nextLine().replaceAll(args[1], args[2]);
				output.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally{
			input.close();
			output.close();
		}
		
		new File(args[0]).delete();
		new File("C:\\Users\\Ali\\Desktop\\temp.txt").renameTo(new File(args[0]));
		
		System.out.println("its over.");
	}
}
