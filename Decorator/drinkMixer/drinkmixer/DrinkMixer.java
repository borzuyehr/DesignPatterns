
public class DrinkMixer {
	public static void main(String[] args) {
		Drink manhattan= new Bourbon();
		manhattan = new Cherry(manhattan);
		manhattan = new Bitters(manhattan);
		manhattan = new Bitters(manhattan);
		System.out.println("Manhattan has: " + manhattan.getDescription() + " -  " + manhattan.calories() + " calories");
	}

}
