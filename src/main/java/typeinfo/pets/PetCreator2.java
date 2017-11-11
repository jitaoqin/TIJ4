//: typeinfo/pets/PetCreator.java
// Creates random sequences of Pets.
package typeinfo.pets;

import java.util.*;

import com.sun.org.glassfish.external.statistics.Statistic;

import typeinfo.factory.Factory;

public abstract class PetCreator2 {
	private static Random rand = new Random(47);
	// The List of the different types of Pet to create:
	static List<Factory<? extends Pet>>  factories= new ArrayList<Factory<? extends Pet>>();
	static{
		factories.add(new Cymric2.fatory());
		factories.add(new EgyptianMau2.fatory());
		factories.add(new Hamster2.fatory());
		factories.add(new Manx2.fatory());
		factories.add(new Mouse2.fatory());
		factories.add(new Mutt2.fatory());
		factories.add(new Pug2.fatory());
		factories.add(new Rat2.fatory());
	}
	public static void main(String[] args) {
		Pet[] pets = createArray(10);
		for (Pet pet : pets) {
			System.out.println(pet);
		}
		
	}
	public static Pet randomPet() { // Create one random Pet
		int n = rand.nextInt(factories.size());		
		return factories.get(n).create();		
	}

	public static Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for (int i = 0; i < size; i++)
			result[i] = randomPet();
		return result;
	}

	public ArrayList<Pet> arrayList(int size) {
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
	
} /// :~

class Hamster2 extends Rodent {
	public static class fatory implements Factory<Hamster2>{
		@Override
		public Hamster2 create() {			
			return new Hamster2();
		}		
	}
}

class Rat2 extends Rodent {
	public static class fatory implements Factory<Rat2>{
		@Override
		public  Rat2 create() {			
			return new Rat2();
		}		
	}
}

class Mouse2 extends Rodent {
	public static class fatory implements Factory<Mouse2>{
		@Override
		public Mouse2 create() {
			return new Mouse2();
		}	
	}
}

class Manx2 extends Cat {
	public static class fatory implements Factory<Manx2>{
		@Override
		public Manx2 create() {
			return new Manx2();
		}	
	}
}

class Cymric2 extends Manx2 {
	public static class fatory implements Factory<Cymric2>{
		@Override
		public Cymric2 create() {
			return new Cymric2();
		}	
	}
}

class EgyptianMau2 extends Cat {
	public static class fatory implements Factory<EgyptianMau2>{
		@Override
		public EgyptianMau2 create() {
			return new EgyptianMau2();
		}	
	}
}

class Mutt2 extends Dog {
	public static class fatory implements Factory<Mutt2>{
		@Override
		public Mutt2 create() {
			return new Mutt2();
		}	
	}
}

class Pug2 extends Dog {public static class fatory implements Factory<Pug2>{
	@Override
	public Pug2 create() {
		return new Pug2();
	}	
}}