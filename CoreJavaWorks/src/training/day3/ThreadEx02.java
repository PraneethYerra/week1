package training.day3;

public class ThreadEx02{

	public static void main(String[] args) {

		
		MyBusinessLogic l = new MyBusinessLogic("laoptop", 9);

		MyBusinessLogic l2 = new MyBusinessLogic("comp", 9);
		
		MyBusinessLogic l3 = new MyBusinessLogic();
		Thread t = new Thread(l3);
		t.setDaemon(true);
		t.setName("Demon");
		t.start();
		
		
		
	}
}
