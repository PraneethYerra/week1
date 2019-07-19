package day2.interfaceex;


class AcceptCommand{
	public static void CheckDevice(RemoteControl device) 
	{
		device.on();

		device.off();
	}
}



public class InterfaceImpl {

	public static void main(String[] args) {
		RemoteControl rc = new AC();
		AcceptCommand.CheckDevice(rc);

		rc = new Lamp();
		AcceptCommand.CheckDevice(rc);

		rc = new NightLamp();
		AcceptCommand.CheckDevice(rc);

		
	
	}
	
}
