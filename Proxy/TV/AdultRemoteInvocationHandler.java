import java.lang.reflect.*;

public class AdultRemoteInvocationHandler implements InvocationHandler {
	TV_interface remote;
			
		public AdultRemoteInvocationHandler(TV_interface remote) {
			this.remote=remote;
		}

		public Object invoke(Object proxy, Method method, Object[] args) 
				throws IllegalAccessException {
			try {
					return method.invoke(remote, args); 
	        } catch (InvocationTargetException e) {
	            e.printStackTrace();
	        } 
			return null;
		}
}
