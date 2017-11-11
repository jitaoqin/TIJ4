package typeinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import typeinfo.factory.Factory;

/*class Part1 {
public String toString() {
	return getClass().getSimpleName();
}

static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
static {
	// Collections.addAll() gives an "unchecked generic
	// array creation ... for varargs parameter" warning.
	partFactories.add(new FuelFilter.Factory());
	partFactories.add(new AirFilter.Factory());
	partFactories.add(new CabinAirFilter.Factory());
	partFactories.add(new OilFilter.Factory());
	partFactories.add(new FanBelt.Factory());
	partFactories.add(new PowerSteeringBelt.Factory());
	partFactories.add(new GeneratorBelt.Factory());
}
private static Random rand = new Random(47);
public static Part createRandom() {
	int n = rand.nextInt(partFactories.size());
	return partFactories.get(n).create();
}
}*/

public class Exercise14 {
	static List<Class<? extends Part>> lists = new ArrayList<Class<? extends Part>>(
			Arrays.asList(FuelFilter.class, AirFilter.class, CabinAirFilter.class, OilFilter.class, FanBelt.class,
					GeneratorBelt.class, PowerSteeringBelt.class));

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++)
			try {
				System.out.println(lists.get(i).newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
