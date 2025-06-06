package Doctors;

public class Cardiologist extends Doctor{

	String spec;
	String organ;
	
	public Cardiologist() {
		// TODO Auto-generated constructor stub
	}

	public Cardiologist(String name, String degree, String hosp, int exp, double fees, String spec, String organ) {
		this.name=name;
		this.degree=degree;
		this.hosp = hosp;
		this.exp = exp;
		this.fees = fees;
		
		this.spec=spec;
		this.organ=organ;
	}
	public void displayCardiologist() {
		displayDoctor();
		
		System.out.println("Specialization: "+spec);
		System.out.println("Organ: "+organ);
	}
	
}
