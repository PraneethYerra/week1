package day2.interfaceex;

public class Lamp extends Device implements RemoteControl{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println(" Lamp is on");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println(" Lamp is off");

	}

}
