import java.util.Observable;
import java.util.Observer;

public class BabyMonitorSimple implements Observer {

	private Observable mdata;
	private String name;
	private boolean crying;
	
	public BabyMonitorSimple(Observable d, String name) {
		this.mdata=d;
		this.name=name;
		mdata.addObserver(this);
	}
		
	public void display() {
		if (crying) {
			System.out.println("Monitor:" + name + " baby is crying");
		}
	}


	public void update(Observable o, Object arg) {
		if (o instanceof BabyData) {
			BabyData bdata = (BabyData) o;
			this.crying=bdata.getcrying();
			display();
		}
	}
}
