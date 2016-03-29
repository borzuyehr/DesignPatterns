import java.util.Iterator;


public abstract class Object_Component {

	public void add(Object_Component objectComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(Object_Component menuComponent) {
		throw new UnsupportedOperationException();
	}
	public Object_Component getChild(int i) {
		throw new UnsupportedOperationException();
	}
  	
	public void render() {
		throw new UnsupportedOperationException();
	}
	public float volume() {
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator createIterator();
	
}
