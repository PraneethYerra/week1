package day2.interfaceex;

import java.util.Arrays;

public class StudentSortImpl {

	public static void main(String[] args) {

		Student[] students = { new Student(111, "Harish", 595),

				new Student(10, "Hari", 559),

				new Student(1043, "Haritha", 955),

				new Student(1041, "Harika", 550),

				new Student(1025, "Harima", 556),

		};

		for (Student temp : students) {
			System.out.println(temp);
		}

		SortingTemplate.sortByIdAsc(students);
		System.out.println("--------------------");
		System.out.println(SortingTemplate.find(students, 111));

		for (Student temp : students) {
			System.out.println(temp);

		}

	}

}
