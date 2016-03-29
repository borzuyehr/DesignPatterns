
public class TestTwitter {
	public static void main(String[] args) {
		TweeterData Peter = new TweeterData("Peter");
		
		Follower James = new Follower();
		James.follow(Peter);
		
		Peter.tweet("Hey what's up?");
	}

}
