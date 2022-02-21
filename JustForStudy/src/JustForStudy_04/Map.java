package JustForStudy_04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		
		basicMap1();
		
	}                            
	
	static void basicMap1(){
		
		HashMap<Integer, String> basicMap = new HashMap<>();
		basicMap.put(0, "Hello ");
		basicMap.put(1, "world");
		System.out.println("Sysout.basicMap: "+basicMap);
		
		// keyset - take key of map.
		Set<Integer> keys = basicMap.keySet();
		System.out.print("Use Set + KeySet: " + keys + "\n");
		// values - take value of map.  
		Collection<String> values = basicMap.values();
		System.out.println("Use Collection + values: " + values);
		/*
		 * If Using 'Entry & Iterator', It can be control keys and values both.
		 *           ('-')
		 * Letters in this What I wrote is could be wrong(Specially English). 
		 * Someone see this, pass it Please :-).
		 * I just trying to use English and learn coding; 
		 * */
		System.out.print("\n\n\tEntry & Iterator\t\n\n");
		// 1. declare entrySet to map
		Set<HashMap.Entry<Integer, String>> entrySet1 = basicMap.entrySet();
		// 2. declare iterator to entrySet
		Iterator<Entry<Integer, String>> itrt = entrySet1.iterator();
		// 3. while itrerator has next
		while(itrt.hasNext()) {
		// 4. declare entry to iterator
			Entry<Integer, String> entry1 = itrt.next();
		// 5. if you want something what you want clear, Use if.
			if (entry1.getKey().equals(1)) {
				System.out.println("key 1 of entry1 is: "+entry1.getValue());
			}
			
			
			
		}
		
		
		
	}
	
}





















