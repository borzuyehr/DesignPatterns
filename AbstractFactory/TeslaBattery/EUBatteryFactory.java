public class EUBatteryFactory extends BatteryFactory {
	protected Battery makeBattery(Car item) {
		Battery battery=null;
		BatteryComponentFactory componentFactory = new EUBatteryComponentFactory();
		if (item.equals(Car.MODELS)) {
			battery=new ModelS(componentFactory);
			Battery.setName(Car.MODELS);
		}
		else if (item.equals(Car.MODELX)) {
			battery=new ModelX(componentFactory);
			Battery.setName(Car.MODELX);
		}
		else if (item.equals(Car.MODEL3)) {
			battery=new Model3(componentFactory);
			Battery.setName(Car.MODEL3);
		}
		return battery;
	}
}
