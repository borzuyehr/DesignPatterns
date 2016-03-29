
public class Cherry extends IngredientsDecorator {
	

	public Cherry(Drink drink) {
		this.drink=drink;
	}
	
	public String getDescription () {
		return drink.getDescription() + ", Cherry";
	}
	
	public double calories() {
		return 40;
	}

}
