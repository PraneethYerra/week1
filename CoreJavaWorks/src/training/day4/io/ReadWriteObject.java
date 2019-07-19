package training.day4.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import day2.interfaceex.Account;

public class ReadWriteObject  {

	public static void storeAccount(Account account) throws FileNotFoundException, IOException {
		File file = new File("account.ser");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(account);
		oos.writeInt(100);
		oos.close();
		System.out.println("Darta wrtiteen sucad");
	}

	public static Account getAccount() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("account.ser");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Account account = (Account) ois.readObject();
		System.out.println(ois.readInt());
		return account;

	}

	public static void main(String[] args) throws ClassNotFoundException {

		Account account = new Account("Udit", 2233);
		try {
	//	storeAccount(account);
		Account account1 = getAccount();
		System.out.println(account1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
