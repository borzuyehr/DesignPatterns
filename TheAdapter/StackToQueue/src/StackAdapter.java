
public class StackAdapter extends Stack {


	Queue queue;
	
	public StackAdapter (Queue queue) {
		this.queue = queue;
	}
	
	
	public int getSize() {
		return queue.Size();
	}
	
	public boolean isEmpty() {
		return queue.Empty();
	}
	public int pop() {
		return queue.Dequeue();
	}
	public void push(int value) {
		queue.Enqueue (value);
	}

}
