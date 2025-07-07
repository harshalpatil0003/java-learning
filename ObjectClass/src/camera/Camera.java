package camera;

public class Camera {

	String brand;
	double price;
	int mp;
	int ports;
	boolean nightmode;
	
	public Camera() {
		// TODO Auto-generated constructor stub
	}
	
	public Camera(String brand, double price, int mp,int ports,boolean nightmode) {
		this.brand=brand;
		this.price=price;
		this.mp=mp;
		this.ports=ports;
		this.nightmode=nightmode;
	}
	
	// override toString() method
	public String toString() {
		return "[Brand: "+brand+", Price: "+price+", MP: "+mp+", Ports: "+ports+", Nightmode: "+nightmode+"]";
	}
	
	// override equals() method
	public boolean equals(Object o) {
		if (o!=null) {
			
			Camera c=(Camera)o;
			return this.brand==c.brand && this.price==c.price && this.mp==c.mp && this.ports==c.ports && this.nightmode==c.nightmode;
		}
		return false;
		
	}
	
	// override hashCode() method
	public int hashCode() {
		return brand.hashCode()+Double.hashCode(price)+mp+ports+Boolean.hashCode(nightmode);
	}
}
