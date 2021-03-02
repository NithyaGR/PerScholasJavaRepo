package tryCatchPractices;

public class ArrayIndexException {

	public static void main(String[] args) {
		int a[] = {4,5,6};
		try {
		System.out.println(a[3]);
		}
		catch(Exception e) {
			System.out.println("Exception caught : "+e.getMessage());
		}

	}

}
