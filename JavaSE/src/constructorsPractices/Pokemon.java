package constructorsPractices;

public class Pokemon {
	String type;
	String name;

	public Pokemon(String type, String name) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.name = name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon poke = new Pokemon("what", "King");
		System.out.println(poke.name);
		System.out.println("I chose you "+poke.name+" My favorite Tpe is : "+poke.type);

	}

}
