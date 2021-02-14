package practiceSession1;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId("100");
		emp.setName("Emily");
		emp.setSalary(100000.00);
		System.out.println(emp.getName());
		
		
		Address address = new Address();
		address.setLine1("123, Jefferson Rd");
		address.setCity("Teaneck");
		address.setZip("07564");
		
		emp.setAddress(address);
		
		//System.out.println(emp.address.city);
		System.out.println(emp.getAddress().zip);
		
		//System.out.println(emp.companyName);
		System.out.println(Employee.companyName);
		
		Employee emp2 = new Employee();
		emp2.setId("101");
		emp2.setName("Seetha");
		emp2.setSalary(100000.00);
		
		emp = emp2;// it's matching the memeory - not copying the acual data.
		
		System.out.println(emp2.getName());
		System.out.println(emp.getName());
		System.out.println(emp);
		System.out.println(emp.hashCode());
		
		
		
		

	}

}
