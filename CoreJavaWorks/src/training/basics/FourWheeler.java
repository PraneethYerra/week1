package training.basics;

public abstract class FourWheeler extends Vehicle {
	
	public FourWheeler(String noofDoors, FuelType fuelType) {
		super();
		this.noofDoors = noofDoors;
		this.fuelType = fuelType;
	}


	private String noofDoors;
	private FuelType fuelType;
	
	
	
  public String getNoofDoors() {
		return noofDoors;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

@Override
  public void drivingSource() {
    System.out.println("four wheeler uses petrol or diesel to run their engines");
  }	

  public void engineType() {
    System.out.println("four wheeler uses four stroke engine");
  }

  @Override
  public void noOfTyres() {
    System.out.println("As the name suggests it uses 4 tyres");
  }
}
