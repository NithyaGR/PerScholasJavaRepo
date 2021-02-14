package practiceSession1;

public class Employee {
	
	private String name;
	private String id;
	private double salary;
	private Address address;
	final static String companyName = "Google";//static - no need to access thru objects
	
//	public Employee(String name, String id, double salary) {
//		
//		this.name = name;
//		this.id = id;
//		this.salary = salary;
//	}
	

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
