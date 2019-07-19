package training.basics;

public class InherImple {

	public static void main(String[] args) {
		ver01();

	}

	private static void ver01() {
		Animal t = new Tiger();
		t.sleep();
		t.walk();
		t.talk();

		System.out.println("--------------------------------");

		Human h = new Human();
		h.sleep();
		h.walk();
		h.talk();

		System.out.println("--------------------------------");
	}
}
