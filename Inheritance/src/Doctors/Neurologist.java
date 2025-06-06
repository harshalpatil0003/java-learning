package Doctors;

public class Neurologist extends Doctor {

	String spec;
	String organ;
	
	public Neurologist() {
		// TODO Auto-generated constructor stub
	}

	public Neurologist(String name, String degree, String hosp, int exp, double fees, String spec, String organ) {
		this.name=name;
		this.degree=degree;
		this.hosp = hosp;
		this.exp = exp;
		this.fees = fees;
		
		this.spec=spec;
		this.organ=organ;
	}
	public void displayNeurologist() {
		displayDoctor();
		
		System.out.println("Specialization: "+spec);
		System.out.println("Organ: "+organ);
	}
}
