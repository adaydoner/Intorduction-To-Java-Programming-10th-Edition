package Classes;

import java.util.Date;

public class Transaction {
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(char type, double amount, double balance){
		this(type,amount,balance,"default description");
	}
	
	public Transaction (char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		date = new Date();
	}
	
	@Override
	public String toString() {
		return "Type : " + type + " Amount : " + amount + " New balance : " + balance + " " + description + " Date : " + date.toString();
	}
}
