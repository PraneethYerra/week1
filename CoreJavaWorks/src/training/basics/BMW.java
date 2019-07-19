package training.basics;

public class BMW extends FourWheeler {

  public BMW(String noofDoors, FuelType fuelType) {
		super(noofDoors, fuelType);
		// TODO Auto-generated constructor stub
	}

@Override
  public void drivingSource() {
    System.out.println("BMW uses diesel to run their engines");
  }

  @Override
  public void engineType() {
    System.out.println("BMW uses V10 or V8 engine to power their vehicles");
  }

  @Override
  public void noOfTyres() {
    System.out.println("BMW is a  "+getNoofDoors() +" tyred vehicle ");
  }

  public void musicPlayer() {
	  System.out.println("BMW comes with sony music Player");
  }
  
  
  public void topSpeed() {
    System.out.println("BMW M5 can go from 0-60 mph in 3.1 seconds");
  }

@Override
public void move() {
	// TODO Auto-generated method stub
	
}

@Override
public void stop() {
	// TODO Auto-generated method stub
	
}

}
