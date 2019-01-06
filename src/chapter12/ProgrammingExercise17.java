package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Game: hangman) Rewrite Programming Exercise 7.35. The program reads the words stored in a text file named hangman.txt. Words are delimited by spaces.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise17 {
	public static void main(String[] args) {
		if(args[0] == ""){
			System.out.println("Invalid input. Usage : java chapter12.ProgrammingExercise17 word.txt");
		}
		File file = new File(args[0]);
		if(!file.exists()){
			System.out.println(file + " does not exists.");
			System.exit(0);
		}
		Scanner input = null;
		ArrayList<String> words = new ArrayList<>();
		
		try {
			input = new Scanner(file);
			while(input.hasNext()){
				words.add(input.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			input.close();
		}
		
		char isGameOn = 'y';
		while (isGameOn == 'y') {
			input = new Scanner(System.in);
			String randomWord = words.get((int) (Math.random() * words.size()));
			char[] guessedChars = new char[30];
			int guessedCharWriter = 0;
			int wrongAnswer = 0;
			boolean gameResult = false;
			System.out.println(randomWord);
			while (wrongAnswer <= 6) {
				System.out.print("(Guess) Enter a letter in word " + printCodedWord(randomWord, guessedChars) + " > ");
				guessedChars[guessedCharWriter] = input.nextLine().charAt(0);
				if (!randomWord.contains(String.valueOf(guessedChars[guessedCharWriter]))) { // if word doesnt contain guessed character , wrong answer counter would increase.
					wrongAnswer++;
					System.out.printf("%5s%c%s", " ", guessedChars[guessedCharWriter], " is not in the word\n");
				}
				if (guessedCharContainNextGuess(guessedChars, guessedChars[guessedCharWriter])) { // if guessed character is already written,wrong answer counter would increase.
					System.out.printf("%5s%c%s", " ", guessedChars[guessedCharWriter], " already tried.\n");
					wrongAnswer++;
				}
				if (isWordFounded(randomWord, guessedChars)) {
					gameResult = true;
					break;
				}
				guessedCharWriter++;

			}
			if (gameResult) {
				System.out.println("You won.");
			} else {
				System.out.println("You Lost..");
			}
			System.out.println("Do you want to guess another word? Enter y or n > ");
			isGameOn = input.nextLine().charAt(0);
		}
		input.close();
	
	}

	public static boolean isWordFounded(String randomWord, char[] guessedChars) {
		int counter = 0;
		char[] codedStringInArray = randomWord.toCharArray();
		String codedString = "";
		boolean correctChar;
		for (int i = 0; i < codedStringInArray.length; i++) {
			correctChar = false;
			for (int j = 0; j < guessedChars.length; j++) {
				if (codedStringInArray[i] == guessedChars[j]) {
					codedString = codedString + codedStringInArray[i];
					correctChar = true;
					break;
				}
			}
			if (!correctChar) {
				counter++;
			}
		}
		if (counter == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean guessedCharContainNextGuess(char[] guessedChars, char c) {
		int counter = 0;
		for (int i = 0; i < guessedChars.length; i++) {
			if (guessedChars[i] == c) {
				counter++;
			}
		}
		if (counter > 1) {
			return true;
		} else {
			return false;
		}
	}

	public static String printCodedWord(String randomWord, char[] guessedChars) {
		char[] codedStringInArray = randomWord.toCharArray();
		String codedString = "";
		boolean correctChar;
		for (int i = 0; i < codedStringInArray.length; i++) {
			correctChar = false;
			for (int j = 0; j < guessedChars.length; j++) {
				if (codedStringInArray[i] == guessedChars[j]) {
					codedString = codedString + codedStringInArray[i];
					correctChar = true;
					break;
				}
			}
			if (!correctChar) {
				codedString = codedString + "*";
			}
		}

		return codedString;
	}
}
