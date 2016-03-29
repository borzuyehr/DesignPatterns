
public interface BatteryComponentFactory  {
    public Casing createCasing();
    public Cells createCells();
    public Charger createCharger();
    public Controller createController();
}
