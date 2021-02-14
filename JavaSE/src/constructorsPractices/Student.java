package constructorsPractices;

public class Student {
	//declaring instance variables
	int age;
	String name;
	String hobby;
	
	//constructor
	   
public Student(int age, String name, String hobby) {
	this.age = age;
	this.name = name;
	this.hobby = hobby;
}

/*
 * Overriding the toString() method to print the name of the object when I
 * sysout just the name of the object.
 */
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name;
}
	public static void main(String[] args) {
		//create an object
		Student nithya = new Student(42, "Nithya", "Music");
		System.out.println("Name : "+nithya.name);
		System.out.println("age : "+nithya.age);
		System.out.println("hobby : "+nithya.hobby);
		System.out.println(nithya);
		
		Student joe = new Student(23,"Joe", "Painting");
		joe = nithya;
		
		joe.name = "Queen";
		System.out.println(" Printing nithya.name after updating to Queen is : "+nithya.name);
		nithya.age = 43;
		System.out.println(joe.age);
		System.out.println(joe);
		System.out.println(nithya);
		
		
	}

}
