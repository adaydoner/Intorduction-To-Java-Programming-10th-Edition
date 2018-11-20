package Classes;

public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	private static final double FEET_TO_CENTIMETER = 30.48;
	private static final double INCHES_TO_CENTIMETER = 2.54;
	

	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	
	public BMI(String name, int age, double weight, double feet, double inches) {
		this(name,age,weight,(feet * FEET_TO_CENTIMETER + inches * INCHES_TO_CENTIMETER));
	}
	
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public double getBMI() {
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
	
	/*
	 * getters and setters
	 */
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
}