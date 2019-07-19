package training.day3;

class BusinessLogin extends Thread {

	public void run() {

		System.out.println("The thread name in run() is" + Thread.currentThread().getName());

		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is " + i + " in Thread " + Thread.currentThread().getName());

		}

		System.out.println("Exiting: " + Thread.currentThread().getName());
	}

}

public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		BusinessLogin businessLogin = new BusinessLogin();
		businessLogin.start();

		BusinessLogin businessLogin2 = new BusinessLogin();
		businessLogin2.setPriority(6);
		businessLogin2.setName("Laptop");

		businessLogin2.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is " + i + " in Thread " + Thread.currentThread().getName());

		}

		try {
			businessLogin.join();
			businessLogin2.join();

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		System.out.println("Main Thread Exiting :::::::");
	}
	
	
}
