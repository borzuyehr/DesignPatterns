
	public class Stack  {
		private int[] contents;
		private int top = 0;
		public int getSize() {return top;}
		public boolean isEmpty() {return top == 0;}
		public int pop() {return contents[--top];}
		public void push(int value) {contents[top++] = value;}
	}

