package initialization;
//: initialization/PassingThis.java

class Person {
	public void eat(Apple apple) {
		System.out.println("2\t"+apple);
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		// ... remove peel
		System.out.println("4\t"+apple);
		return apple; // Peeled
	}
}

class Apple {
	Apple getPeeled() {
		System.out.println("3\t"+this);
		return Peeler.peel(this);
	}
}

public class PassingThis {
	public static void main(String[] args) {
		Apple apple = new Apple();
		System.out.println("1\t"+apple);
		Person person =new Person();
		person.eat(apple);
	}
} /*
	 * Output: Yummy
	 */// :~
