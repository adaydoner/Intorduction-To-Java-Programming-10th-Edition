package Classes;
/**
 * initialized with conditions that giving at Chapter10.PE.09 
 * updated with conditions that giving at Chapter11.PE.05
 * @author Ali Dogan Aydoner
 *
 */
import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList<String> students;

	public Course(String courseName) {
		students = new ArrayList<>();
		this.courseName = courseName;
	}
	/**
	 * add student into Course
	 * @param student
	 */
	public void addStudent(String student) {
		students.add(student);
	}
	/**
	 * drop student from Course
	 * 
	 * @param student
	 */
	public void dropStudent(String student) {
		students.remove(student);
	}
	
	/**
	 * This method would clear students for this course.
	 */
	public void clear(){
		students.clear();
	}

	/*
	 * getters and setters.
	 */
	public String[] getStudents() {
		String[] s = new String[students.size()];
		for (int i = 0; i < s.length; i++) {
			s[i] = students.get(i);
		}
		
		return s;
	}

	public int getNumberOfStudents() {
		return students.size();
	}

	public String getCourseName() {
		return courseName;
	}
}
