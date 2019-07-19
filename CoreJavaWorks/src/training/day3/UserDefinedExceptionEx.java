package training.day3;

class Customer {

	private String customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;

}

public class UserDefinedExceptionEx {

	public static void main(String[] args) {

		Customer customer = new Customer();
		int amount = 90;

		try {
			performTransaction(customer, amount);
		} catch (AmountLessThan100Exceptiion e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void performTransaction(Customer customer, int amount) throws Exception {

		try {
			
			
		checkName(customer.getCustomerName());
		if (amount > 100) {
			System.out.println("done");

		} else {
			throw new AmountLessThan100Exceptiion();
		}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void checkName(String customerName) {
		// TODO Auto-generated method stub
		
		
	}

}
