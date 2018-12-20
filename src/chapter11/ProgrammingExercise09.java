package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix, prints the matrix, and finds the rows and columns with the most 1s. 
 * (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
 * @author Ali Dogan Aydoner
 *
 */
public class ProgrammingExercise09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arraySize;
		
		System.out.print("Enter the array size : ");
		arraySize = input.nextInt();
		
		int[][] matrice = new int[arraySize][arraySize];
		ArrayList<Integer> rows1sCounts = new ArrayList<>(arraySize);
		ArrayList<Integer> columns1sCounts = new ArrayList<>(arraySize);
		randomMatriceElements(matrice,rows1sCounts, columns1sCounts);
		
		getLargestRowIndexes(matrice,rows1sCounts);
		getLargestColumnIndexes(matrice,columns1sCounts);
		printMatrice(matrice);
		System.out.println("The largest row index : " + rows1sCounts);
		System.out.println("The largest column index : " + columns1sCounts);
		
		input.close();
	}


	private static void getLargestRowIndexes(int[][] matrice, ArrayList<Integer> row) {
		int largest = 0;
		for (int i = 0; i < matrice.length; i++) {
			int occurrence = 0;
			for (int j = 0; j < matrice[i].length; j++) {
				if(matrice[i][j] == 1){
					occurrence++;
				}
			}
			if(largest < occurrence){
				largest = occurrence;
				row.clear();
				row.add(i);
			} else if(largest == occurrence){
				row.add(i);
			}
		}
	}

	private static void getLargestColumnIndexes(int[][] matrice, ArrayList<Integer> column) {
		int largest = 0;
		for (int j = 0; j < matrice.length; j++) {
			int occurrence = 0;
			for (int i = 0; i < matrice[j].length; i++) {
				if(matrice[i][j] == 1){
					occurrence++;
				}
			}
			if(largest < occurrence){
				largest = occurrence;
				column.clear();
				column.add(j);
			} else if(largest == occurrence){
				column.add(j);
			}
		}
	}

	private static void printMatrice(int[][] matrice) {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				System.out.printf("%2d",matrice[i][j]);
			}
			System.out.println();
		}
	}

	private static void randomMatriceElements(int[][] matrice, ArrayList<Integer> rows1sCounts, ArrayList<Integer> columns1sCounts) {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				int randomNum = (int) (Math.random() * 2);
				matrice[i][j] = randomNum;
			}
		}
	}
}
