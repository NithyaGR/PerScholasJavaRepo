package mod3W1HW3;

public class Rectangle {
	
	double length;
	double width;
	public Rectangle(double length, double width) {
		if(length <0 ) {
			this.length = 0;
		}
		if(width <0 ) {
			this.width = 0;
		}
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		return this.length*this.width;
	}
	
}
