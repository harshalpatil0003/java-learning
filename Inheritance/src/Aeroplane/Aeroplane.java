package Aeroplane;

public class Aeroplane {
	String brand;
	double price;
	int fuelcap;
	int speed;
	int wt;
	int cap;
	
	public Aeroplane() {
		// TODO Auto-generated constructor stub
	}

	public Aeroplane(String brand, double price, int fuelcap, int speed, int wt, int cap) {
		super();
		this.brand = brand;
		this.price = price;
		this.fuelcap = fuelcap;
		this.speed = speed;
		this.wt = wt;
		this.cap = cap;
	}
	
	public void displayAeroplane() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(fuelcap);
		System.out.println(speed);
		System.out.println(wt);
		System.out.println(cap);
	}
	
}
