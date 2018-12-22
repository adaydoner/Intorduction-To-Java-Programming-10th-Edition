package chapter11;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user if an answer is entered again. 
 * Hint: use an array list to store answers
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise16 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> givenAnswers = new ArrayList<>();
		
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		System.out.print("What is " + number1 + " + " + number2 + " ? ");
		int answer = input.nextInt();
		givenAnswers.add(answer);
		
		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + " ? ");
			answer = input.nextInt();
			if(givenAnswers.contains(answer)){
				System.out.println("You answered " + answer + " already.");
			} else {
				givenAnswers.add(answer);
			}
		}

		System.out.println("You got it!");
		input.close();
	}
}
