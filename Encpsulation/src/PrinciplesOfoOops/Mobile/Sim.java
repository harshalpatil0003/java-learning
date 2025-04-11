package PrinciplesOfoOops.Mobile;

public class Sim {
	String serviceProvider;
	String networkType;
	String type;
	long simno;
	
	public Sim() {}
	
	public Sim(String netProvider,String netType,String type,long simno) {
	serviceProvider=netProvider;
	networkType=netType;
	this.type=type;
	this.simno=simno;
	}
	
	public void displaySim() {
		System.out.println("Service Provider: "+serviceProvider);
		System.out.println("Network Type: "+networkType);
		System.out.println("Sim Type: "+type);
		System.out.println("Sim no: "+simno);
	}
}
