/*
 * (Generate random characters) Use the methods in RandomCharacter in Listing 
 * 6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
 */
package chapter06;

public class ProgrammingExercise38 {
	/** Generate a random character between ch1 and ch2 */
	  public static char getRandomCharacter(char ch1, char ch2) {
	    return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	  }

	  /** Generate a random uppercase letter */
	  public static char getRandomUpperCaseLetter() {
	    return getRandomCharacter('A', 'Z');
	  }

	  /** Generate a random digit character */
	  public static char getRandomDigitCharacter() {
	    return getRandomCharacter('0', '9');
	  }

	public static void main(String[] args) {
		int printCounter = 0;
		char upperCaseLetter;
		char singleDigit;
		for (int i = 0; i < 100; i++) {
			upperCaseLetter = getRandomUpperCaseLetter();
			printCounter++;
			System.out.printf("%2c",upperCaseLetter);
			if(printCounter % 10 == 0) System.out.println();
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 100; i++) {
			singleDigit = getRandomDigitCharacter();
			printCounter++;
			System.out.printf("%2c",singleDigit);
			if(printCounter % 10 == 0) System.out.println();
		}
	}

}
