import java.util.Scanner;
class MinToYears 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Minutes: ");
		long inMin=new Scanner(System.in).nextLong();
		
		long minYear =(365*24*60);
		long years= inMin/minYear;
		long remMin=inMin % minYear;
		long minDay=24*60;
		long days=remMin/minDay;

		System.out.println(years + " Years and " + days+ " Days");


	}
}
