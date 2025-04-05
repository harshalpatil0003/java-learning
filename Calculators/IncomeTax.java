import java.util.Scanner;
class IncomeTax 
{
	public static void main(String[] args) 
	{
		System.out.print("Entyer income per annum: ");
		double income=new Scanner(System.in).nextDouble();

		if(income>=0 && income<=1200000){
			System.out.println("No need to pay income tax.");
		}
		else if(income>1200000 && income<=1600000){
			System.out.println("Total income tax to pay "+(income*0.15) +" Rs.");
		}
		else if(income>1600000 && income<=2000000){
			System.out.println("Total income tax to pay "+(income*0.20) +" Rs.");
		}
		else if(income>2000000 && income<=2400000){
			System.out.println("Total income tax to pay "+(income*0.25) +" Rs.");
		}
		else if(income>2400000){
			System.out.println("Total income tax to pay "+(income*0.30) +" Rs.");
		}
		else{
			System.out.println("Invalid Income Tax.");
		}

	}
}
