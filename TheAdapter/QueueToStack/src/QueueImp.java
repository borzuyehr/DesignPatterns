
public class QueueImp implements Queue {
    QueueAdapter adapter;
	public int Size(){
		return adapter.Size();}
	public boolean Empty() {
		return adapter.Empty();
	}
	public void Enqueue(int value) {
		adapter.Enqueue(value);
	}
	public int Dequeue() {
		return adapter.Dequeue();
	}

}
