package mod3_W1D1MLIfElse;

public class IfElseStatement {
	
	public int largerNumber(int number1, int number2) {
		
		if(number1 >= number2 )
			return number1;
		else
			return number2;
	}

	public static void main(String[] args) {
		
		IfElseStatement obj = new IfElseStatement();
		System.out.println("The larger number is "+obj.largerNumber(-156, -19087));
	}

}
