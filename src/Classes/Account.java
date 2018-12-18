package Classes;
/**
 * initialized with conditions that giving at Chapter09.PE.07
 * @author Ali Dogan Aydoner
 *
 */
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {
		this(0, 0);
	}
	public Account(int specifiedId, double specifiedBalance) {
		id = specifiedId;
		balance = specifiedBalance;
		dateCreated = new Date();
	}


	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount){
		balance += amount;
	}
	
	@Override
	public String toString() {
		return "ID : " + id + "\nAccount's balance : " + balance + "\nDate created : " + getDateCreated();
	}
	
	/**
	 * getters and setters
	 */

	public int getId() {
		return id;
	}

	public void setId(int specifiedId) {
		id = specifiedId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double specifiedBalance) {
		balance = specifiedBalance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double specifiedAnnualInterestRate) {
		annualInterestRate = specifiedAnnualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}
}
