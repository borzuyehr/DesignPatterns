import java.util.ArrayList;
import java.util.Iterator;

public class Object extends Object_Component {
	Iterator iterator=null;

	ArrayList<Object_Component> child_components = new ArrayList<Object_Component>();
    
	public void render() {
        for (Object_Component o : child_components) {
            o.render();
        }
	}
	
	public float volume() {
		float total = 0;
		 for (Object_Component o : child_components) {
	            total+=o.volume();
	        }
		return total;
	}

    //Adds the graphic to the composition.
    public void add(Object_Component o) {
    	child_components.add(o);
    }
 
    //Removes the graphic from the composition.
    public void remove(Object_Component o) {
    	child_components.remove(o);
    }

	public Iterator createIterator() {
		if (iterator==null) {
			iterator = new CompositeIterator(child_components.iterator());
		}
		return iterator;
	}
 
}