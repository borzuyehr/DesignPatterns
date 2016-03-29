import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GarageDoor extends UnicastRemoteObject implements GarageDoorRemote  {
	public int state;
	public String location;
	
	public GarageDoor(String loc) throws RemoteException {
		state=0; // closed
		this.location=loc;
	}

	public void up() {
		state=1;
		System.out.println("Garage Door is Open");
	}

	public void down() {
		state=0;
		System.out.println("Garage Door is Closed");
	}

	public void stop() {
		state=2;
		System.out.println("Garage Door is Stopped");
	}
	
	public int getState() {
		return state;
	}
	
	public String getLocation() {
		return location;
	}
	
	
}
