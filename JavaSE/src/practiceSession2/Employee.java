package practiceSession2;

public abstract class Employee {
	
	private String name;
	private String id;
    double salary;
	private Address address;
	final static String companyName = "Google";//static - no need to access thru objects
//	private double bonus;
	
	public Employee(String id) {
		System.out.println("Employee");
		this.id = id;
		
	}
	protected abstract double calculateBonus();
	
	public double calculateSalary(double bonus) {
		
		return this.salary + bonus;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	

}
