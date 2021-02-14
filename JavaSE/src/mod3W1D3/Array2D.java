package mod3W1D3;

import java.util.Scanner;

public class Array2D {


	public static void main(String[] args) {
		String [][] studentList = {{"Nithya","42","PG" }, {"Kumar","48","PG" }};
		
		for (String[] strings : studentList) {
			for ( String s : strings ) {
				System.out.println(s);
			}
		}
		int [][] arr = new int [10][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter columns");
		int columns = sc.nextInt();
		
		System.out.println("Enter the value one by one");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing the array values");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				System.out.println(arr[i][j]);
			}
		}
		int rowSum = 0;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				rowSum = rowSum + arr[i][j];
				
			}
			System.out.println("Sum of the rows "+rowSum);
			rowSum=0;
		}
		
		
				
	}

}
