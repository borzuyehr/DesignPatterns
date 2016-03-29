import java.rmi.*;

public class ApplianceTest {
	public static void main(String[] args) {
			
		try{
			Light light = new Light("kitchen");
			Naming.rebind("RemoteLight", light);
			GarageDoor garagedoor = new GarageDoor("garage");
			Naming.rebind("RemoteGarage", garagedoor);		
		} 
		    catch (Exception e) {
			e.printStackTrace();
		}
	}
}
