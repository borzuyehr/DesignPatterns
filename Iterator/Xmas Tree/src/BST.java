
public class BST <T>{

	
	   public Node<T> root;

	   public BST()
	   {
	      root = null;
	   }
	   
	   public void insert(T data)
	   {
	      root = insert(root, data);
	   }
	   
	   public Node<T> insert(Node<T> p, T toInsert)
	   {
	      if (p == null)
	         return new Node<T>(toInsert);

	      if (p.left != null)
	         p.left = insert(p.left, toInsert);
	      
	      else
	         p.right = insert(p.right, toInsert);

	      return p;
	   }
	   
		public Iterator<T> createIterator() {
			return new TreeIterator<T>(root);
		}
}
