package chapter12;
import Classes.Loan;
/**
 * (IllegalArgumentException) Modify the Loan class in Listing 10.2 to throw IllegalArgumentException if the loan amount, interest rate, or number of years is less than or equal to zero.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise04 {
	public static void main(String[] args) {
		try{
			// all of these would be cause an exception now.
			Loan loan = new Loan(0, 0, 0);
			loan.setAnnualInterestRate(0);
			loan.setLoanAmount(0);
			loan.setNumberOfYears(0);
		} catch (IllegalArgumentException exception){
			System.out.println(exception.getMessage());
			exception.printStackTrace();
		}
	}
}
