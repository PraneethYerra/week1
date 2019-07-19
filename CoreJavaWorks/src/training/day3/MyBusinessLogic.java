package training.day3;

class MyBusinessLogic implements Runnable {

	private Thread t;

	public MyBusinessLogic(String name, int priority) {
		t = new Thread(this);
		t.setName(name);
		t.setPriority(priority);
		t.start();
	}

	public MyBusinessLogic() {
		t = new Thread(this);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("The thread name in run() is" + Thread.currentThread().getName());

		for (int i = 0; i < 1000; i++) {
			System.out.println("Value of i is " + i + " in Thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		System.out.println("Exiting: " + Thread.currentThread().getName());
	}
}



