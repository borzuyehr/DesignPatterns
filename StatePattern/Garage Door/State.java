
public interface State {
	public void open();
	public void close();
	public void lock();
	public void unlock();
	public void combinationEntered();
	public void errorEntered();
}
