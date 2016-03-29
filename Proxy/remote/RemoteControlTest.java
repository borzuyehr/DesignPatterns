import java.rmi.*;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		try {
		LightRemote light = (LightRemote) Naming.lookup("rmi://127.0.0.1/RemoteLight");
		LightMonitor appmon = new LightMonitor(light);
		GarageDoorRemote gdoor = (GarageDoorRemote) Naming.lookup("rmi://127.0.0.1/RemoteGarage");
		GarageDoorMonitor gmon = new GarageDoorMonitor(gdoor);
		
		appmon.report();
		gmon.report();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(gdoor);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();

		appmon.report();
		gmon.report();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
