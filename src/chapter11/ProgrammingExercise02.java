package chapter11;

import Classes.*;

/**
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and email address. 
 * A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. 
 * An employee has an office, salary, and date hired. Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
 * A faculty member has office hours and a rank. 
 * A staff member has a title. Override the toString method in each class to display the class name and the person’s name.
 * Draw the UML diagram for the classes and implement them. Write a test program
 * that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
 * @author Ali Dogan Aydoner
 *
 */

public class ProgrammingExercise02 {

	public static void main(String[] args) {
		
		System.out.printf("%-40s%s%s\n","invoking Person's toString method ",": ",new Person().toString());
		System.out.printf("%-40s%s%s\n","invoking Student's toString method ",": ",new Student().toString());
		System.out.printf("%-40s%s%s\n","invoking Employee's toString method ",": ",new Employee().toString());
		System.out.printf("%-40s%s%s\n","invoking Faculty's toString method ",": ",new Faculty().toString());
		System.out.printf("%-40s%s%s\n","invoking Staff's toString method ",": ",new Staff().toString());
		
	}
}
