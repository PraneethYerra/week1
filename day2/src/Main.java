package com.company.sapient.training;

public class Main {

  public static void main(String[] args) {

    Vehicle v = new RoyalEnfield();

    display(v);

    Vehicle v1 = new BMW();

    display(v1);

    Vehicle v2 = new HarleyDavidson();

    display(v2);

    Vehicle v3 = new Lamborghini();

    display(v3);



  }

  private static void display(Vehicle v) {
    v.drivingSource();
    v.noOfTyres();
    if (v instanceof TwoWheeler) {
      ((TwoWheeler) v).engineType();
      if (v instanceof RoyalEnfield) {
        ((RoyalEnfield) v).topSpeed();
      } else {
        ((HarleyDavidson) v).topSpeed();
      }
    } else {
      ((FourWheeler) v).engineType();
      if (v instanceof BMW) {
        ((BMW) v).topSpeed();
      } else {
        ((Lamborghini) v).topSpeed();
      }
    }
    System.out.println("---------------------------------------------");
  }
}
