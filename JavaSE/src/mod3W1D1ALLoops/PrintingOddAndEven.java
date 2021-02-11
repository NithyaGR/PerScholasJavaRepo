package mod3W1D1ALLoops;

public class PrintingOddAndEven {
	public static void main(String[] args) {
		int number = 10;
		System.out.println("Printing odd numbers: ");
		for(int i=1; i<=number; i++) {
			if(i%2 !=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Printing even numbers: ");
		for(int i=1; i<=number; i++) {
			if(i%2 ==0) {
				System.out.print(i+" ");
			}
		}
	}

}
