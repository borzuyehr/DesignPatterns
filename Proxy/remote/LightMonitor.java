import java.rmi.*;

public class LightMonitor {

	LightRemote light;
	
	public LightMonitor(LightRemote light) {
		this.light=light;
	}
	
	public String convertState(int e){
		if (e==0) return "off"; else return "on";
	}
	
	public void report() {
		try {
		System.out.println("Light location" + light.getLocation());
		System.out.println("Light state:" + convertState(light.getState()));
		
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
