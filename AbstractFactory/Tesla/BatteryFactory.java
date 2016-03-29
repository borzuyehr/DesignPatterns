
public abstract class BatteryFactory {
	public  Battery orderBattery(Car type) {
		Battery battery = makeBattery(type);
		System.out.println("--- Making a " + battery.getName() + " ---");
		battery.build();
		battery.collectParts();
		battery.assembleParts();
		battery.testParts("Parts");
		battery.testBattery("Battery");
		battery.ship();
		return battery;
	}
	abstract Battery makeBattery(Car type);
}
