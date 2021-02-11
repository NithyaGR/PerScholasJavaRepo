package mod3W1D1ALLoops;

import java.util.Scanner;

public class Add1To20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer to find sum");
		int number = sc.nextInt();
		int num = 1, sum =0;
		while(num <=number) {
			sum = sum+num;
			num++;
		}
		System.out.println("Sum of first "+number+" numbers is : "+sum);
	}

}
