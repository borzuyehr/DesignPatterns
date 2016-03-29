import java.rmi.*;

public interface LightRemote extends Remote {
	
	public int getState() throws RemoteException;
    public String getLocation() throws RemoteException;
	public void on() throws RemoteException;
	public void off() throws RemoteException;
}
