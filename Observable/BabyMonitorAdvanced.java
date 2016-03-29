import java.util.Observable;
import java.util.Observer;

public class BabyMonitorAdvanced implements Observer {
	
	Observable mdata, cdata;
	private String babyname;
	private String name;
	private boolean crying;
	private int level;
	
	public BabyMonitorAdvanced(String name, Observable m, Observable c) {
		this.name=name; this.mdata=m; this.cdata=c;
		mdata.addObserver(this); cdata.addObserver(this);
		}
	
	public void display() {
		if (crying) {
			System.out.println("Monitor:"+ name + " baby" + babyname + "is crying at level: " + level);
		}
	}

	public void update(Observable o, Object arg) {
		if (o instanceof BabyData) {
			BabyData bdata = (BabyData) o;
			this.babyname=bdata.getName();
			this.crying=bdata.getcrying();
			this.level=bdata.getLevel();
			display();
		}
		
	}
}
