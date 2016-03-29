
public class BST_Test {

	static BST<String> tree = new BST<String>();
	static DisplayTree<String> output = new DisplayTree<String> (tree);
	
	public static void main(String[] args) {

		
		tree.insert("balls");
		tree.insert("star");
		tree.insert("candles");
		tree.insert("ruffles");
		tree.insert("ornament");
		tree.insert("dove");
		tree.insert("nutcracker");
		tree.insert("bell");
		tree.insert("bow");
		tree.insert("icicle");

		//Gives location of pointer to our BST
		System.out.println(tree);
		
		
		output.printInOrder ();

	}

}
