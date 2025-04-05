import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter year: ");
		int year=new Scanner(System.in).nextInt();

		if((year%4==0 && year%100!=0) || (year%400==0)){
			System.out.println(year+" is a leap year.");
		}
		else{
			System.out.print(year+" is not leap year.");
		}
	}
}
