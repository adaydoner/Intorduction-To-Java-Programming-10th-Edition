package chapter12;
/**
 * (NumberFormatException) Listing 7.9, Calculator.java, is a simple commandline calculator. 
 * Note that the program terminates if any operand is nonnumeric. Write a program with an exception handler that deals with nonnumeric operands;
 * then write another program without using an exception handler to achieve the same objective. 
 * Your program should display a message that informs the user of the wrong operand type before exiting
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise01 {
	//Firt part of question.
	
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;
		int result2 = 0;

		result = exceptionHandler(args, result);
		result2 = withoutExceptionHandler(args, result2);

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result + " this line worked after handled runtime error.");
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result2 + " this line worked after handled runtime error.");
	}

	private static int withoutExceptionHandler(String[] args, int result) {
		if(!isNumeric(args[0]) || !isNumeric(args[2])){
			System.out.println("You typed a nonnumeric operand... Please dont do that (written from withoutExceptionHandler)");
			result = 0;
		} else {
			// Determine the operator
			switch (args[1].charAt(0)) {
			case '+':
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-':
				result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case '.':
				result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/':
				result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			}
		}
		return result;
	}

	private static boolean isNumeric(String string) {
		for (int i = 0; i < string.length(); i++) {
			if('0' < string.charAt(i) && string.charAt(i) < '9'){
				return true;
			}
		}
		return false;
	}

	private static int exceptionHandler(String[] args, int result) {
		// Determine the operator
		try {
			switch (args[1].charAt(0)) {
			case '+':
				result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-':
				result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case '.':
				result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/':
				result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			}
		} catch (NumberFormatException e) {
			System.out.println("You typed a nonnumeric operand... Please dont do that (written from exceptionHandler)");
			e.printStackTrace();
		}
		return result;
	}
}
