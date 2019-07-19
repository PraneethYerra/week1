package training.basics;
public abstract class TwoWheeler extends Vehicle {


  @Override
  public void drivingSource() {
    System.out.println("Two wheeler uses petrol or diesel to run their engines");
  }

  public void engineType() {
    System.out.println("Two wheeler uses 2 or four stroke engine");
  }

  @Override
  public void noOfTyres() {
    System.out.println("As the name suggests it uses 2 tyres");
  }
  
  public void selfStart(boolean flag) {
	  System.out.println(flag?"Two Wheeler has self Start":"Two Wheeler Does not have Self Start");
  }
  
  public void NoOfGear(int noOfGears) {
	  System.out.println(noOfGears);
	  
  }
}
