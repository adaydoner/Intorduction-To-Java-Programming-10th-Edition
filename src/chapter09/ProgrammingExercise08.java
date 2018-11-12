/*
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * 		Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to denote the fan speed.
 * 		A private int data field named speed that specifies the speed of the fan (the default is SLOW).
 * 		A private boolean data field named on that specifies whether the fan is on (the default is false).
 * 		A private double data field named radius that specifies the radius of the fan (the default is 5).
 * 		A string data field named color that specifies the color of the fan (the default is blue).
 * 		The accessor and mutator methods for all four data fields.
 * 		A no-arg constructor that creates a default fan.
 * 		A method named toString() that returns a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in one combined string. 
 * 				If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.
 * Draw the UML diagram for the class and then implement the class. Write a test program that creates two Fan objects. 
 * Assign maximum speed, radius 10, color yellow, and turn it on to the first object. 
 * Assign medium speed, radius 5, color blue, and turn it off to the second object. Display the objects by invoking their toString method.
 */
package chapter09;

public class ProgrammingExercise08 {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		
		fan1.setSpeed("FAST");
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		fan2.setSpeed("MEDIUM");
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		
		System.out.println(fan1.toString());
		System.out.println("***************************");
		System.out.println(fan2.toString());

	}
}

class Fan {
	
	private static int SLOW = 1;
	private static int MEDIUM = 2;
	private static int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	Fan(){
		this.speed = SLOW;
		this.on = false;
		this.radius = 5;
		this.color = "blue";
	}
	
	public String toString(){
		if(on){
			return (speed + " " + color + " " + radius);
		} else {
			return (color + " " + radius + " fan is off");
		}
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(String speedVal){
		if(speedVal == "SLOW"){
			speed = SLOW;
		} else if(speedVal == "MEDIUM"){
			speed = MEDIUM;
		} else {
			speed = FAST;
		}
	}
	
	public boolean getOn(){
		return on;
	}
	public void setOn(boolean on){
		this.on = on;
	}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
}