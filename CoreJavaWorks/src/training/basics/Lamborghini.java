package training.basics;

public class Lamborghini extends FourWheeler {

  public Lamborghini(String noofDoors, FuelType fuelType) {
		super(noofDoors,fuelType);
		// TODO Auto-generated constructor stub
	}

@Override
  public void drivingSource() {
    System.out.println("lamborghini uses diesel to run their engines");
  }

  @Override
  public void engineType() {
    System.out.println("Lambhorghini uses V12 engine to power their vehicles"+ getNoofDoors());
  }

  @Override
  public void noOfTyres() {
    System.out.println("Lambhorghini is a " +getNoofDoors() + " tyred vehicle ");
  }

  public void topSpeed() {
    System.out.println("Lamborghini Aventador LP700-4 can go from 0-60 mph in 2.9 seconds");
  }


  public void musicPlayer() {
	  System.out.println("Lambhorghini comes with sony music Player");
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
