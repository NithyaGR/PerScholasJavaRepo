package constructorsPractices;

public class Animal {
	String talk;
	public Animal(String sound) {
		// TODO Auto-generated constructor stub
		this.talk = sound;
	}

	public void talk() {
		System.out.println(this.talk);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal("woof");
		Animal cat = new Animal("meow");
		System.out.println(dog.talk);
		System.out.println(cat.talk);
		dog.talk();
	}

}
