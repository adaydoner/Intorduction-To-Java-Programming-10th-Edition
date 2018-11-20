/*
 * 	this exercise asked and explained at 10.3 Thinkin In Objects(pg.371)
 *  10.3 UseBMIClass.java 
 *  10.4 BMI.java 
 */
package chapter10;
import Classes.BMI;

public class UseBMIClass {
	public static void main(String[] args) {
		BMI person = new BMI("Ali",24,70,173);
		System.out.println("The BMI for " + person.getName() + " is " + person.getBMI() + " --> " + person.getStatus());
	}
}