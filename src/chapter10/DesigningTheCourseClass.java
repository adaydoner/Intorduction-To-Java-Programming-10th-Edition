// 10.5 case study designing the course class
package chapter10;


public class DesigningTheCourseClass {
	public static void main(String[] args) {
		String[] students1;
		String[] students2;
//******************************************************************************************************************
		Course course1 = new Course("Data structures");
		Course course2 = new Course("Database systems");
//******************************************************************************************************************
		course1.addStudent("Ali");
		course1.addStudent("Chelsea");
//******************************************************************************************************************
		course2.addStudent("Bianca");
		course2.addStudent("Stephanie");
		course2.addStudent("Veli");
//******************************************************************************************************************
		System.out.println("Number of students in course 1 : " + course1.getNumberOfStudents());
		students1 = course1.getStudents();
		printArray(students1);
//******************************************************************************************************************
		System.out.println("Number of students in course 2 : " + course2.getNumberOfStudents());
		students2 = course2.getStudents();
		printArray(students2);
//******************************************************************************************************************
		course1.dropStudent("Ali");
		System.out.println("Number of students in course 1 : " + course1.getNumberOfStudents());
		students1 = course1.getStudents();
		printArray(students1);
//******************************************************************************************************************
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

class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void addStudent(String student) {
		// dynamic way to add student into String array
		if (students == null) {
			numberOfStudents++;
			students = new String[numberOfStudents];
			students[0] = student;
		} else {
			String[] students2 = new String[students.length];
			System.arraycopy(students, 0, students2, 0, students.length);
			students = new String[students2.length + 1];
			System.arraycopy(students2, 0, students, 0, students2.length);
			students[numberOfStudents] = student;
			numberOfStudents++;
		}
	}

	public void dropStudent(String student) {
		// dynamic way to drop a student from String array
		for (int i = 0; i < students.length; i++) {
			if (students[i] == student) {
				String[] students2 = new String[students.length - 1];
				System.arraycopy(students, 0, students2, 0, i);
				System.arraycopy(students, i + 1, students2, i, students2.length - i);
				numberOfStudents--;
				students = students2;
			}
		}
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
}