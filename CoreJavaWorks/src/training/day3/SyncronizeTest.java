package training.day3;




public class SyncronizeTest extends Thread{
	
	Account account;
	int amount;
	public SyncronizeTest(Account account, int amount, String name) {
		super();
		this.account = account;
		
		Thread t = new Thread(this,name);
		t.start();
		
		this.amount = amount;
	}
	public void run() {

		synchronized (account) {
			account.withdraw(amount);			
		}
	}
	
	public static void main(String[] args) {
		Account account  = new Account(1000);
		new SyncronizeTest(account, 500,"Mr. A");

		new SyncronizeTest(account, 750,"Mr. B");
		
	}

}
