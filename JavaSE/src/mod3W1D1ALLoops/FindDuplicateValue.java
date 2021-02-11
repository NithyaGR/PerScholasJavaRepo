package mod3W1D1ALLoops;

import java.util.Scanner;

public class FindDuplicateValue {
public static int charCount(char c, String s) {
	int count =0;
	for(int i=0; i<s.length(); i++) {
		if(c == s.charAt(i)) {
			count++;
		}
	}
	
	return count++;
}
	public static void main(String[] args) {
	
//		Scanner scanner = new Scanner(System.in);
//		String myString = scanner.next();
		String myString = "sunsweet";
		/*
		 * int count = 1; char temp; for(int i=0; i<myString.length(); i++) {
		 * System.out.println("checking i : "+myString.charAt(i)); for(int j=i+1;
		 * j<myString.length(); j++) {
		 * System.out.println("checking :j "+myString.charAt(j)); if(myString.charAt(j)
		 * == myString.charAt(i)) { temp = myString.charAt(j); if (myString.charAt(i) !=
		 * temp) {count++;}
		 * 
		 * if(count>1) {
		 * 
		 * System.out.println(myString.charAt(i) +" is found "+count+" times ");
		 * 
		 * } }
		 * 
		 * }
		 * 
		 * }
		 */
		
		for(int i=0; i<myString.length(); i++) {
			char charToSearch = myString.charAt(i);
			myString = myString.substring(i);
			System.out.println("Count of the char "+charToSearch+" is :"+FindDuplicateValue.charCount(charToSearch,myString));
		}
		
		
		}
}
