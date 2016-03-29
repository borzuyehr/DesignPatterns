
public class ModelX extends Battery {
	BatteryComponentFactory componentFactory;
	
	public ModelX(BatteryComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
	}
 
	void build() {
		System.out.println("Building " + Car.MODELX);
		casing = componentFactory.createCasing();
		cells = componentFactory.createCells();
		charger = componentFactory.createCharger();
		controller = componentFactory.createController();
	}

}
