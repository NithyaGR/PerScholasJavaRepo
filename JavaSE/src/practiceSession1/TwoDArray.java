package practiceSession1;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		/*
		 * int [] ids = new int[10];
		 * for loop or for each
		 */
		
		int [][] numbers = new int[10][10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter no of columns");
		int columns = scanner.nextInt();
		
		System.out.println("Enter the numbers one by one");
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				numbers[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
		int sumRows = 0; // 00, 01, 02 // 10, 11, 12
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				sumRows = sumRows + numbers[i][j];
			}
			System.out.println("rowSum "+sumRows);
			sumRows = 0;
		}
		
		int sumColumns = 0; // 00, 10, 01,11, 02,12
		for(int i=0; i<columns; i++) {
			for(int j=0; j<rows; j++) {
				sumColumns = sumColumns + numbers[j][i]; 
			}
			System.out.println("column sum "+sumColumns);
			sumColumns=0;
				
			}
		}
		
		
		

	}


