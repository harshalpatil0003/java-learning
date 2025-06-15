package PrinciplesOfoOops.Mobile;

public class MobileDriver {
public static void main(String[] args) {
	Mobile m1=new Mobile("Samsung",35000.0,"S21","5G");
	
	m1.displayMobile();
	m1.insertSim("Airtel","5G","Prepaid",123654789l);

}
}
