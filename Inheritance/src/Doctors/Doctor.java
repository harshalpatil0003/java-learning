package Doctors;

public class Doctor {

	String name;
	String degree;
	String hosp;
	int exp;
	double fees;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name, String degree, String hosp, int exp, double fees) {
		super();
		this.name = name;
		this.degree = degree;
		this.hosp = hosp;
		this.exp = exp;
		this.fees = fees;
	}
	public void displayDoctor() {
		System.out.println("Name: "+name);
		System.out.println("Degree: "+degree);
		System.out.println("Hospital: "+hosp);
		System.out.println("Experience: "+exp);
		System.out.println("Fees: "+fees);
	}
}
