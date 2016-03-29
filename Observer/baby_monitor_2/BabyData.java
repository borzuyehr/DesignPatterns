import java.util.Observable;
import java.util.Observer;

public class BabyData extends Observable {

	private boolean crying=false;
	private int level=0;
	private String babyname;
	
	public BabyData(String name){
		this.babyname=name;
	}

	public void setData(boolean crying, int level) {
		this.crying=crying;
		this.level=level;
		setChanged();
		notifyObservers();
	}
	
	public boolean getcrying () {
		return crying;
	}
	public int getLevel() {
		return level;
	}
	public String getName() {
		return babyname;
	}
}
