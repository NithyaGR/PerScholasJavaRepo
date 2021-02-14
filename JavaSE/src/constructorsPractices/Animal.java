package constructorsPractices;

public class Animal {
	String name;
	String breed;
	String sound;
	char gender;
	public Animal(String sound) {
		// TODO Auto-generated constructor stub
		this.sound = sound;
	}

	public void talk() {
		System.out.println(this.sound);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal("woof");
		Animal cat = new Animal("meow");
		System.out.println(dog.sound);
		System.out.println(cat.sound);
		dog.talk();
		System.out.println(dog.name);
		System.out.println("Printing null character "+dog.gender);
		//String null
		//int 0;
		//
	}

}
