package training.day4.collection;

import java.util.ArrayList;

public class CollEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("hi");
		list.add(23);
		list.add(new Object());
		list.add(true);
		
		for(Object temp:list) {
			System.out.println(temp);
			double dd = (double)temp;
			System.out.println("dd is d"+dd);
		}
		
		
	}
}
