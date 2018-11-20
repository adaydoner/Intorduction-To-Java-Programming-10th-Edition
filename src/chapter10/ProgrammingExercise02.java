package chapter10;
/**
 * (The BMI class) Add the following new constructor in the BMI class:
 * Construct a BMI with the specified name, age, weight,feet, and inches
 * public BMI(String name, int age, double weight, double feet, double inches)
 * 
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise02 {

	public static void main(String[] args) {
		// BMI Class in chapter10.UseBMIClass
		BMI person = new BMI("Ali",25,70,5,9);
		System.out.printf("Ali's age : %d \nAli's weight : %.2f \nAli's height : %.2f \nBMI : %.2f \nStatus : %s\n",person.getAge(),person.getWeight(),person.getHeight(),person.getBMI(),person.getStatus());
	}
}