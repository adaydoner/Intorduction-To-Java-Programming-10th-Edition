package Classes;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/**
	 * Construct a loan with specified annual interest rate, number of years,
	 * and loan amount
	 * 
	 * @param annualInterestRate
	 * @param numberOfYears
	 * @param loanAmount
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException {
		if(loanAmount <= 0 || annualInterestRate <= 0 || numberOfYears <= 0 ){
			throw new IllegalArgumentException("any of constructor's variable cant be less than or equal to zero.");
		}
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Find total payment */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	@Override
	public String toString () {
		return "For " + loanAmount + " loan amount , \nYou need to pay " + getMonthlyPayment() + " for each month to finish " + getTotalPayment() + " total payment.";
	}
	
	/*
	 * getters and setters
	 */

	/** Return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/** Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
		if(annualInterestRate <= 0){
			throw new IllegalArgumentException("annual interest rate cant be less than or equal to zero.");
		} else {
			this.annualInterestRate = annualInterestRate;
		}
	}

	/** Return numberOfYears */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
		if(numberOfYears <= 0){
			throw new IllegalArgumentException("number of year is cant be less than or equal to zero.");
		} else {
			this.numberOfYears = numberOfYears;
		}
	}

	/** Return loanAmount */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
		if(loanAmount <= 0 ){
			throw new IllegalArgumentException("loan amount cant be less than or equal to zero.");
		} else {
			this.loanAmount = loanAmount;
		}
	}

	/** Return loan date */
	public java.util.Date getLoanDate() {
		return loanDate;
	}
}