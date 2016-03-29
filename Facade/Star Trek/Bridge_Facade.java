
public class Bridge_Facade {
	WarpCore wc;
	PlasmaConduits pc;
	DilithiumChamber dc;
	AntimatterEngine ae;
	
	public Bridge_Facade(WarpCore wc, PlasmaConduits pc, DilithiumChamber dc, AntimatterEngine ae){
		this.wc=wc;
		this.pc=pc;
		this.dc=dc;
		this.ae=ae;
	}
	
	public void startEnterprise() {
		pc.on();
		dc.on();
		ae.calibrate();
	}
}
