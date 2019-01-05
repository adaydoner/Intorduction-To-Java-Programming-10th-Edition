package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * (Reformat Java source code) Write a program that converts the Java source code from the next-line brace style to the end-of-line brace style. 
 * For example, the following Java source in (a) uses the next-line brace style. 
 * Your program converts it to the end-of-line brace style in (b).
 * 
 * Your program can be invoked from the command line with the Java sourcecode file as the argument. 
 * It converts the Java source code to a new format. For example, the following command converts the Java source-code file Test.java to the end-of-line brace style.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise12 {
	public static void main(String[] args) {
		Scanner input = null;
		StringBuilder buffer = new StringBuilder();
		File filename = new File(args[0]);
		
		if (args.length != 1) {
			System.out.println("Usage: java Chapter_10.Exercise_12 C:\\Users\\Ali\\Desktop\\javaRem.txt");
			System.exit(1);
		}
		
		if (!filename.exists()) {
			System.out.println(filename + " does not exist.");
			System.exit(2);
		}
		try {
			input = new Scanner(filename);
			while (input.hasNext()) {
				String s = input.nextLine();
				if (s.contains("{")) {
					buffer.append(" {");
				} else {
					buffer.append("\n" + s);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}

		try {
			PrintWriter output = new PrintWriter(filename);
			output.write(buffer.toString());
			output.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(buffer);
	}
}