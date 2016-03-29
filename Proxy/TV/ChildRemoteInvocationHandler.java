import java.lang.reflect.*;

public class ChildRemoteInvocationHandler implements InvocationHandler {
	TV_interface remote;
			
		public ChildRemoteInvocationHandler(TV_interface remote) {
			this.remote=remote;
		}

		public Object invoke(Object proxy, Method method, Object[] args) 
				throws IllegalAccessException {
			try {
				if (method.getName().startsWith("volume")) {
					return method.invoke(remote, args);
				} else {
					throw new IllegalAccessException();
				} 
	        } catch (InvocationTargetException e) {
	            e.printStackTrace();
	        } 
			return null;
		}
}
