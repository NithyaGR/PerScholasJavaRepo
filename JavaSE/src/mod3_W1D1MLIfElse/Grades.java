package mod3_W1D1MLIfElse;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your marks:.... ");
			int marks = scanner.nextInt();

			if(marks>=90 && marks<=100){
			  System.out.println("Grade A");
			}
			else if (marks>=80 && marks<90) {

				System.out.println("Grade B");

			} else if (marks>=70 && marks<80 ){
				System.out.println("Grade C");
			}
			else if (marks>=55 && marks<70 ){
				System.out.println("Grade D");
			}
			else if (marks>0 && marks<55){
				System.out.println("Grade F");
			}
			else {
				System.out.println("Please provide valid marks");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
