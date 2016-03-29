import java.rmi.*;
import java.rmi.server.*;

public class Light extends UnicastRemoteObject implements LightRemote {
	public int state;
	public String location;
	
	public Light(String loc) throws RemoteException {
		state=0; //off
		location=loc;
	}

	public int getState() {
		return state;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void on() {
		state=1;
		System.out.println("Light is on");
	}

	public void off() {
		state=0;
		System.out.println("Light is off");
	}
}
