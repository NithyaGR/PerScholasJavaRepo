package practiceSession2;

public class EmployeeTest {

	public static void main(String[] args) {
		
		FullStackDeveloper fsd = new FullStackDeveloper("1001",8);
		fsd.setName("Haben");
		fsd.getName();
		fsd.setSalary(100000);
		System.out.println(fsd.calculateFSDSalary(20000));
		
		Tester tester = new Tester("2001");
		tester.setName("Nithya");
		tester.setSalary(80000);
		System.out.println(tester.calculateBonus());
		
		
	
	}

}
