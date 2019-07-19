package com.company.sapient.training;

public class RoyalEnfield extends TwoWheeler {
  private String ROYAL_ENFIELD = "Royal Enfield ";

  @Override
  public void drivingSource() {
    System.out.println(ROYAL_ENFIELD+"bikes use petrol to run their engines");
  }

  @Override
  public void engineType() {
    System.out.println(ROYAL_ENFIELD+" 650 cc Parallel-Twin engine to power their vehicles");
  }

  @Override
  public void noOfTyres() {
    System.out.println(ROYAL_ENFIELD+" is a 2 tyred vehicle ");
  }

  public void topSpeed() {
    System.out.println(ROYAL_ENFIELD+" Classic 500 can go from 0-60 mph in 3.6 seconds");
  }
}
