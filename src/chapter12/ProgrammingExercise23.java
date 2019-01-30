package chapter12;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * (Process scores in a text file on the Web) Suppose that the text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number of scores. 
 * Write a program that reads the scores from the file and displays their total and average. Scores are separated by blanks.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise23 {
	public static void main(String[] args) {
		int total = 0;
		int counter = 0;
		Scanner input = null;
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			input = new Scanner(url.openStream());
			while(input.hasNextInt()){
				total += input.nextInt();
				counter++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		
		
		System.out.println("Total of scores : " + total);
		System.out.println("Average of scores : " + total / counter);
	}
}
