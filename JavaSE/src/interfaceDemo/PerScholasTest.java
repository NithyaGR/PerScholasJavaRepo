package interfaceDemo;

public class PerScholasTest {

	public static void main(String[] args) {
		
		PerScholasOrg ps = new FullStackCourse();
		System.out.println(ps.findPassPercentage());
		System.out.println(ps.topper());
		ps.findPassPercentage();
		ps.topper();	
		ps.welcomeMessage();
	
		
		ps = new TestingCourse();
		System.out.println(ps.findPassPercentage());
		System.out.println(ps.topper());
		
	}

}
