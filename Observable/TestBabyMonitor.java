
public class TestBabyMonitor {
	public static void main(String[] args) {
				BabyData marla = new BabyData("marla");
				// one monitor with one baby
				BabyMonitorSimple livingRoom = new BabyMonitorSimple(marla, "livingroom");
				marla.setData(true, 1);
				// one monitor listening to two babies
				BabyData lilian = new BabyData("lilian");
				BabyMonitorAdvanced kitchen = new BabyMonitorAdvanced("kitchen", marla, lilian);
				marla.setData(true, 2);
				lilian.setData(true,1);
			}
	}
