import java.lang.reflect.Proxy;


public class TestRemote {
		
		public static void main(String[] args) {
			TestRemote test = new TestRemote();
			test.drive();	
		}
		
		public void drive() {
		
		TV_interface myTV = new TV("Kitchen");
		TV_interface myremote= getAdultRemoteProxy(myTV);
		try {
			myremote.channel_up();
		} catch (Exception e) {
			System.out.println("Not allowed");
		}
		
		myremote= getChildRemoteProxy(myTV);
		try {
			myremote.channel_up();
		} catch (Exception e) {
			System.out.println("Not allowed");
		}
		
		
		
	}
	
	
	TV_interface getAdultRemoteProxy(TV_interface remote) {
        return (TV_interface) Proxy.newProxyInstance(
        		remote.getClass().getClassLoader(),
        		remote.getClass().getInterfaces(),
                new AdultRemoteInvocationHandler(remote));
	}
	
	TV_interface getChildRemoteProxy(TV_interface remote) {
        return (TV_interface) Proxy.newProxyInstance(
        		remote.getClass().getClassLoader(),
        		remote.getClass().getInterfaces(),
                new ChildRemoteInvocationHandler(remote));
	}

}
