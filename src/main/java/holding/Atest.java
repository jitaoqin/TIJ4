package holding;



import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;



public class Atest {
	public static void main(String[] args) {
		Random random = new Random();
		HashMap<Integer, Integer> map1 = new HashMap();
		for( int i = 0; i < 300; i++){
			int key =random.nextInt(30);
			map1.put(key,map1.containsKey(key) ? map1.get(key)+1:1);	
			
		}
		
		Set<Entry<Integer, Integer>> set1 = map1.entrySet();
		for (Entry<Integer, Integer> entry : set1) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		
		
	}
}
