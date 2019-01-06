/*
 * (Game: hangman) Write a hangman game that randomly generates a word and
 * prompts the user to guess one letter at a time, as shown in the sample run. Each
 * letter in the word is displayed as an asterisk. When the user makes a correct guess, the actual letter is then displayed.
 * When the user finishes a word, display the number of misses and ask the user whether to continue to play with another word.
 * Declare an array to store words, as follows 
 * 		String[] words = {"write", "that", ...};
 */
package chapter07;

import java.util.Scanner;

public class ProgrammingExercise35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char isGameOn = 'y';
		while (isGameOn == 'y') {
			String[] words = { "enthusiastic", "programmer", "library", "amusement", "malware", "toxic", "individually", "patriot" };
			String randomWord = words[(int) (Math.random() * words.length)];
			char[] guessedChars = new char[30];
			int guessedCharWriter = 0;
			int wrongAnswer = 0;
			boolean gameResult = false;
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
				if(codedStringInArray[i] == guessedChars[j]) {
					codedString = codedString + codedStringInArray[i];
					correctChar = true;
					break;
				}
			}
			if(!correctChar) {
				counter++;
			}
		}
		if(counter == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public static boolean guessedCharContainNextGuess(char[] guessedChars, char c) {
		int counter = 0;
		for (int i = 0; i < guessedChars.length; i++) {
			if(guessedChars[i] == c) {
				counter++;
			}
		}
		if(counter > 1) {
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
				if(codedStringInArray[i] == guessedChars[j]) {
					codedString = codedString + codedStringInArray[i];
					correctChar = true;
					break;
				}
			}
			if(!correctChar) {
				codedString = codedString + "*";
			}
		}
		
		return codedString;
	}
}
