package javaPracticeDay1;

public class SwitchPractice {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 10;
		//5*12/10;
//		int number = (int)((Math.random() *10)+1);
		System.out.println(num1*num2/(num1+num2));
		int number =(int)num1*num2/(num1+num2);
		System.out.println(number);
		
		switch (number) {
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wednesday");
				break;
				
			case 4:
				System.out.println("Thursday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Saturday");
				break;
				
			case 7:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("Not any day");
				break;
		
		}

	}

}
