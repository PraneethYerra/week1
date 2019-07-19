package training.day4.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class CollEx07Maps {
	
	public static void main(String[] args) {
		HashMap<String,Integer>map = new HashMap<>();
		
		
		map.put("Harry",2000);

		map.put("peter",2100);

		map.put("becky",2200);

//		System.out.println(map.get("Harry"));
//		
//		System.out.println(map.get("peter"));
//		
		
		
		Set  entrySet = map.entrySet();
			
		Iterator itr = entrySet.iterator();
		
		while (itr.hasNext()) {
		Map.Entry temp = (Entry)
			
		}
	}

}
