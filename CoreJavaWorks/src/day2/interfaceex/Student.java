package day2.interfaceex;

public class Student implements Comparable<Student> {

	public Student(int sId, String sName, double sMarks) {
		super();
		this.sId = sId;
		this.sMarks = sMarks;
		this.SName = sName;
	}

	private int sId;
	private double sMarks;
	private String SName;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public double getsMarks() {
		return sMarks;
	}

	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sMarks=" + sMarks + ", SName=" + SName + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.SName.compareTo(o.getSName());

	}
	
	

}
