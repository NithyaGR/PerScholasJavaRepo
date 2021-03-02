package mod3W2;

public class Day1MorningLabCalcDebug {
	
	double add(double d1, double d2) {
		
		return d1+d2;
	}
	
	double substract(double d1, double d2) {
		
		// introducing logical error to debug - actually the requirement says otherwise
		if(d1>d2) 
			return d2-d1;
		else
			return d1-d2;
	}
	
	double multiply(double d1, double d2) {
		
		return d1*d2;
	}
	
	double divide(double d1, double d2) {
		
		return d1/d2;
	}

	public static void main(String[] args) {
		
		Day1MorningLabCalcDebug obj = new Day1MorningLabCalcDebug();
		System.out.println(obj.add(12, -5));
		System.out.println(obj.substract(12, 5));
		System.out.println(obj.multiply(12, 5));
		System.out.println(obj.divide(12, 5));
		
	}

}
