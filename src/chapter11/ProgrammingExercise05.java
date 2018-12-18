package chapter11;
import Classes.Course;
/**
 * (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList to replace an array to store students. 
 * Draw the new UML diagram for the class. You should not change the original contract of the Course class (i.e., the definition of the constructors and methods should not be changed, 
 * but the private members may be changed.)
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise05 {

	public static void main(String[] args) {
		String[] students ;
		Course c = new Course("Math");
		
		System.out.println("added ali..");
		c.addStudent("ali");
		System.out.println("added veli..");
		c.addStudent("veli");
		System.out.println("course name is " + c.getCourseName());
		students = c.getStudents();
		System.out.print("students are ");
		printArray(students);
		
		System.out.println("clearing..."); 
		c.clear();
		System.out.println("after cleared list , number of student is " + c.getNumberOfStudents());
		
	}
	
	private static void printArray(String[] students) {
		if (students.length == 0) {
			System.out.println("There is no student");
		} else {
			for (int i = 0; i < students.length; i++) {
				System.out.print(students[i] + "  ");
			}
			System.out.println();
		}
	}
}
