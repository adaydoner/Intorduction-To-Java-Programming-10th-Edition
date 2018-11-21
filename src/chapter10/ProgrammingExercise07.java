package chapter10;

import java.util.Scanner;
import Classes.Account;
/**
 * (Game: ATM machine) Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine. 
 * Create ten accounts in an array with id 0, 1, . . . , 9, and initial balance $100. 
 * The system prompts the user to enter an id. 
 * If the id is entered incorrectly, ask the user to enter a correct id. Once an id is accepted, the main menu is displayed as shown in the sample run. 
 * You can enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for depositing money, and 4 for exiting the main menu. Once you exit, the system will prompt for an id again. 
 * Thus, once the system starts, it will not stop.
 * 
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise07 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		createDefultObjects(accounts);
		while (true) {
			int id = -1;
			while (id < 0 || 9 < id) {
				System.out.print("Enter an id :");
				id = input.nextInt();
			}
			menuFor(accounts[id]);
		}
	}
	public static void menuFor(Account account) {
		int select = 0;
		while(select != 4){
			select = 0;
			System.out.println("\n\nMain Menu");
			System.out.println("1 : Check Balance");
			System.out.println("2 : Withdraw");
			System.out.println("3 : Deposit");
			System.out.println("4 : Exit");
			while (select < 1 || 4 < select) {
				System.out.print("Enter a choice : ");
				select = input.nextInt();
			}
			switch (select) {
			case 1: getBalance(account); break;
			case 2: withdrawMoney(account); break;
			case 3: depositMoney(account); break;
			case 4: System.out.println("\n\n");break;
			}
		}
	}
	public static void depositMoney(Account account) {
		double depositAmount = 0;
		System.out.print("Enter an amount to deposit :");
		depositAmount = input.nextDouble();
		account.deposit(depositAmount);
	}
	public static void getBalance(Account account) {
		System.out.println("The balance is " + account.getBalance());
	}
	public static void withdrawMoney(Account account) {
		double withdrawAmount = 0;
		System.out.println("Enter an amount to withdraw : ");
		withdrawAmount = input.nextDouble();
		account.withdraw(withdrawAmount);
	}
	private static void createDefultObjects(Account[] accounts) {
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100);
		}
	}
}
