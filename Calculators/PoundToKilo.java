import java.util.Scanner;
class  PoundToKilo
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Weight in Pounds: ");
		float pounds=new Scanner(System.in).nextFloat();
		float kilo=pounds*0.454f;
		 System.out.println("Weight in Kilograms: "+kilo);

	}
}
