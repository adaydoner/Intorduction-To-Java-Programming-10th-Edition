package chapter10;
import Classes.Course;
/**
 * (The Course class) Revise the Course class as follows:
 * 		The array size is fixed in Listing 10.6. Improve it to automatically increase the array size by creating a new larger array and copying the contents of the current array to it.
 * 		Implement the dropStudent method.
 * 		Add a new method named clear() that removes all students from the course.
 * 
 * Write a test program that creates a course, adds three students, removes one, and displays the students in the course.
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise09 {

	public static void main(String[] args) {
		String[] mathStudents;
		String[] geoStudents;
		Course math = new Course("Mathematics");
		Course geo = new Course("Geometry");
		
		math.addStudent("Ali");System.out.println("  >> Student added.");
		math.addStudent("Rhonda");System.out.println("  >> Student added.");
		math.addStudent("Anna");System.out.println("  >> Student added.");
		
		System.out.println("Number of students in course 1 : " + math.getNumberOfStudents());
		mathStudents = math.getStudents();
		printArray(mathStudents);
		
		math.dropStudent("Rhonda");System.out.println("  >> Student removed.");
		System.out.println("Number of students in course 1 : " + math.getNumberOfStudents());
		mathStudents = math.getStudents();
		printArray(mathStudents);
		
		
		math.clear();System.out.println("  >> Clear method called.");
		System.out.println("Number of students in course 1 : " + math.getNumberOfStudents());
		mathStudents = math.getStudents();
		printArray(mathStudents);
	}
	private static void printArray(String[] students) {
		if (students == null) {
			System.out.println("There is no student");
		} else {
			for (int i = 0; i < students.length; i++) {
				System.out.print(students[i] + "  ");
			}
			System.out.println();
		}
	}
}
