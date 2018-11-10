/*
 * (The Stock class) Following the example of the Circle class in Section 9.2, design a class named Stock that contains:
 * 		A string data field named symbol for the stock’s symbol.
 * 		A string data field named name for the stock’s name.
 * 		A double data field named previousClosingPrice that stores the stock price for the previous day.
 * 		A double data field named currentPrice that stores the stock price for the current time.
 * 		A constructor that creates a stock with the specified symbol and name.
 * 		A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation, and the previous closing price of 34.5. 
 * Set a new current price to 34.35 and display the price-change percentage.
 */
package chapter09;

public class ProgrammingExercise02 {

	public static void main(String[] args) {
		// Test Stock Class
		Stock firstStock = new Stock("ORCL", "Oracle Corporation");
		firstStock.setPreviousClosingPrice(34.5);
		firstStock.setCurrentPrice(34.35);

		System.out.printf("%s %s %s %s%.2f", "price-change percentage is for", firstStock.getSymbol(), firstStock.getName(),"is %",firstStock.getChangePercent());

	}

}

class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	Stock(String symbolValue, String nameValue) {
		symbol = symbolValue;
		name = nameValue;
	}

	public void setSymbol(String newSymbolValue) {
		symbol = newSymbolValue;
	}
	public String getSymbol() {
		return symbol;
	}

	
	public void setName(String newNameValue) {
		name = newNameValue;
	}

	public String getName() {
		return name;
	}

	
	
	public void setCurrentPrice(double newCurrentPrice) {
		currentPrice = newCurrentPrice;
	}

	public void setPreviousClosingPrice(double newPreviousClosingPrice) {
		previousClosingPrice = newPreviousClosingPrice;
	}

	public double getChangePercent() {
		if (currentPrice > previousClosingPrice) {
			double increase = (currentPrice / previousClosingPrice) * 100;
			return (increase / currentPrice * 100);
		} else {
			double decrease = previousClosingPrice - currentPrice;
			return (decrease / previousClosingPrice * 100);
		}
	}

}
