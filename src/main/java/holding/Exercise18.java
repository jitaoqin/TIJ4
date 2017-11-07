package holding;

import java.util.List;
import java.util.Map;

import typeinfo.pets.Person;
import typeinfo.pets.Pet;

public class Exercise18 {
	public static void main(String[] args) {
		Map<Person, List<? extends Pet>> maps = MapOfList.petPeople;
		String[] keys = maps.keySet().toArray(new String[0]);
		System.out.println(keys);

	}
}
