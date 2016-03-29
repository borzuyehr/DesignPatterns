import java.rmi.*;

public interface GarageDoorRemote extends Remote {

	public int getState() throws RemoteException;
    public String getLocation() throws RemoteException;
	public void up() throws RemoteException;
	public void down() throws RemoteException;
	public void stop() throws RemoteException;
}
