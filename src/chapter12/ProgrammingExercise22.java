package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

/**
// * (Replace text) Revise Programming Exercise 12.16 to replace a string in a file with a new string for all files in the specified directory using the command:
 * java Exercise12_22 dir oldString newString
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise22 {
	public static void main(String[] args) {
		
		if(args[0] == "" || args.length != 3){
			System.out.println("Invalid output. Usage : java chapter12.ProgrammingExercise16 dir oldString newString");
			System.exit(0);
		}
		File dir = new File(args[0]);
		if(!dir.exists() || !dir.isDirectory()){
			System.out.println(dir + " does not exists or not a directory.");
			System.exit(1);
		}
		
		String oldString = args[1];
		String newString = args[2];
		
		File[] fileList = dir.listFiles();
		if(fileList == null){
			System.out.println("no files in directory...");
		}
		
		for (File file : fileList) {
			if(file.isFile() && file.getName().contains(".txt")){
				replaceWords(file,oldString,newString);
			}
		}
		
		System.out.println("its over.");
	
	}

	private static void replaceWords(File file, String oldString, String newString) {
		String lineSeperator = System.lineSeparator();
		String buffer = "";
		
		try(Scanner input = new Scanner(file)){
			while(input.hasNext()){
				buffer += input.nextLine() + lineSeperator;
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		buffer  = buffer.replaceAll(oldString, newString);
		
		try(PrintWriter output = new PrintWriter(file)){
			output.write(buffer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
