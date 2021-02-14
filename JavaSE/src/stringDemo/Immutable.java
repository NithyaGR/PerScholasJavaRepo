package stringDemo;

public class Immutable {

	public static void main(String[] args) {
		
		String a = "hello";
		System.out.println(a);
		System.out.println(a.hashCode());
		a = a+" Joe!";
		System.out.println(a);
		System.out.println(a.hashCode());
		String b = "hello";
		System.out.println(b.hashCode());
		String c = "hello";
		System.out.println(c.hashCode());
		System.out.println(a.toString());
		String name = new String("Nithya");
		System.out.println(name);
		Integer i = new Integer(12);
		System.out.println(i);
		
		
		
	}

}
