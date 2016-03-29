
public class BakedPizzaState implements Pizza_State {

	
	private Pizza pizza;
	
	public BakedPizzaState(Pizza pizza) {
		System.out.print("Create baked pizza state");
		  this.pizza = pizza;
	}

	public void bake() throws Exception {
		 throw new Exception("Pizza already baked!");
	}

	public void deliver() throws Exception {
		System.out.print("Delivering the pizza...");
		 pizza.setState(pizza.getDeliveredState());
	}

	@Override
	public void undeliverable() throws Exception {
		 throw new Exception("Pizza not out for delivery yet!");
		
	}

}
