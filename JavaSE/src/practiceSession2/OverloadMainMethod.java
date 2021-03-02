package practiceSession2;

public class OverloadMainMethod {

	public static void main(String[] args) {
	
		System.out.println("I'm the main - main");

	}
	public static void main(String name) {
		System.out.println("I'm the first overloaded main - with String args "+name);

	}
	public static void main(int number) {
		System.out.println("I'm the second overloaded main - with int args "+number);
	}

}
