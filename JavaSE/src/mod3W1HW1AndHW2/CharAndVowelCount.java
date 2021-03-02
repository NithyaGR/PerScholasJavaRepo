package mod3W1HW1Parrot;

public class CharAndVowelCount {
	
	/*
	 * Write a function vowelCount that takes a String and returns the number of
	 * vowels in the String. add a check for the string to be of 10 or less
	 * characters.
	 */
	static void vowelCount(char c) {
//		if (c=='a')
	}
	public static void main(String[] args) {
		
		String s = "PerScholas";
		System.out.println("Total characters in the string is : "+s.length());
		int vowelCount = 0;
		for(int i=0; i<s.length(); i++) {
			
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				vowelCount++;
				
			}	
				
		}
		System.out.println("Total Number of vowels in this string is : "+ vowelCount);
	}

}
