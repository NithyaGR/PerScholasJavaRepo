package practiceSession2;

public class MethodsDemo {
	
	    String print(String someString) {
		System.out.println(someString);
		return "Hi "+someString;
	}

	public static void main(String[] Seetha) {
		
		MethodsDemo obj = new MethodsDemo();
		String newString = obj.print("Serkan");
		System.out.println(newString);
		System.out.println("After the method Execution");
	}

}

//public - private - protected - default 
