import java.util.Observable;

public class TweeterData extends Observable {
	private String tweetername;
	private String tweet;
	
	public TweeterData (String name){
		this.tweetername = name; 
	}
	
	public void tweet (String tweet){
		this.tweet = tweet;
		setChanged ();
		notifyObservers ();
	}
	
	public String getTweeterName (){
		return tweetername;
	}
	
	public String getTweet (){
		return tweet;
	}
	
}
