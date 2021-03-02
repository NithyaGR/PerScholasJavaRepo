package practiceSession2;

public class Tester extends Employee {

	public Tester(String id) {
		super(id);
		System.out.println("I'm a tester");
	}

	@Override
	public double calculateBonus() {
		// TODO Auto-generated method stub
		return super.getSalary()*.02;
	}

}
