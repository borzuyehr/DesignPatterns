
public class Model3 extends Battery {
	BatteryComponentFactory componentFactory;
	
	public Model3(BatteryComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
	}
 
	void build() {
		System.out.println("Building " + Car.MODEL3);
		casing = componentFactory.createCasing();
		cells = componentFactory.createCells();
		charger = componentFactory.createCharger();
		controller = componentFactory.createController();
	}

}
