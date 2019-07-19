package training.day4.collection;

import java.util.Comparator;

public class ComparingTemplate implements Comparator<Device>{

	@Override
	public int compare(Device o1, Device o2) {
		// TODO Auto-generated method stub
		return o1.getdName().compareTo(o2.getdName());
	}
	

}
