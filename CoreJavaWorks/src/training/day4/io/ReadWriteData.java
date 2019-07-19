package training.day4.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;

public class ReadWriteData {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your id : ");
		int empId = Integer.parseInt(br.readLine());

		System.out.println("Enter your name : ");
		String empName = br.readLine();

		System.out.println("Enter Salary:");
		double salary = Double.parseDouble(br.readLine());
		// Write Data
		// writeData(empId, empName, salary);

		// Read Data

		readFromFile();

	}

	private static void readFromFile() throws FileNotFoundException, IOException {
		BufferedReader brFile = new BufferedReader(new FileReader("emp.txt"));
		String line = null;
		System.out.println("File Contents" + "\n------------------------------------");
		while ((line = brFile.readLine()) != null) {
			System.out.println(line);
		}
	}

	private static void writeData(int empId, String empName, double salary) throws IOException {
		BufferedWriter bw = null;

		display(empId, empName, salary);
		try {
			bw = new BufferedWriter(new FileWriter("emp.txt", true));
			bw.write("Empid" + empId + "\n" + "EmpName" + empName + "\n" + "EmpSalary" + salary + "\n");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			bw.close();
		}
		System.out.println("Data Written");
	}

	private static void display(int empId, String empName, double salary) {
		System.out.println("EmpId : " + empId);

		System.out.println("Emp Name : " + empName);

		System.out.println("Emp Salary : " + salary);
	}

}
