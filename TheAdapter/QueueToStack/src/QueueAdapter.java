
public class QueueAdapter implements Queue {
	Stack stack; 
	Queue queue; 
	
	
	public QueueAdapter(Stack stack) {
		this.stack=stack;
	}
	
	public QueueAdapter(Queue queue) {
		this.queue=queue;
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return stack.getSize();
	}

	@Override
	public boolean Empty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	@Override
	public void Enqueue(int value) {
		stack.push(value);
		
	}

	@Override
	public int Dequeue() {
		// TODO Auto-generated method stub
		return stack.pop();
	}
	


}
