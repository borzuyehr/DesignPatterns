import java.util.Stack;

public class TreeIterator<T> implements Iterator<T> {

	Stack<Node<T>> stk = new Stack<Node<T>>();
	Node<T> root;
	
    public TreeIterator(Node<T> root)
    {
    	this.root = root;
       if(root != null) stk.push(root);
    }
    public boolean hasNext()
    {
       return !stk.isEmpty();
    }

    public T next()
    {
       Node<T> cur = stk.peek();
       if(cur.left != null)
       {
          stk.push(cur.left);
       }
       else
       {
          Node<T> tmp = stk.pop();
          while( tmp.right == null )
          {
             if(stk.isEmpty()) return cur.data;
             tmp = stk.pop();
          }
          stk.push(tmp.right);
       }

       return cur.data;
    }
}
