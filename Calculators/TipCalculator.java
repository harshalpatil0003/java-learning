import java.util.Scanner;
class  TipCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter subtotal: ");
		float subTotal=sc.nextFloat();

		System.out.print("Enter gratuity rate: ");
		float gratuity=sc.nextFloat();

		float tip=(subTotal*gratuity)/100;
		float total=subTotal+tip;

		System.out.println("tip is: "+tip);
		System.out.println("total is: "+total);



	}
}
