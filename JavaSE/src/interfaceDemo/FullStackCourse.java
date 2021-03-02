package interfaceDemo;

public class FullStackCourse implements PerScholasOrg{
	
	 int workingHours;
	
	public FullStackCourse() {
		
		
		System.out.println("FullStackCourse");
		
		
	}

	@Override
	public double findPassPercentage() {
		// TODO Auto-generated method stub
		return 90.0;
	}

	@Override
	public String topper() {
		// TODO Auto-generated method stub
		return "Jean";
	}
		
	public void teachJavaScript() {
		System.out.println("Teaching java script");
	}
	@Override
	public String welcomeMessage() {
		//System.out.println("Welcome FullStack Develpors");
		return "Welcome FullStack Develpors";
	}


	
}
