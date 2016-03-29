import java.rmi.*;
	
public class GarageDoorMonitor {

		GarageDoorRemote gdoor;
		
		public GarageDoorMonitor(GarageDoorRemote gdoor) {
			this.gdoor=gdoor;
		}
		
		public String convertState(int e){
			String s="stopped";
			if (e==0) s= "down";
			if (e==1) s="up";
			return s;
		}
		
		public void report() {
			try {
			System.out.println("GarageDoor location" + gdoor.getLocation());
			System.out.println("GarageDoor state:" + convertState(gdoor.getState()));
			
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
	}
