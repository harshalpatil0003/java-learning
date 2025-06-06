package Doctors;

public class Orthologist extends Doctor {

	String spec;
	String organ;
	
	public Orthologist() {
		// TODO Auto-generated constructor stub
	}

	public Orthologist(String name, String degree, String hosp, int exp, double fees, String spec, String organ) {
		this.name=name;
		this.degree=degree;
		this.hosp = hosp;
		this.exp = exp;
		this.fees = fees;
		
		this.spec=spec;
		this.organ=organ;
	}
	public void displayOrthologist() {
		displayDoctor();
		
		System.out.println("Specialization: "+spec);
		System.out.println("Organ: "+organ);
	}
}
