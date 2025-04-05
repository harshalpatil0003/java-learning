import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Base Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print("Enter Power Number: ");
		int pow=new Scanner(System.in).nextInt();
		System.out.println(power(num,pow));
	}
	public static int power(int num,int pow)
	{
		if (pow==0)
		{
			return 1;
		}
		return num*power(num,pow-1);
	}
}
