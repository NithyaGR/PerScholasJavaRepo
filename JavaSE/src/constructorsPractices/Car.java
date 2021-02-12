package constructorsPractices;

public class Car {

	String name;
	String color;
	//String color = "white"; Also fix it.
	public Car(String name, String color) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.color = "white";
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car tesla = new Car("Tesla", "gold");
		System.out.println(tesla);
		System.out.println("Name "+tesla.name);
		System.out.println("Color "+tesla.color);
		

	}

}
