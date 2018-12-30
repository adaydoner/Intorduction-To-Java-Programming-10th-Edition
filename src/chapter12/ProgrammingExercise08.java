package chapter12;
import java.util.Scanner;
import Classes.HexFormatException;
/**
 * (HexFormatException) Exercise 12.6 implements the hex2Dec method to throw a NumberFormatException if the string is not a hex string. 
 * Define a custom exception called HexFormatException. 
 * Implement the hex2Dec method to throw a HexFormatException if the string is not a hex string.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise08 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a string
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();

		try {
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		} catch (HexFormatException nfe) {
			System.out.println(nfe.getMsg());
			nfe.printStackTrace();
		}
	}

	public static int hexToDecimal(String hex) throws HexFormatException{
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}

		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) throws HexFormatException{
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		// if ch is '0', '1', ..., or '9'
		else if ('0' <= ch && ch <= '9'){ 
			return ch - '0';
		} else {
			throw new HexFormatException("input is not a valid hexadecimal number.");
		}
	}
}
