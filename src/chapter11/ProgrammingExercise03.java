package chapter11;
import Classes.Account;
import Classes.SavingAccount;
import Classes.CheckingAccount;
/**
 * (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. 
 * An account has the properties account number, balance, annual interest rate, and date created, and methods to deposit and withdraw funds. 
 * Create two subclasses for checking and saving accounts. A checking account has an overdraft limit, but a savings account cannot be overdrawn. 
 * Draw the UML diagram for the classes and then implement them. 
 * Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise03 {

	public static void main(String[] args) {
		Account acc = new Account(1, 100);
		Account savingAcc = new SavingAccount(2, 200);
		Account checkingAcc = new CheckingAccount(3, 300);
		
		System.out.println(acc.toString());
		System.out.println(savingAcc.toString());
		System.out.println(checkingAcc.toString());
		System.out.println();

		System.out.println("Trying to withdraw from Account object");
		acc.withdraw(150);
		System.out.println(acc.toString() + "\n");

		System.out.println("Trying to withdraw from SavingAccount object");
		savingAcc.withdraw(250);
		System.out.println(savingAcc.toString() + "\n");

		System.out.println("Trying to withdraw from CheckingAccount object");
		checkingAcc.withdraw(1550);
		System.out.println(checkingAcc.toString() + "\n");

	}
}
