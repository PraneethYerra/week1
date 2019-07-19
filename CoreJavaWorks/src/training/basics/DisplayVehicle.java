package training.basics;

public class DisplayVehicle {

	public static void showVehicle(Vehicle ...vehicles ) {
		
		
		if(vehicles == null) {
			System.out.println("Sorry no vehicle fund");
			return;
		}
		
		
		for (Vehicle temp : vehicles) {
			
				temp.move();
				temp.noOfTyres();
				
				if(temp instanceof FourWheeler) {
					((FourWheeler) temp).getNoofDoors();
				}
			
			
		}
		
	}
	
	
}
