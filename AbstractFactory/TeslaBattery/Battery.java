import java.util.ArrayList;


public abstract class Battery {

	Cells cells;
	Casing casing;
	Controller controller;
	Charger charger;
	static Car car;
	ArrayList components = new ArrayList();
	
	abstract void build();
	
	void collectParts() {
		System.out.println("fetching components:");
	}
	void assembleParts() {
		System.out.println("assembling components");
	}
	void testParts(String type) {
		if (type.equals("Parts")) System.out.println("testing Parts");
		else System.out.println("Not Testing");
	}
	void testBattery(String type) {
		if (type.equals("Battery")) System.out.println("testing Battery");
		else System.out.println("Not Testing");
	}
	void ship() {
		System.out.println("Putting together all battery parts and shipping it with UPS");
	}
	public Car getName() {
		return car;
	}
	public static void setName(Car n) {
		car=n;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + car + " ----\n");
		if (cells != null) {
			result.append(cells);
			result.append("\n");
		}
		if (casing != null) {
			result.append(casing);
			result.append("\n");
		}
		if (charger != null) {
			result.append(charger);
			result.append("\n");
		}
		if (controller != null) {
			result.append(controller);
			result.append("\n");
		}
		return result.toString();
	}


}
