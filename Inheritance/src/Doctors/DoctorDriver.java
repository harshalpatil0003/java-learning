package Doctors;

public class DoctorDriver {

	public static void main(String[] args) {
		Cardiologist c1=new Cardiologist("Harsh", "MBBS","Poona Hospital", 6, 1000.0,"MD Cardiology", "Heart");
		c1.displayCardiologist();
		System.out.println("--------------------");
		
		Orthologist o1= new Orthologist("Harshal", "MBBS", "Birla Hospital", 8, 800.0,"MD Orthology","Bones");
		o1.displayOrthologist();
		System.out.println("--------------------");
		
		Neurologist n1=new Neurologist("Swanand", "MBBS", "Apollo Hospital", 12, 2000.0, "MD Neurology", "Brain");
		n1.displayNeurologist();
		
		
		
	}
}
