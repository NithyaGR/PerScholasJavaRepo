package practiceSession1;

public class ImmutableString {

	public static void main(String[] args) {
		
		String message = "Hello";
		String anotherMessage = new String("Hi");
		
		System.out.println(message);
		System.out.println(message.hashCode());
		
		message = "Hello Jean";
		System.out.println(message.hashCode());
		
		String check = "Hello";
		System.out.println(check.hashCode());
		System.out.println(message.toUpperCase());
		System.out.println(message);
		message = message.toUpperCase();
		
//		Integer, Byte, Char, Long, 
		int i = 10;
		Integer j = new Integer(i);
		System.out.println(j);
	

	}

}
