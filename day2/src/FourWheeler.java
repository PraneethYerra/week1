package com.company.sapient.training;

public class FourWheeler extends Vehicle {


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
