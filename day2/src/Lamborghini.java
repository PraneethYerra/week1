package com.company.sapient.training;

public class Lamborghini extends FourWheeler {

  @Override
  public void drivingSource() {
    System.out.println("lamborghini uses diesel to run their engines");
  }

  @Override
  public void engineType() {
    System.out.println("Lambhorghini uses V12 engine to power their vehicles");
  }

  @Override
  public void noOfTyres() {
    System.out.println("Lambhorghini is a 4 tyred vehicle ");
  }

  public void topSpeed() {
    System.out.println("Lamborghini Aventador LP700-4 can go from 0-60 mph in 2.9 seconds");
  }


}
