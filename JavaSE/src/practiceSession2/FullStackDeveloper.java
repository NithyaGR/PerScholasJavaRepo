package practiceSession2;

public class FullStackDeveloper extends Employee{
	
	 int workingHours;
	
	public FullStackDeveloper(String id, int workingHours) {
		super(id);
		this.workingHours = workingHours;
		System.out.println("I'm a full stack developer");
		
		
	}
	
	public double calculateFSDSalary(double d) {
		
		return super.calculateSalary(2*d);
	}

	@Override
	public double calculateBonus() {
		return super.getSalary()*0.05;
	
	}
	
	
}
