package chapter11;
import java.util.ArrayList;
import java.util.Date;
import Classes.Loan;
import chapter11.samples.*;
/**
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan object, a Date object, a string, and a Circle object to the list, and use a loop 
 * to display all the elements in the list by invoking the object’s toString() method.
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise06 {

	public static void main(String[] args) {
		ArrayList<Loan> loanList = new ArrayList<>();
		ArrayList<Date> dateList = new ArrayList<>();
		ArrayList<CircleFromSimpleGeometricObject> circleList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			loanList.add(new Loan(i + 1, i + 5, i * 1000 + 1));
			circleList.add(new CircleFromSimpleGeometricObject(i));
			dateList.add(new Date());
		}

		System.out.println("Loan List ...");
		for (int i = 0; i < loanList.size(); i++) {
			System.out.println(loanList.get(i).toString());
		}

		System.out.println("Circle List ...");
		for (int i = 0; i < circleList.size(); i++) {
			System.out.println(circleList.get(i).toString());
		}

		System.out.println("Date List ...");
		for (int i = 0; i < dateList.size(); i++) {
			System.out.println(dateList.get(i).toString());
		}
	}
}
