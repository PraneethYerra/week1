package training.day4.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class collEx08 {

	public static void main(String[] args) {

		List<String> goodMorning = Arrays.asList("Good Morning", "namasakaram", "Bonjour");
		List<String> goodevening = Arrays.asList("Good Evening", "Shubha Sanje", "Bonjour");
		List<String> goodNight = Arrays.asList("Good Night", "Shubaha Ratri", "Bonne Nuit");
		
		Map<String, List<String>> map = new HashMap<>();
		
		map.put("goodMorning",goodMorning);
		

		map.put("goodMorning",goodevening);

		map.put("goodMorning",goodMorning);
		
		Iterator<Entry<String,List<String>>> iterator  = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<String, List<String>> next = iterator.next();
			
			System.out.println("Word"+next.getKey());
			for (String temp : next.getValue()) {
				System.out.println(temp+"\t");
				
				
			}
			System.out.println();
			
		}
			

	}

}
