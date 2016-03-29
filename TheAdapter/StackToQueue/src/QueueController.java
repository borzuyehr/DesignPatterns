
public class QueueController implements Queue {
	private int[] content;
	private int tops = 0;
	
	public int Size() {
		// TODO Auto-generated method stub
		return tops;
	}

	
	public boolean Empty() {
		return tops == 0;
	}

	@Override
	public void Enqueue(int value) {
		content[tops++] = value;
	}

	@Override
	public int Dequeue() {
		return content[--tops];
	}

}
