package PrinciplesOfoOops.Pen;

public class Refill {
	String color;
	String type;
	double size;
	
	public Refill() {
		// TODO Auto-generated constructor stub
	}
	public Refill(String color,String type,double size) {
		this.color=color;
		this.type=type;
		this.size=size;
	}
	
	public void displayRefill() {
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
		System.out.println("Size: "+size);
	}
}
