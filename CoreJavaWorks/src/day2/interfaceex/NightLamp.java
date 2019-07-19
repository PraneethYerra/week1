package day2.interfaceex;

public class NightLamp extends Device implements RemoteControl {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Night Lamp is on");

	}

	@Override
	public void off() {
		
		System.out.println("Night Lamp is off");
	}

}
