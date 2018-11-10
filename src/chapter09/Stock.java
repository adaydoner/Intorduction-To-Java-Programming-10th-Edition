// This class created for Chapter09.ProgrammingExercise02
package chapter09;

public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	Stock(String symbolValue, String nameValue) {
		symbol = symbolValue;
		name = nameValue;
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
