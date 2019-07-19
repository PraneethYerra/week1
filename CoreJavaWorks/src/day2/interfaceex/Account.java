package day2.interfaceex;

import java.io.Serializable;

public class Account implements Serializable {

	private int accountId;
	private String customerName;
	private double initialBalance;
	
	
	@Override
	public String toString() {
		return customerName+accountId+initialBalance;
		// TODO Auto-generated method stub
	
	}

	 static int count = 100;

	public Account(String customerName, double initialBalance) {
		this.customerName = customerName;
		this.initialBalance = initialBalance;
       
		count++;
		accountId = count;

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountId() {
		return accountId;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public int getCount() {
		return count;
	}

}
