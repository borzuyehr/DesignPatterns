public class ControllerTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueController tester = new QueueController();
		tester.Enqueue(1);
		tester.Enqueue(1);
		tester.Dequeue();
		int size = tester.Size();
		System.out.print(size);
		}
}
