
public class UndeliverableState implements Pizza_State {

	private Pizza pizza;
	
	public UndeliverableState(Pizza pizza) {
		  this.pizza = pizza;
	}

	public void bake() throws Exception {
		 throw new Exception("Pizza already baked!");
	}

	@Override
	public void deliver() throws Exception {
		 throw new Exception("Pizza couldn't be delivered!");
	}

	@Override
	public void undeliverable() throws Exception {
		 throw new Exception("Pizza already in undeliverable state!");

	}

}
