package com.company.sapient.training;

public class TwoWheeler extends Vehicle {


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
}
