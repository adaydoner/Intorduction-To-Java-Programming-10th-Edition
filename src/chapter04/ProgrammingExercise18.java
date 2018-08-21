/*
 * (Student major and status) Write a program that prompts the user to enter two
 * characters and displays the major and status represented in the characters. The first
 * character indicates the major and the second is number character 1, 2, 3, 4, which
 * indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
 * the following chracters are used to denote the majors:
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 */
package chapter04;

import java.util.Scanner;

public class ProgrammingExercise18 {

	public static String WhatMajor(char majors) {
		majors = Character.toUpperCase(majors);
		String stringMajors;
		switch(majors) {
		case 'M' : stringMajors = "Mathematics" ; break ;
		case 'C' : stringMajors = "Computer Science" ; break ;
		case 'I' : stringMajors = "Information Technology" ; break ;
		default : stringMajors = null ; break ;
		}
		return stringMajors;
	}

	public static String WhatStatus(char studentStatus) {
		String whatStatus;
		switch(studentStatus) {
		case '1' : whatStatus = "Freshman" ; break;
		case '2' : whatStatus = "Sophomore" ; break;
		case '3' : whatStatus = "Junior" ; break;
		case '4' : whatStatus = "Senior" ; break;
		default : whatStatus = null ; break;
		}
		return whatStatus;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString;
		String whatMajor;
		String whatStatus;
		System.out.print("Enter two characters : ");
		inputString = input.next();
		whatMajor = WhatMajor(inputString.charAt(0));
		whatStatus = WhatStatus(inputString.charAt(1));
		if(whatMajor == null && whatStatus == null) {
			System.out.println(inputString + " is an invalid input.");
		} else if (whatMajor == null) {
			System.out.println(inputString.charAt(0) + " is an invalid input.");
		} else if (whatStatus == null) {
			System.out.println(inputString.charAt(1) + " is an invalid input.");
		} else {
			System.out.printf("%s %s",whatMajor,whatStatus);
		}
		input.close();
	}
}
