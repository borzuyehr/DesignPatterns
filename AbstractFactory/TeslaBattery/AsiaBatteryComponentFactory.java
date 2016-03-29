
public class AsiaBatteryComponentFactory implements BatteryComponentFactory {

	public Casing createCasing() {
		if (Battery.car== Car.MODELS){
			return new AluminumCasing ();
			}
		if (Battery.car== Car.MODELX){
			return new KevlarCasing ();
			}
		if (Battery.car== Car.MODEL3){
			return new BambooCasing ();
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
			return new TwoTwentyCharger ();
			}
		if (Battery.car== Car.MODELX){
			return new TwoTwentyCharger ();
			}
		if (Battery.car== Car.MODEL3){
			return new PedalCharger ();
			}
		return null;
	}
	@Override
	public Controller createController() {
		if (Battery.car== Car.MODELS){
			return new XiaomiController ();
			}
		if (Battery.car== Car.MODELX){
			return new XiaomiV2 ();
			}
		if (Battery.car== Car.MODEL3){
			return new RasberryPi ();
			}
		return null;
	}

}
