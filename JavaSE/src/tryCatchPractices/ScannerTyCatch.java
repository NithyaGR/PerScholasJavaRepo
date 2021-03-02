package tryCatchPractices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTyCatch {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		try {
		    
			System.out.println("Enter Your favorite number");
			int number = sc.nextInt();			
			System.out.println(number/num);
			System.out.println("Enter your name");
			String s = scan.nextLine();
			System.out.println(s);
		} catch(InputMismatchException e) {
			System.out.println("Exception occred: "+e.getMessage());
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException: "+ae.getStackTrace());
		} catch(Exception e){
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
			scan.close();
			System.out.println("This will execute no matter whether catch is executed or not");
		}
		
	}

}
