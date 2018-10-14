/*
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all
 * employees are stored in a two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees. Write a program that displays
 * employees and their total hours in decreasing order of the total hours.
 */
package chapter08;

public class ProgrammingExercise04 {

	public static void main(String[] args) {
		int[][] employeesWorkHours = {
				{2,4,3,4,5,8,8}, // Employee0
				{7,3,4,3,3,4,4}, // Employee1
				{3,3,4,3,3,2,2}, // Employee2
				{9,3,4,7,3,4,1}, // Employee3
				{3,5,4,3,6,3,8}, // Employee4
				{3,4,4,6,3,4,4}, // Employee5
				{3,7,4,8,3,8,4}, // Employee6
				{6,3,5,9,2,7,9} // Employee7
		};
		String[] employeesNumber = {"Employee 0","Employee 1","Employee 2","Employee 3","Employee 4","Employee 5","Employee 6","Employee 7"};
		int[] employeesTotalHours = new int[employeesWorkHours.length];
		getTotalWorkHours(employeesWorkHours,employeesTotalHours);
		sortEmployeesByWorkHours(employeesTotalHours,employeesNumber);
		printEmployeesDecreasingOrderByTotalHours(employeesNumber,employeesTotalHours);
	}
	public static void printEmployeesDecreasingOrderByTotalHours(String[] employeesNumber, int[] employeesTotalHours) {
		for (int i = 0; i < employeesTotalHours.length; i++) {
			System.out.printf("%s%s%d\n",employeesNumber[i],"\'s total work hour is ",employeesTotalHours[i]);
		}
	}
	public static void sortEmployeesByWorkHours(int[] employeesTotalHours, String[] employeesNumber) {
		for (int i = 0; i < employeesTotalHours.length; i++) {
			for (int j = i + 1; j < employeesTotalHours.length; j++) {
				if(employeesTotalHours[j] > employeesTotalHours[i]) {
					int temp;
					temp = employeesTotalHours[i];
					employeesTotalHours[i] = employeesTotalHours[j];
					employeesTotalHours[j] = temp;
					String tempName;
					tempName = employeesNumber[i];
					employeesNumber[i] = employeesNumber[j];
					employeesNumber[j] = tempName;
				}
			}
		}
	}
	public static void getTotalWorkHours(int[][] employeesWorkHours,int[] totalWorkHours) {
		for (int i = 0; i < employeesWorkHours.length; i++) {
			for (int j = 0; j < employeesWorkHours[i].length; j++) {
				totalWorkHours[i] += employeesWorkHours[i][j];
			}
		}
	}
}
