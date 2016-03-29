
public class CookedPizzaState implements Pizza_State {

	private Pizza pizza;
	
	public CookedPizzaState(Pizza pizza) {
		  this.pizza = pizza;
	}
	 
	public void bake() throws Exception {
		  System.out.print("Baking the pizza...");
		  pizza.setState(pizza.getBakedState());
	}

	public void deliver() throws Exception {
		  throw new Exception("Can't deliver a pizza not baked yet");
	}

	public void undeliverable() throws Exception {
		 throw new Exception("Pizza not baked or delivered yet");
		
	}
}