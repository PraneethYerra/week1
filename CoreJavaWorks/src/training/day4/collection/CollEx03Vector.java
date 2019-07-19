package training.day4.collection;

import java.util.Vector;

public class CollEx03Vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>(7,5);
		v.ensureCapacity(11);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("15");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("15");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("15");
		System.out.println(v.capacity());
		System.out.println(v.size());
		
	}
}
