import java.util.Scanner;
class TempConverter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Temperature in Degree Celsius: ");
		double degree=sc.nextDouble();
		double fahrenheit=(9/5d)*degree+32;
		System.out.println("Temperature in Fahrenheit: "+fahrenheit+" F");
	}
}
