package day2.interfaceex;

public class AccountImpl {

	public static void main(String[] args) {
		Account a1 = new Account("Mayur", 200);

		Account a2 = new Account("Umang", 200);
	
	System.out.println(a1.getAccountId()+","+a1.getCustomerName());

	System.out.println(a2.getAccountId()+","+a2.getCustomerName());

	}
	
}
