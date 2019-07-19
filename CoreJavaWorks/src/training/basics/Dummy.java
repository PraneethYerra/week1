package training.basics;

public class Dummy {

	public static void main(String[] args) {

		Name s = new Name();
		s.setName("Yerrra bala Praneeth Kumar");
		System.out.println(s.getName());

	}

}

class Name {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String s) {
		if (s.length() < 3) {
			System.out.println("small name");

		} else
			this.name = s;
	}

}
