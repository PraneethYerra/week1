package day2.interfaceex;

import java.util.Arrays;

public class NameSortEx {
	
	
	public static void main(String[] args) {
		String[] names = {new String("Praneeth"),"Himanshu","Anuraj","Udit","Saurajit"};
		
		for (String temp : names) {
			System.out.println(temp);
		}
		
		
		Arrays.sort(names);
		
		System.out.println("--------------------");
		for (String temp : names) {
			System.out.println(temp);
		}
		
	}

}
