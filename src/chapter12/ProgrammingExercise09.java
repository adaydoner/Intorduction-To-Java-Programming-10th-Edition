package chapter12;
import Classes.BinaryFormatException;
import java.util.Scanner;

/**
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method to throw a BinaryFormatException if the string is not a binary string. 
 * Define a custom exception called BinaryFormatException. 
 * Implement the bin2Dec method to throw a BinaryFormatException if the string is not a binary string.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binary = "";
		int number;
		System.out.print("Enter a binary string : ");
		binary = input.nextLine();

		try {
			number = bin2Dec(binary);
			System.out.println("\""+binary + "\"" +" is equal to " + number);
		} catch (BinaryFormatException bfe) {
			System.out.println(bfe.getMsg());
			bfe.printStackTrace();
		}
		input.close();
	}

	public static int bin2Dec(String binary) throws BinaryFormatException {
		int num = 0;
		for (int i = binary.length() - 1, pow = 0; i >= 0; i--, pow++) {
			if (binary.charAt(i) != '0' && binary.charAt(i) != '1') {
				throw new BinaryFormatException("invalid binary string..");
			}
			num += ((binary.charAt(i) - '0') * (int) (Math.pow(2, pow)));
		}
		return num;
	}
}
