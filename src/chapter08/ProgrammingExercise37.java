/*
 * (Guess the capitals) Write a program that repeatedly prompts the user to enter a capital for a state.
 *  Upon receiving the user input, the program reports whether the answer is correct. 
 *  Assume that 50 states and their capitals are stored in a twodimensional array. 
 *  The program prompts the user to answer all states’ capitals and displays the total correct count. 
 *  The user’s answer is not case-sensitive.
 */
package chapter08;

import java.util.Scanner;

public class ProgrammingExercise37 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String[][] capitals = {{"Alabama","Montgomery"},
				{"Montana","Helena"},
				{"Alaska","Juneau"},
				{"Nebraska","Lincoln"},
				{"Arizona","Phoenix"},
				{"Nevada","Carson City"},
				{"Arkansas","Little Rock"},
				{"New Hampshire","Concord"},
				{"California","Sacramento"},
				{"New Jersey","Trenton"},
				{"Colorado","Denver"},
				{"New Mexico","Santa Fe"},
				{"Connecticut","Hartford"},
				{"New York","Albany"},
				{"Delaware","Dover"},
				{"North Carolina","Raleigh"},
				{"Florida","Tallahassee "},
				{"North Dakota","Bismarck"},
				{"Georgia","Atlanta"},
				{"Ohio","Columbus"},
				{"Hawaii","Honolulu"},
				{"Oklahoma","Oklahoma City"},
				{"Idaho","Boise"},
				{"Oregon","Salem"},
				{"Illinois","Springfield"},
				{"Pennsylvania","Harrisburg"},
				{"Indiana","Indianapolis"},
				{"Rhode Island","Providence"},
				{"Iowa","Des Moines"},
				{"South Carolina","Columbia"},
				{"Kansas","Topeka"},
				{"South Dakota","Pierre"},
				{"Kentucky","Frankfort"},
				{"Tennessee","Nashville"},
				{"Louisiana","Baton Rouge"},
				{"Texas","Austin"},
				{"Maine","Augusta"},
				{"Utah","Salt Lake City"},
				{"Maryland","Annapolis"},
				{"Vermont","Montpelier"},
				{"Massachusetts","Boston"},
				{"Virginia","Richmond"},
				{"Michigan","Lansing"},
				{"Washington","Olympia"},
				{"Minnesota","St. Paul"},
				{"West Virginia","Charleston"},
				{"Mississippi","Jackson"},
				{"Wisconsin","Madison"},
				{"Missouri","Jefferson City"},
				{"Wyoming","Cheyenne"}};

		askCapitalsToUser(capitals);
	}

	public static void askCapitalsToUser(String[][] capitals) {
		mixArray(capitals);
		String answer;
		int counter = 0;
		int correctAnswer = 0;
		while (counter < capitals.length) {
			System.out.printf("What is the capital of %s ? ", capitals[counter][0]);
			answer = input.nextLine();
			String rightAnswer = capitals[counter][1].toUpperCase();
			answer = answer.toUpperCase();
			if(answer.equals(rightAnswer)) {
				correctAnswer++;
				System.out.println("Your answer is correct");
			} else {
				System.out.printf("The correct answer should be %s\n",capitals[counter][1]);
			}
			counter++;
		}
		System.out.println("\nThe correct count is " + correctAnswer);
	}

	public static void mixArray(String[][] capitals) {
		for (int i = 0; i < capitals.length; i++) {
			int randomIndex = (int)(Math.random() * capitals.length);
			String[] temp = capitals[i];
			capitals[i] = capitals[randomIndex];
			capitals[randomIndex] = temp;
		}
	}
}
