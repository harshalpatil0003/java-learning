import java.util.Scanner;
class KrishnamurthyNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int num=new Scanner(System.in).nextInt();
		if (isStrong(num))
		{
			System.out.println("it is strong num");
		}
		else
			System.out.println("it is not strong num");


	}
	public static boolean isStrong(int num)
	{
		int sum=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem=i%10;
			sum+=fact(rem);
		}
		return sum==num;
	}
	public static int fact(int num)
	{
		int fact=1;
		for (int i=num;i>0;i-- )
		{
			fact*=i;
		}
		return fact;
	}


}
