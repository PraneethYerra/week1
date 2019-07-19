package day2.interfaceex;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {

	public static Student[] sortByNameAsc(Student[] students) {

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getSName().compareTo(o2.getSName());
			}

		});
		return students;

	}

	public static Student[] sortByNameDesc(Student[] students) {

		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getSName().compareTo(o1.getSName());
			}

		});
		return students;

	}

	public static Student[] sortByIdAsc(Student[] students) {
		Arrays.sort(students, (s1, s2) -> {
			return s1.getsId() - s2.getsId();
		});

		return students;
	}

	public static boolean find(Student[] students, int id) {
		int arr[] = new int[students.length];

		
		int i=0; 
		for (Student temp : students) {
			arr[i++] = temp.getsId();
			System.out.println(temp.getsId());
		}
		
		
		return Arrays.binarySearch(arr, id) > -1;

	}

}
