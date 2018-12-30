package chapter12;

import java.util.Scanner;

/**
 * (NumberFormatException) Write the bin2Dec(String binaryString) method to convert a binary string into a decimal number. 
 * Implement the bin2Dec method to throw a NumberFormatException if the string is not a binary string.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binary = "";
		int number ;
		System.out.print("Enter a binary string : ");
		binary = input.nextLine();
		
		try{
			number = bin2Dec(binary);
			System.out.println("\""+binary + "\"" +" is equal to " + number);
		} catch (NumberFormatException nfe){
			System.out.println(nfe.getMessage());
			nfe.printStackTrace();
			
		}
		input.close();
	}
	
	public static int bin2Dec (String binary) throws NumberFormatException{
		int num = 0;
		for (int i = binary.length() - 1, pow = 0; i >= 0 ; i--,pow++) {
			if(binary.charAt(i) != '0' && binary.charAt(i) != '1'){
				throw new NumberFormatException("invalid binary string..");
			}
			num += ((binary.charAt(i) - '0') * (int)(Math.pow(2, pow)));
		}
		return num;
	}
}
