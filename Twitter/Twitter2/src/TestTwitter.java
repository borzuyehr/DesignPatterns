
public class TestTwitter {
	public static void main(String[] args) {
		User Peter = new User("Peter");
		
		Follower James = new Follower();
		James.follow(Peter);
		
		Peter.beATweeter.tweet("Hey what's up?");
		User Joe = new User("Joe");
		Peter.beAFollower.follow(Joe);
		Joe.beATweeter.tweet("What's up with you Peter?");
	}

}
