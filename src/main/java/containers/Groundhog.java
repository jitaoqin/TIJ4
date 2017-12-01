package containers;//: containers/Groundhog.java

// Looks plausible, but doesn't work as a HashMap key.

public class Groundhog {
	protected int number;

	public Groundhog(int n) {
		number = n;
	}

	public String toString() {
		return "Groundhog #" + number;
	}
}

class Groundhog2 extends Groundhog {
	public Groundhog2(int n) {
		super(n);
	}

	public int hashCode() {
		return number;
	}

	public boolean equals(Object o) {
		return o instanceof Groundhog2 && (number == ((Groundhog2) o).number);
	}

	public String toString() {
		return "Groundhog #" + number;
	}
}
