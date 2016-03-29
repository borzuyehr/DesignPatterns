
public class DeliveredPizzaState implements Pizza_State {

	private Pizza pizza;
	
	public DeliveredPizzaState(Pizza pizza) {
		  this.pizza = pizza;
	}

	public void bake() throws Exception {
		 throw new Exception("Pizza already baked!");
	}

	public void deliver() throws Exception {
		 throw new Exception("Pizza already delivered!");

	}

	public void undeliverable() throws Exception {
		 pizza.setState(pizza.getUnDeliveredState());
		
	}
}
