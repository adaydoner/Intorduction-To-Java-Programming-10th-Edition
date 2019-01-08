package chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * (Count words) Write a program that counts the number of words in President Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/Lincoln.txt.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise19 {
	public static void main(String[] args) {
		int wordCounter = 0;
		Scanner input = null;
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			input = new Scanner(url.openStream());
			while(input.hasNext()){
				input.next();
				wordCounter++;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		 
		System.out.println("number of words in specified url's : " + wordCounter);
	}
}
