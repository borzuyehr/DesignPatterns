import java.util.Observable;
import java.util.Observer;


public class Follower implements Observer {
	Observable tweeter;
	private String tweet;
	private String tweetername;
	
	public void display (){
		System.out.println(tweetername + " " + tweet);
	}
	
	public void follow(User d){
		tweeter = d.beATweeter;
		tweeter.addObserver (this); 
	}
	
	public void unFolow (User e){
		tweeter = e.beATweeter;
		tweeter.deleteObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		if (o instanceof TweeterData) {
			TweeterData tdata = (TweeterData) o;
			this.tweet = tdata.getTweet();
			this.tweetername = tdata.getTweeterName ();
			display();
		}
	}

	

}
