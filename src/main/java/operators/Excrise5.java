package operators;



public class Excrise5 {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("spot", "Ruff");
		Dog dog2 = new Dog("scruffy", "Wruf");
		Dog dog3 = dog1;
		
		System.out.println(dog3.equals(dog1));
		System.out.println(dog3==dog1);
	}
	
	

}

class Dog{
	String name;
	String says;
	public Dog(String name, String says) {
		super();
		this.name = name;
		this.says = says;
	}
	
}