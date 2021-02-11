package mod3W1D1ALLoops;

public class PrintCharOfString {

	public static void main(String[] args) {
		
		String myString = "Hello World";
		int count=0;
		while(count<myString.length()) {
			System.out.print(myString.charAt(count));
			count++;
		}
		System.out.println();

	}

}
