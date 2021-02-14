package mod3W1D3;

public class Computer {
	
	private String name;
	private int year;
	private final double cost = 825.00;

	public Computer() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCost() {
		return cost;
	}

}
