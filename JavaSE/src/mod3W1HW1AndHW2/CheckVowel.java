package mod3W1HW1AndHW2;

import java.util.Scanner;

public class CheckVowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphabet");
		char anAlphabet = sc.next().charAt(0);
		if (anAlphabet == 'a' || anAlphabet == 'e' || anAlphabet == 'i' || anAlphabet == 'o' || anAlphabet == 'u')
		
			System.out.println("Entered value is a vowel");
		
		else
			System.out.println("IT's a consonant");

	}

}
