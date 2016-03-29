
public class Bitters extends IngredientsDecorator {
	
	public Bitters(Drink drink) {
		this.drink=drink;
	}
	
	public String getDescription () {
		return drink.getDescription() + ", Bitters";
	}
	
	public double calories() {
		return 30;
	}

}
