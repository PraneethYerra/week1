package training.basics;

public class HarleyDavidson extends TwoWheeler {

  private String HARLEY_DAVIDSON = "Harley-Davidson ";

  @Override
  public void drivingSource() {
    System.out.println(HARLEY_DAVIDSON+"bikes use petrol to run their engines");
  }

  @Override
  public void engineType() {
    System.out.println(HARLEY_DAVIDSON+" Milwaukee-Eight engine to power their vehicles");
  }

  @Override
  public void noOfTyres() {
    System.out.println(HARLEY_DAVIDSON+" is a 2 tyred vehicle ");
  }

  public void topSpeed() {
    System.out.println(HARLEY_DAVIDSON+" VRSCR model can go from 0-60 mph in 3.4 seconds");
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
