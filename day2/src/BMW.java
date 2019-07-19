package day2;

public class BMW extends FourWheeler {

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
    System.out.println("BMW is a  4 tyred vehicle ");
  }

  public void topSpeed() {
    System.out.println("BMW M5 can go from 0-60 mph in 3.1 seconds");
  }

}
