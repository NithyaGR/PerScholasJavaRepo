package interfaceDemo;

public class TestingCourse implements PerScholasOrg {

	public TestingCourse() {
		System.out.println("TestingCourse");
	}

	@Override
	public double findPassPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String topper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String welcomeMessage() {
		return "Welcome Testers";
	}

	

}
