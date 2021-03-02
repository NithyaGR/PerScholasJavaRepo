package mod3W1HW3;

public class Cuboid extends Rectangle{

	double length;
	double width;
	double height;
	public Cuboid(double length, double width, double height) {
		super(length, width);
		this.length = length;
		this.width = width;
		if(height <0) {
			this.height = 0;
		}
		this.height = height;
	
	}
	public double getHeight() {
		return height;
	}

	public double volume() {
		return this.length*this.width*this.height;
	}
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4,5);
		System.out.println(rec.getArea());
		Cuboid cub = new Cuboid(3,4,5);
		System.out.println(cub.volume());
		System.out.println(cub.getArea());
	}

}
