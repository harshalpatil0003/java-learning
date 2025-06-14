package supercall;

public class Son extends Father {

	String name="Juju";
	
	public void displayName() {
		System.out.println("Son Name: "+name);
	}
	
	public void displayFatherSonDetails() {
		System.out.println(name);
		System.err.println(super.name);
		displayName();
		super.displayName();
	}
}
