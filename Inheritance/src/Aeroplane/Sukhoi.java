package Aeroplane;

public class Sukhoi extends FighterJet {
	String model;
	String weapons;
	String country;
	String service;
	int years;
	
	public Sukhoi() {
		// TODO Auto-generated constructor stub
	}
	public Sukhoi(String brand, double price, int fuelcap, int speed,
			int wt, int cap,int gen,int seat, int range,String type,
			String refuel,String model, String weapons, String country, String service, int years) {
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
		
		this.model = model;
		this.weapons = weapons;
		this.country = country;
		this.service = service;
		this.years = years;
	}
	
	public void displaySukhoi() {
		displayFighterJet();
		
		System.out.println(model);
		System.out.println(weapons);
		System.out.println(country);
		System.out.println(service);
		System.out.println(years);
	}

}
