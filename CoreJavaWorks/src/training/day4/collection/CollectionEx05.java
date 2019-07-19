package training.day4.collection;

import java.util.HashSet;
import java.util.TreeSet;

class Device {
	private int dId;
	private String dName;
	private int dPrice;

	public Device(int dId, String dName, int dPrice) {
		// TODO Auto-generated constructor stub
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdPrice() {
		return dPrice;
	}

	public void setdPrice(int dPrice) {
		this.dPrice = dPrice;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.dName.charAt(0);
	}

	@Override
	public boolean equals(Object obj) {

		Device device = (Device) obj;

		if (this.dId == device.dId && this.dName == device.dName && this.dPrice == device.dPrice) {
			return true;
		} else {
			return false;
		}

	}

}

public class CollectionEx05 {

	public static void main(String[] args) {

		HashSet<Device> set = new HashSet<>();
		set.add(new Device(101, "Laptop", 500));
		set.add(new Device(101, "Laptop", 100));
		set.add(new Device(101, "Laptop", 200));
		set.add(new Device(101, "Laptop", 300));
		set.add(new Device(101, "Laptop", 400));
		for (Device device : set) {
			System.out
					.println(device.hashCode() + " " + " " + device.getdId() + device.getdName() + device.getdPrice());
		}

		System.out.println("------------------------");

		TreeSet<Device> treeSet = new TreeSet<>(new ComparingTemplate());
		treeSet.add(new Device(101, "Lapstop", 500));
		treeSet.add(new Device(22, "heys", 100));
		treeSet.add(new Device(1101, "Lapstop", 300));
		for (Device device : treeSet) {
			System.out.println(device.hashCode() + " " + " " + device.getdId() + " " + " " + device.getdName() + " "
					+ " " + device.getdPrice());
		}

	}

}
