import java.rmi.RemoteException;



public class LightOnCommand implements Command {
	LightRemote light;
  
	public LightOnCommand(LightRemote light) {
		this.light = light;
	}
 
	public void execute() {
		try {
		light.on(); }
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
