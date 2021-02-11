package mod3W1D2ML;

public class MaxOfGivenNumbers {
	
	static double maxNumber(double d1, double d2, double d3) {
		double max = d1;
		max = Math.max(Math.max(d1, d2), d3);
		return max;
	}

	public static void main(String[] args) {
	int number1 = 10234, number2 = 2398, number3 = 45678;
	
	System.out.println("Max of given 2 numbers is : "+Math.max(number1, number2));
	System.out.println("Max of given 3 numbers is : "+MaxOfGivenNumbers.maxNumber(number1, number2, number3));
	
		

	}

}
