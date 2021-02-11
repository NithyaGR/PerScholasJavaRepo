package mod3_W1D1MLIfElse;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		try (
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Time in 4 digit 24hrs format");
			int time = scanner.nextInt();

			if (time>=0500 && time<=1159){
			  System.out.println("Good Morning");
			}
			else if(time>=1200 && time<=1600){
				System.out.println("Good Afternoon");
			}
			else {
				System.out.println("Hi There!");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
