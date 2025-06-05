package Aeroplane;

public class FighterJet extends Aeroplane {

	int gen;
	int seat;
	int range;
	String type;
	String refuel;
	
	public FighterJet() {
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String brand, double price, int fuelcap, int speed,
			int wt, int cap,int gen,int seat, int range,String type,String refuel) {
		this.brand=brand;
		this.price=price;
		this.fuelcap=fuelcap;
		this.speed=speed;
		this.wt=wt;
		this.cap=cap;
		
		this.gen = gen;
		this.seat = seat;
		this.range = range;
		this.type = type;
		this.refuel = refuel;
	}
	
	public void displayFighterJet() {
		displayAeroplane();
		System.out.println(gen);
		System.out.println(seat);
		System.out.println(range);
		System.out.println(type);
		System.out.println(refuel);
	}
}
