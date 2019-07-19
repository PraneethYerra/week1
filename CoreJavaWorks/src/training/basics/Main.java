package training.basics;

public class Main {

 
public static void main(String[] args) {
	  
	  
	  Vehicle[] veh = new Vehicle[4];
	  
	  veh[0] = new BMW("four",FuelType.petrol);
	  veh[1] = new Lamborghini("6",FuelType.CNG);
	  veh[2] = new HarleyDavidson();
	  veh[3] = new RoyalEnfield();
	 
	  DisplayVehicle.showVehicle(veh);
	  
//
//    Vehicle v = new RoyalEnfield();
//
//    display(v);
//
//    veh[0] = new BMW("four",FuelType.petrol);
//	
//    display(v1);
//
//    Vehicle v2 = new HarleyDavidson();
//
//    display(v2);
//
//    veh[1] = new Lamborghini("6",FuelType.CNG);
//	 
//    display(v3);



  }

  private static void display(Vehicle v) {
    v.drivingSource();
    v.noOfTyres();
    if (v instanceof TwoWheeler) {
      ((TwoWheeler) v).engineType();
      if (v instanceof RoyalEnfield) {
        ((RoyalEnfield) v).topSpeed();
      } else {
        ((HarleyDavidson) v).topSpeed();
      }
    } else {
      ((FourWheeler) v).engineType();
      if (v instanceof BMW) {
        ((BMW) v).topSpeed();
      } else {
        ((Lamborghini) v).topSpeed();
      }
    }
    System.out.println("---------------------------------------------");
  }
}
