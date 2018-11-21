package Classes;

public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * add student into Course
	 * @param student
	 */
	public void addStudent(String student) {
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
	/**
	 * drop student from Course
	 * 
	 * @param student
	 */
	public void dropStudent(String student) {
		// dynamic way to drop a student from String array
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)) {
				String[] students2 = new String[students.length - 1];
				System.arraycopy(students, 0, students2, 0, i);
				System.arraycopy(students, i + 1, students2, i, students2.length - i);
				numberOfStudents--;
				students = students2;
			}
		}
	}
	
	/**
	 * This method would clear students for this course.
	 * Set number of students to 0.
	 */
	public void clear(){
		numberOfStudents = 0;
		students = new String[numberOfStudents];
	}

	/*
	 * getters and setters.
	 */
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}
}
