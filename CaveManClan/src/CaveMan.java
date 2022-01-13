public class CaveMan {
	String name;
	int age;
	float weight;
	
	// parameterised constructor
	public CaveMan(String n, int a, float w) {
		this.name = n;
		this.age = a;
		this.weight = w;
	}

	// default constructor
	public CaveMan() {
		this.name="They haven't given me a name yet";
		this.age=0;
		this.weight=100f;
	}

	public void SayHi() {
		System.out.println("Hi, my name is " + this.name );
	}

}
