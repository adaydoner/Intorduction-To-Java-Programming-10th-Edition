// 10.5 case  study designing the course class
package chapter10;
import Classes.Course;

public class DesigningTheCourseClass {
	public static void main(String[] args) {
		String[] students1;
		String[] students2;
		// ******************************************************************************************************************
		Course course1 = new Course("Data structures");
		Course course2 = new Course("Database systems");
		// ******************************************************************************************************************
		course1.addStudent("Ali");
		course1.addStudent("Chelsea");
		// ******************************************************************************************************************
		course2.addStudent("Bianca");
		course2.addStudent("Stephanie");
		course2.addStudent("Veli");
		// ******************************************************************************************************************
		System.out.println("Number of students in course 1 : " + course1.getNumberOfStudents());
		students1 = course1.getStudents();
		printArray(students1);
		// ******************************************************************************************************************
		System.out.println("Number of students in course 2 : " + course2.getNumberOfStudents());
		students2 = course2.getStudents();
		printArray(students2);
		// ******************************************************************************************************************
		course1.dropStudent("Ali");
		System.out.println("Number of students in course 1 : " + course1.getNumberOfStudents());
		students1 = course1.getStudents();
		printArray(students1);
		// ******************************************************************************************************************
		course2.dropStudent("Stephanie");
		System.out.println("Number of students in course 2 : " + course2.getNumberOfStudents());
		students2 = course2.getStudents();
		printArray(students2);
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