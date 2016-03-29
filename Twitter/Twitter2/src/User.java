
public class User {
	private String username;
	Follower beAFollower;
	TweeterData beATweeter;
	
	public User (String username){
		this.username = username;
		beAFollower = new Follower ();
		beATweeter = new TweeterData (this.username);
	}

}
