
public class ModelS extends Battery {
	BatteryComponentFactory componentFactory;
	
	public ModelS(BatteryComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
	}
 
	void build() {
		System.out.println("Building " + Car.MODELS);
		casing = componentFactory.createCasing();
		cells = componentFactory.createCells();
		charger = componentFactory.createCharger();
		controller = componentFactory.createController();
	}
}
