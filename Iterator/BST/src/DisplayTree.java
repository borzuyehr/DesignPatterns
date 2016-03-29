
public class DisplayTree<T> {
	private BST<T> binarySearchTree;
	
	public DisplayTree (BST<T> b) {
		this.binarySearchTree = b;
	}
	
	 void printInOrder() {
		Iterator<T> TreeIterator = binarySearchTree.createIterator();
		System.out.println("The Tree In Order:");
		printTheTree(TreeIterator);
	}
	
	private void printTheTree(Iterator<T> iterator) {
		while (iterator.hasNext()) {
		    System.out.print(iterator.next() + ", ");
		}
	}
}
