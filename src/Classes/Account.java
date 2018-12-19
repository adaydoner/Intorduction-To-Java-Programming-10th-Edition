package Classes;
/**
 * initialized with conditions that giving at Chapter09.PE.07
 * @author Ali Dogan Aydoner
 *
 */
import java.util.ArrayList;
import Classes.Transaction;
import java.util.Date;

public class Account {
	//Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts. 
	private int id;
	private String customerName;
	private double balance;
	private double annualInterestRate;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	private Date dateCreated;

	public Account() {
		this(0, 0);
	}

	public Account(String customerName, int id, double balance) {
		this(id,balance);
		this.customerName = customerName;
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}


	public double getMonthlyInterestRate() {
		return annualInterestRate / 12.0;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		transactions.add(new Transaction('W', amount, balance - amount));
	}
	public void deposit(double amount){
		transactions.add(new Transaction('D', amount, balance + amount));
	}
	
	@Override
	public String toString() {
		return "ID : " + id + "\nAccount's balance : " + balance + "\nDate created : " + getDateCreated();
	}
	
	public String summary(){
		return ("Holder name : " + customerName + "\nAnnual interest rate : " + annualInterestRate + "\nBalance : " + balance + "\nTRANSACTIONS\n" + getTransactions());
	}
	
	private String getTransactions() {
		String returnVal = "";
		for (int i = 0; i < transactions.size(); i++) {
			returnVal += transactions.get(i).toString() + "\n";
		}
		return returnVal;
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
