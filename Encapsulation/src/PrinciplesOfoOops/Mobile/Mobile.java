package PrinciplesOfoOops.Mobile;

public class Mobile {
	String brand;
	double price;
	String name;
	String type;
	Sim s;
	
	public Mobile() {}
	
	public Mobile(String brand, double price, String name, String type) {
		this.brand=brand;
		this.price=price;
		this.type=type;
		this.name=name;
	}
	
	public void insertSim(String networkProvider,String networkType,String type, long simno) {
		s=new Sim(networkProvider,networkType,type,simno);
		System.out.println("Sim Inserted! ");
		s.displaySim();
	}
	
	public void displayMobile() {
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}
}
