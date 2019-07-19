package training.day4.collection;

import java.util.ArrayList;

public class ColleX02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Hello");

		list.add("Mayur");

		list.add("whatsup");

		list.add("hooman");

		System.out.println("After adding size:- " + list.size());

		ArrayList<String> list1 = new ArrayList<String>();
		list1.addAll(list.subList(0, 2));
		System.out.println("---------------------");

		for (String temp : list) {
			System.out.println(temp);
		}


		System.out.println("---------------------");	
		for (String temp : list1) {
			System.out.println(temp);
		}

		System.out.println("---------------------");

	}
}
