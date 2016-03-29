
public class USABatteryComponentFactory implements BatteryComponentFactory {


	public Casing createCasing() {
		if (Battery.car== Car.MODELS){
			return new AluminumCasing ();
			}
		if (Battery.car== Car.MODELX){
			return new KevlarCasing ();
			}
		if (Battery.car== Car.MODEL3){
			return new ParticleCasing ();
			}
		return null;
	}

	public Cells createCells() {
		if (Battery.car== Car.MODELS){
			return new LithiumCells ();
			}
		if (Battery.car== Car.MODELX){
			return new DualCarbonCells ();
			}
		if (Battery.car== Car.MODEL3){
			return new LeadCells ();
			}
		return null;
	}
	@Override
	public Charger createCharger() {
		if (Battery.car == Car.MODELS){
			return new OneTenCharger ();
			}
		if (Battery.car== Car.MODELX){
			return new OneTenCharger ();
			}
		if (Battery.car== Car.MODEL3){
			return new HandcrankCharger ();
			}
		return null;
	}
	@Override
	public Controller createController() {
		if (Battery.car== Car.MODELS){
			return new ArduinoController ();
			}
		if (Battery.car== Car.MODELX){
			return new ArduinoV2 ();
			}
		if (Battery.car== Car.MODEL3){
			return new RasberryPi ();
			}
		return null;
	}
}
