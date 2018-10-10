/*
 * (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are closed on the first day of school. 
 * As the students enter, the first student, denoted S1, opens every locker. 
 * Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. 
 * Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed). 
 * Student S4 begins with locker L4 and changes every fourth locker.
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.
 * After all the students have passed through the building and changed the lockers, which lockers are open? 
 * Write a program to find your answer and display all open locker numbers separated by exactly one space.
 * (Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open (true) or closed (false). Initially, all lockers are closed.)
 */
package chapter07;

public class ProgrammingExercise23 {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		makeAllLockersClose(lockers);
		for (int lineNumberOfStudent = 0; lineNumberOfStudent < lockers.length; lineNumberOfStudent++) {
			changeLockers(lockers,lineNumberOfStudent);
		}
		printOpenLockers(lockers);
	}

	public static void printOpenLockers(boolean[] lockers) {
		int counter = 0;
		for (int i = 0; i < lockers.length; i++) {
			if(lockers[i]) {
				System.out.printf("%d ",(i + 1));
				counter++;
			}
			if((counter + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}

	public static void changeLockers(boolean[] lockers, int lineNumberOfStudent) {
		for (int i = lineNumberOfStudent; i < lockers.length; i++) {
			if(i % (lineNumberOfStudent + 1) == 0) {
				if(lockers[i] == false) {
					lockers[i] = true;
				} else {
					lockers[i] = false;
				}
			}
		}
	}
	public static void makeAllLockersClose(boolean[] lockers) {
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = false;
		}
	}

}
