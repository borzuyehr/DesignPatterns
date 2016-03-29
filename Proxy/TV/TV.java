
public class TV implements TV_interface {
	private int state;
	private int volume;
	private int channel;
	private String location;
	
	public TV(String loc) {
		state=0; //off
		volume=1;
		location=loc;
		channel=0;
	}

	
	public int getState() {
		return state;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void on() {
		state=1;
		System.out.println("TV is on");
	}
public void off() {
		state=0;
		System.out.println("TV is off");
	}
		public void volume_up() {
		volume+=1;
		System.out.println("TV volume louder");
	}
	
	public void volume_down() {
		volume-=1;
		System.out.println("TV volume down");
	}
	
	public void channel_down(){
		channel-=1;
		if (channel==-1) channel=99;
		System.out.println("Channel down to" + channel);
	}
	
	public void channel_up(){
		channel+=1;
		if (channel==99) channel=0;
		System.out.println("Channel up to" + channel);
	}
}
