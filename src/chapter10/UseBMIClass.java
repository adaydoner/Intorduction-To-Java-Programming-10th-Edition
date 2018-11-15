/*
 * 	this exercise asked and explained at 10.3 Thinkin In Objects(pg.371)
 *  10.3 UseBMIClass.java 
 *  10.4 BMI.java 
 */
package chapter10;

public class UseBMIClass {
	public static void main(String[] args) {
		BMI person = new BMI("Ali",24,70,173);
		System.out.println("The BMI for " + person.getName() + " is " + person.getBMI() + " --> " + person.getStatus());
	}
}

class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getWeight(){
		return weight;
	}
	public double getHeight(){
		return height;
	}

	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public double getBMI() {
		// kg / boy * boy

		return (weight / Math.pow((height / 100.0), 2));
	}

	public String getStatus() {
		if (getBMI() < 18) {
			return "Zayif";
		} else if (getBMI() < 24.9) {
			return "Ideal";
		} else if (getBMI() < 29.9) {
			return "Kilolu";
		} else {
			return "Obez";
		}
	}
}
